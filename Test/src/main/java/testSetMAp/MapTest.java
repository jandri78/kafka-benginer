package testSetMAp;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.telintel.services.taf.integration.dto.referralprogram.ReferralProgramShareChannelDTO;
import com.telintel.services.taf.integration.dto.referralprogram.SmsShareChannelDTO;
import com.telintel.services.taf.integration.dto.referralprogram.WhatsappShareChannelDTO;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userMessage = "probando SMS: #SMS# y whatsapp: #WHATSAPP#";

		// ESTO SE CARGA DESDE BASE DE DATOS (COMO LO VE EL USUARIO vs COMO ESTA
		// INTERNAMENTE)
		Map<String, String> userHeader = new HashMap<String, String>();
		userHeader.put("#SMS#", "#smsShareChannel.content#");
		userHeader.put("#WHATSAPP#", "#whatsappShareChannel.content#");

		ReferralProgramShareChannelDTO channel = new ReferralProgramShareChannelDTO();
		channel.setSmsShareChannel(new SmsShareChannelDTO());
		channel.getSmsShareChannel().setContent("Esto es desde SMS");

		channel.setWhatsappShareChannel(new WhatsappShareChannelDTO());
		channel.getWhatsappShareChannel().setContent("Esto es desde WHATSAPP");

		Map<String, String> customFields = new HashMap<String, String>();
		mapping(customFields, channel, null);
		System.out.println(customFields);

		for (Entry<String, String> customField : userHeader.entrySet()) {
			if (userMessage.contains(customField.getKey())) {
				userMessage = userMessage.replaceAll(customField.getKey(), customFields.get(customField.getValue()));
			}
		}
		System.out.println("mensaje final a enviar: " + userMessage);
		
		System.out.println(userHeader);
		

	}

	private static Gson gson = new Gson();

//	private static Logger logger = LoggerFactory.getLogger(ReflectionUtils.class);

	public static void mapping(Map<String, String> map, Object obj, String prefix) {

		JsonElement jsonElement = obj instanceof JsonElement ? (JsonElement) obj : gson.toJsonTree(obj);

		jsonElement.getAsJsonObject().entrySet().forEach(entry -> {
			try {
				if (entry.getValue().isJsonObject()) {
					mapping(map, entry.getValue(), (Objects.nonNull(prefix) ? prefix + "." : "") + entry.getKey());
				} else {
					String customField = "#" + (Objects.nonNull(prefix) ? prefix + "." : "") + entry.getKey() + "#";
					map.put(customField, entry.getValue().getAsString());
					System.out.println("key: " + customField + ", value: " + map.get(customField));
				}
			} catch (Exception e) {
				// logger.error(tId + " - error: " + e.getMessage() + ", key: " +
				// entry.getKey());
			}
		});

	}
}

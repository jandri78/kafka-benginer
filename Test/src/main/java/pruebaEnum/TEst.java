package pruebaEnum;

import java.util.HashMap;
import java.util.Map;

public class TEst implements Ienum {

	private enum DefaultPixelTemplate {

		RIGTH_BUTTON_TEMPLATE("pixel_templates/refferal_button.js"),
		WIDGET_TOP_BAR_TEMPLATE("pixel_templates/widget_top_bar.js"),
		WIDGET_POST_PURCHASE_TEMPLATE("pixel_templates/post-purchase-modal.js"),
		WELCOME_MODAL_SCRIPT_TEMPLATE("pixel_templates/welcome-modal.js"),
		REFFERAL_PAGE_TEMPLATE("pixel_templates/referral_page.html");

		private String pixelTemplate;

		DefaultPixelTemplate(String pixelTemplate) {
			this.pixelTemplate = pixelTemplate;
		}

		public String getPixelTemplate() {
			return pixelTemplate;
		}

	}

	@Override
	public String getRoute(String type) {

		String location = null;

		Map<String, String> mapa = new HashMap<String, String>();
		mapa.put(DefaultPixelTemplate.RIGTH_BUTTON_TEMPLATE.name(),
				DefaultPixelTemplate.RIGTH_BUTTON_TEMPLATE.getPixelTemplate());
		mapa.put(DefaultPixelTemplate.WIDGET_TOP_BAR_TEMPLATE.name(),
				DefaultPixelTemplate.WIDGET_TOP_BAR_TEMPLATE.getPixelTemplate());
		mapa.put(DefaultPixelTemplate.WIDGET_POST_PURCHASE_TEMPLATE.name(),
				DefaultPixelTemplate.WIDGET_POST_PURCHASE_TEMPLATE.getPixelTemplate());
		mapa.put(DefaultPixelTemplate.WELCOME_MODAL_SCRIPT_TEMPLATE.name(),
				DefaultPixelTemplate.WELCOME_MODAL_SCRIPT_TEMPLATE.getPixelTemplate());
		mapa.put(DefaultPixelTemplate.REFFERAL_PAGE_TEMPLATE.name(),
				DefaultPixelTemplate.REFFERAL_PAGE_TEMPLATE.getPixelTemplate());

		location = mapa.get(type);

		return location;

	}

}

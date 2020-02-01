package testSetMAp;

import java.util.HashMap;
import java.util.Map;

public class TEstMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MapBasic map = new MapBasic();
		
		
		String baseHtml = "element.innerHTML = '<div style=\"position: fixed;top: 88%;\"> <div style=\"position: fixed; left: 19px; min-height: 40px; cursor: pointer; z-index: 999999999;\"><span onclick=\"refferalButtonClicked();\" style=\"background-repeat: no-repeat; background-image: var(--logo);background-size: 65px;overflow: hidden; font-weight: bold; text-overflow: ellipsis; white-space: normal; display: inline-block; line-height: 22px; height: 71px; border-radius: 50px; width: 70px;\"></span></div> <a target=\"_blank\" href=\"#SHOPIFY_REFFRAL_PAGE#\" style=\"display:flex; text-decoration: none;color: unset; -webkit-transition: width 1s;transition: width 1s; max-width: 400px; box-shadow: 1px 2px 18px #d3d3d3; display: inline-block; border-radius: 0 50px 50px 0; overflow: hidden; background-color: white; position: fixed; left: 50px; min-height: 40px; cursor: pointer; z-index: -1; height: 63px;\"> <div style=\" display: flex;flex-direction: column; height: 100%; justify-content: center; \"><span style=\"box-sizing: border-box;padding-right:60px;width: 100%;line-height: 18px; padding-left: 50px;display: inline;text-overflow: ellipsis;font-weight: bold;\">#REFFRAL_BUTTON_TEXT#</span></div> <span style=\" height:20px; width:20px; position: absolute; right: 30px; top: 23px; background-image: var(--gift-logo);background-repeat: no-repeat; background-size: 20px;\"></span> </a></div>';";

		Map<String, String> valuesToReplace = new HashMap<String, String>();
		valuesToReplace.put("#SHOPIFY_REFFRAL_PAGE#", "https://default.tellafriend.club/signup?rid=5e220dd9f99396000885c2f4");
		valuesToReplace.put("#REFFRAL_BUTTON_TEXT#","Refer Here!");
		valuesToReplace.put("#REDIRECTION_URL#", "adios");
		
		System.out.println(map.replaceHTML(valuesToReplace, baseHtml));
		
	}

}

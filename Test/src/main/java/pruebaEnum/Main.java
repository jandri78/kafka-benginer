package pruebaEnum;

public class Main {

	private enum Enumforlisting {

		RIGTH_BUTTON_TEMPLATE, WIDGET_TOP_BAR_TEMPLATE, WIDGET_POST_PURCHASE_TEMPLATE, WELCOME_MODAL_SCRIPT_TEMPLATE,
		REFFERAL_PAGE_TEMPLATE;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TEst enu = new TEst();

		System.out.println(enu.getRoute(Enumforlisting.WIDGET_POST_PURCHASE_TEMPLATE.name()));

	}

}

package pruebas;

import java.util.Locale;


public enum AdvocateStatus   {

	ACTIVE("Active", "Activo", "Activo"), INACTIVE("Inactive", "Inactivo", "Inactivo");

	private String es;
	private String en;
	private String pt;

	AdvocateStatus(String en, String es, String pt) {
		this.en = en;
		this.es = es;
		this.pt = pt;
	}



}
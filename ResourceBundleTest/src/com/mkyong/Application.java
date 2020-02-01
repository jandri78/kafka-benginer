package com.mkyong;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Application {

	public static void main(String[] args) throws FileNotFoundException, IncorrectFileNameException, DripsParserException {

		ResourceBundle mybundle = ResourceBundle.getBundle("lib/exceptions",new Locale("ml"));
		System.out.println(mybundle.getString("how_are_you"));

		String cadena;
		String fileName= "/home/andres/Escritorio/GDRPs";
		try {
			FileReader f = new FileReader(fileName);
			BufferedReader b = new BufferedReader(f);
			
			while ((cadena = b.readLine()) != null) {
				System.out.println(cadena);
			}
			b.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			DripsParserException aa =new DripsParserException(
					DripsErrorCodes.GENERAL_EXCEPTION,"en");
		        throw aa;
		    
		}
		


	}

}

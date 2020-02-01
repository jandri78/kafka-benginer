package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		final String regex = ".@[a-z]*.[a-z]*";
//
//		final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
//
////		System.out.println(matcher.find());
////		
////		while (matcher.find()) {
////		    System.out.println("Full match: " + matcher.group(0));
////		    for (int i = 1; i <= matcher.groupCount(); i++) {
////		        System.out.println("Group " + i + ": " + matcher.group(i));
////		    }
////		}
//
//		try {
//			Scanner input = new Scanner(new File("/home/andres/emails"));
//			while (input.hasNextLine()) {
//				String line = input.nextLine();
//				final Matcher matcher = pattern.matcher(line);
//				if (!matcher.find()) {
//					System.out.println(line);
//				}
//
//			}
//			input.close();
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}

		try (Scanner sc = new Scanner(new File("/home/andres/emails"))) {

			File file = new File("/home/andres/emailsresult");

			FileWriter escribir = new FileWriter(file, true);

			List<String> numbers = new ArrayList<>();

			while (sc.hasNext()) {
				numbers.add(sc.nextLine());
			}

			List<String> filtered = numbers.stream().distinct().collect(Collectors.toList());

			for (String string : filtered) {
				escribir.write(string+"\n");
			}
			escribir.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

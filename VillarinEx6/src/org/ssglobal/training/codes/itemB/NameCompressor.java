package org.ssglobal.training.codes.itemB;

import java.util.Scanner;
import java.util.StringTokenizer;

public class NameCompressor {
	private String[] names = new String[0];

	public void compress() {
		Scanner sc = new Scanner(System.in);
	
		while (true) {
			String name = sc.nextLine();

			String[] temp = new String[names.length + 1];

			for (int i = 0; i < names.length; i++) {
				temp[i] = names[i];
			}
			temp[temp.length - 1] = name.trim();
			names = temp;

			if (name.equalsIgnoreCase("ZZZ")) {
				for (int i = 0; i < name.length(); i++) {
					StringTokenizer tokenizer = new StringTokenizer(names[i], " ");
					String[] splitNames = new String[tokenizer.countTokens()];
					
					for (int j = 0; j < splitNames.length; j++) {
						splitNames[j] = tokenizer.nextToken();
					}
					
					String lastName = splitNames[splitNames.length - 1];
					String initials = "";

					for (int j = 0; j < splitNames.length - 1; j++) {
						initials += splitNames[j].charAt(0) + ". ";
					}
					
					if (initials.equals("")) {
						System.out.println("%s".formatted(lastName));
					} else {
						System.out.println("%s, %s".formatted(lastName, initials.toUpperCase()));
					}
				}
				break;
			}
		}
		sc.close();
	}
}

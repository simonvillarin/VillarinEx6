package org.ssglobal.training.codes.itemB;

import java.util.Scanner;

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
					String[] splitNames = names[i].split(" ");
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

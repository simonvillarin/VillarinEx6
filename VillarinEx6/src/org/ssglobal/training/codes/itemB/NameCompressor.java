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
			temp[temp.length - 1] = name;
			names = temp;

			if (name.equalsIgnoreCase("ZZZ")) {
				for (int i = 0; i < name.length(); i++) {
					String[] splitNames = names[i].split(" ");
					String lastName = splitNames[0];
					String initials = "";

					for (int j = 1; j < splitNames.length; j++) {
						initials += splitNames[j].charAt(0) + ". ";
					}
					
					if (initials.equals("")) {
						System.out.println("%s".formatted(lastName));
					} else {
						System.out.println("%s, %s".formatted(lastName, initials));
					}
				}
				break;
			}
		}
		sc.close();
	}
}

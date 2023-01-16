package org.ssglobal.training.codes.itemD;

public class TestSeason {

	public static void main(String[] args) {
		Season s = new Season();
		System.out.println(s.season(2023, 1, 16));
		System.out.println(s.season(2022, 4, 12));
		System.out.println(s.season(2021, 6, 22));
		System.out.println(s.season(2024, 11, 5));
	}

}

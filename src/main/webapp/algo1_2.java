package freePrac;

import java.util.Scanner;

public class p1_2 {

	public static void main(String[] args) {

		int count = 0;
		int index = numStr();

		String a = "Hello ";

		while (true) {

			a = a + inputWord();

			if (count == index - 1) {
				a += ".";
				break;
			}
			a += ",";
			count++;
		}

		System.out.println(a);

	}

	public static int numStr() {

		Scanner sc1 = new Scanner(System.in);
		int size = sc1.nextInt();

		return size;
	}

	public static String inputWord() {

		Scanner sc2 = new Scanner(System.in);
		String name = sc2.nextLine();

		return name;
	}

}

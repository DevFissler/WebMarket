package freePrac;

import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {

		int count = 0;
		int index = numStr();

		String[] target = new String[index];

		while (true) {

			target[count] = inputWord();

			if (count == index - 1) {
				break;
			}
			count++;
		}

		int size = target.length;

		printWord(target, size);

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

	public static void printWord(String[] arr, int arrSize) {

		System.out.print("Hello ");

		for (int i = 0; i < arrSize; i++) {
			if (i == arrSize - 1) {
				System.out.print(arr[i] + ".");
				break;
			}
			System.out.print(arr[i] + ",");
		}
	}
}

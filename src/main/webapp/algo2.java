package freePrac;

import java.util.ArrayList;
import java.util.Scanner;

public class algo2 {

	public static void main(String[] args) {

		ArrayList<Double> ar = new ArrayList<Double>();

		Scanner sc = new Scanner(System.in);
		String infoStr = sc.next();

		String[] info = new String[3];
		info = infoStr.split(" ");

		Scanner sc1 = new Scanner(System.in);
		int count = sc1.nextInt();

		int i = 0;
		while (true) {
			String[] locaInfoX = new String[count * 2];
			Scanner sc2 = new Scanner(System.in);
			locaInfoX = sc2.nextLine().split(" ");
			ar.add(Double.parseDouble(locaInfoX[0]));
			ar.add(Double.parseDouble(locaInfoX[1]));

			if (i == count - 1) {
				break;
			}
			i++;
		}

		for (int index = 0; index < count * 2; index = index + 2) {

			if ((Math.pow(ar.get(index) - Integer.parseInt(info[0]), 2))
					+ (Math.pow(ar.get(index + 1) - Integer.parseInt(info[1]), 2)) >= Math
							.pow(Integer.parseInt(info[2]), 2)) {
				System.out.println("silent");
			} else {
				System.out.println("noisy");
			}
		}
	}
}
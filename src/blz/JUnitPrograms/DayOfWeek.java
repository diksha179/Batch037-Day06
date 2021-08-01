package blz.JUnitPrograms;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		boolean keepGoing = true;
		while (keepGoing) {
			System.out.println("Month:");
			int m = SC.nextInt();
			if (m < 1 || m > 12) {
				System.out.println("Months are between 1 and 12");
				continue;
			}
			System.out.println("Day:");
			int d = SC.nextInt();
			if (d < 1 || d > 31) {
				System.out.println("Days are between 1 and 31");
				continue;
			}
			System.out.println("Year:");
			int y = SC.nextInt();
			if (y < -10000 || y > 10000) {
				System.out.println("Years are between -10000 and 10000");
				continue;
			}
			int y0 = y - (14 - m) / 12;
			int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
			int m0 = m + 12 * ((14 - m) / 12) - 2;
			int d0 = (d + x + 31 * m0 / 12) % 7;
			if (d0 == 0) {
				String b = "Sunday";
				System.out.println("Sunday");
			} else {
				if (d0 == 1) {
					String b = "Monday";
					System.out.println("Monday");
				} else {
					if (d0 == 2) {
						String b = "Tuesday";
						System.out.println("Tuesday");
					} else {
						if (d0 == 3) {
							String b = "Wednesday";
							System.out.println("Wednesday");
						} else {
							if (d0 == 4) {
								String b = "Thursday";
								System.out.println("Thursday");
							} else {
								if (d0 == 5) {
									String b = "Friday";
									System.out.println("Friday");
								} else {
									if (d0 == 6) {
										String b = "Saturday";
										System.out.println("Saturday");
										SC.close();
									}
								}
							}
						}
					}
				}
			}

		}
	}
}

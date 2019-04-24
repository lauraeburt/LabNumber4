import java.util.Scanner;

public class SquaresCubes {

	public static void main(String[] args) {
		// Lab 4 Table of Powers
		// Laura Burt
		// Grand Circus 2019

		// Call scanner and greet user
		Scanner scan = new Scanner(System.in);
		System.out.println("Learn your squares and cubes!");
		System.out.println("Please enter your first name:");
		String userName = scan.next();

		

		// Ask for user input of integer
		int userInteger;

		String cont = "yes";
		while (cont.equalsIgnoreCase("yes")) {

			// Main Loop Body
			System.out.println(userName + "," + " Please enter an integer greater than or equal to one:");
			userInteger = scan.nextInt();
			for (int i = 1; i <= userInteger; i++) {    // 1.initial value is 1
														// 2. program will check userInteger
														// 3. adds "1" to the i every time

				System.out.println(i * 1 + " " + i * i + " " + i * i * i);

			}
			System.out.println("Do you wnat to continue? (yes/no)");
			cont = scan.next();
			
		}
		System.out.println("Goodbye!");
		scan.close();
	}
}

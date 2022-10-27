package shapes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		int userChoice;
		do {
			System.out.println("Your options are:");
			System.out.println("1. Create a shape");
			System.out.println("2. View a shape");
			System.out.println("3. Change a shape");
			System.out.println("4. Quit");
			userChoice = in.nextInt();

			if (userChoice == 1) {
				System.out.println("Your options are:");
				System.out.println("1. Rectangle");
				System.out.println("2. Triangle");
				System.out.println("3. Circle");
				break;
			}

			else if (userChoice == 2) {
				System.out.println("Your options are:");
				System.out.println("Rectangle");
				System.out.println("Triangle");
				System.out.println("Circle");
				break;
			}

			else if (userChoice == 3) {
				System.out.println("Your options are:");
				System.out.println("Rectangle");
				System.out.println("Triangle");
				System.out.println("Circle");
				break;
			}
		} while (userChoice != 4);

	}

}

package shapes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		int userChoice;
		int createChoice;
		int viewChoice;
		int changeChoice;
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
				createChoice = in.nextInt();
				if (createChoice == 1) {
					Rectangle r = new Rectangle();
				} else if (createChoice == 2) {
					Triangle t = new Triangle();
				}

				else if (createChoice == 3) {
Circle c = new Circle();
				}
			} else if (userChoice == 2) {
				System.out.println("Your options are:");
				System.out.println("1. Rectangle");
				System.out.println("2. Triangle");
				System.out.println("3. Circle");
				viewChoice = in.nextInt();
				if (viewChoice == 1) {

				} else if (viewChoice == 2) {

				}

				else if (viewChoice == 3) {

				}
			}

			else if (userChoice == 3) {
				System.out.println("Your options are:");
				System.out.println("1. Rectangle");
				System.out.println("2. Triangle");
				System.out.println("3. Circle");
				changeChoice = in.nextInt();
				if (changeChoice == 1) {

				} else if (changeChoice == 2) {

				}

				else if (changeChoice == 3) {

				}
			}
		} while (userChoice != 4);

	}

}

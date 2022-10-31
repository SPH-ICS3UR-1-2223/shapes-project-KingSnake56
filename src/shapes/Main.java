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
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Circle c = new Circle();
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
					
					System.out.println("What is the rectangle Length?");
					double l=in.nextDouble();
					System.out.println("What is the rectangle Width?");
					double w=(in.nextDouble());
					r=new Rectangle(l,w);
					System.out.println("These are your stats!");
					r.printStats();
				} else if (createChoice == 2) {
					
					System.out.println("What is the length of side a?");
					double a=(in.nextDouble());
					System.out.println("What is the length of side b?");
					double b=(in.nextDouble());
					System.out.println("What is the length of side c?");
					double sidec=(in.nextDouble());
					t=new Triangle(a,b,sidec);
					System.out.println("These are your stats!");
					t.printStats();
				}

				else if (createChoice == 3) {
					System.out.println("What is the radius?");
					double rad=(in.nextDouble());
					c=new Circle(rad);
					System.out.println("These are your stats!");
					c.printStats();
				}
			} else if (userChoice == 2) {
				System.out.println("Your options are:");
				System.out.println("1. Rectangle");
				System.out.println("2. Triangle");
				System.out.println("3. Circle");
				viewChoice = in.nextInt();
				if (viewChoice == 1) {
					r.printStats();
				} else if (viewChoice == 2) {
					t.printStats();
				}

				else if (viewChoice == 3) {
					c.printStats();
				}
			}

			else if (userChoice == 3) {
				System.out.println("Your options are:");
				System.out.println("1. Rectangle");
				System.out.println("2. Triangle");
				System.out.println("3. Circle");
				changeChoice = in.nextInt();
				if (changeChoice == 1) {
					System.out.println("What is the rectangle Length?");
					r.setLength(in.nextInt());
					System.out.println("What is the rectangle Width?");
					r.setWidth(in.nextInt());
					System.out.println("Your shape has been changed");
				} else if (changeChoice == 2) {
					System.out.println("What is the length of side a?");
					t.setSideA(in.nextInt());
					System.out.println("What is the length of side b?");
					t.setSideB(in.nextInt());
					System.out.println("What is the length of side c?");
					t.setSideC(in.nextInt());
					System.out.println("Your shape has been changed");
				}

				else if (changeChoice == 3) {
					System.out.println("What is the radius?");
					c.setRadius(in.nextInt());
					System.out.println("Your shape has been changed");
				}
			}
		} while (userChoice != 4);
		System.out.println("Cya!");
	}

}

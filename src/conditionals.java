import java.util.Scanner;

public class conditionals {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		int entry;
		String cont;

		// initial input
		System.out.println("Hi there! What's your name?");
		name = scan.nextLine();
		do {
			System.out.println("Hi " + name + ". Give me a number from 1 to 100.");
			entry = scan.nextInt();
			while (entry <= 0 || entry >= 101) {
				System.out.println("I said a number between 1 and 100, " + name + "! Try again.");
				entry = scan.nextInt();
			}
			System.out.println("You picked " + entry + ".");

			// determine response
			if (entry % 2 == 0) {
				if (entry <= 24) {
					System.out.println(name + ", your number is even and less than 25.");
				} else if (entry >= 60) {
					System.out.println(name + ", you picked " + entry + ", which is even.");
				} else {
					System.out.println(name + ", your number is even.");
				}
			} else if (entry >= 60) {
				System.out.println(name + ", you picked " + entry + ", which is odd and over 60.");
			} else {
				System.out.println(name + ", you picked " + entry + ", which is odd. Very odd.");
			}

			// continue prompt
			System.out.print("Continue? (y/n): ");
			cont = scan.next();
		} while (cont.equalsIgnoreCase("y"));
		scan.close();
		System.out.println("Alright, bye " + name + ".");
	}
}

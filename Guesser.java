import java.util.*;


public class Guesser {

	public static void main(String[] args) {

		boolean keepGoing = true;
		menu();
		String choice = "";
		Scanner input = new Scanner(System.in);
		choice = input.nextLine();

		while (keepGoing) {
                	choice = input.nextLine();
			if (choice.equals("0")) {
				System.out.println("You have exited the menu, goodbye!");
				keepGoing = false;
			}
			else if (choice.equals("1")) {
				humanGuesser(input);
			}
			else if  (choice.equals("2")) {
				computerGuesser(input);
			}
			else {
				System.out.println("Heyyy, please try again");
			}
			
		} // end while
		input.close();
	}
		public static void menu() {
			System.out.println("------------------------------------------"+ "\n");
			System.out.println("0) Quit"+ "\n");
			System.out.println("1) Play Human Guesser"+ "\n");
			System.out.println("2) Play Computer Guesser" + "\n");
			System.out.println("------------------------------------------"+ "\n");
			System.out.println("Please Enter 0,1 Or 2."+ "\n");
		}	
		public static void humanGuesser(Scanner input) {
			Random rand = new Random();
			int correctNumber = rand.nextInt(100) + 1;

			boolean keepGoing = true;
			int turns = 0;
			int guess = 0;

			System.out.println("You're playing Human Guesser");
			System.out.println("(for testing: the number is " + correctNumber +")");
		
			while (keepGoing) {
				System.out.print("Enter your guess (1-100):");
				guess = Integer.parseInt(input.nextLine()); // reads input as int
				turns++;

				if (guess < correctNumber) {
					System.out.println("Too Low");
				}
				else if (guess > correctNumber) {
					System.out.println("Too High");
				}
				else if (guess == correctNumber) {
					System.out.println("\n You got it in " + turns + " tries!\n");
					keepGoing = false;
					menu();
				}
			}// while
		}
	public static void computerGuesser(Scanner input) {
		System.out.println("You're playing Computer Guesser!");
		int lower = 1;
		int upper = 100;
		int guess = getMean(lower, upper);
		System.out.println("For testing, here is the guess: " + guess);
		int turns = 0;
		boolean keepGoing = true;

		while (keepGoing) {
			turns++;
			
			System.out.println("turn:" + turns + "I guess: " + guess);
			System.out.print("Too (H)igh, too (L)ow, or (C)orrect? ");

			String response = input.nextLine();
			response = response.toLowerCase();
			char letter = response.charAt(0); // take the first character

			if (letter == 'h') {
				System.out.println("That number is too low!");
				lower = guess - 1;
			} else if (letter == 'l') {
    				System.out.println("That number is too high!");
				upper = guess + 1;
			} else if (letter == 'c') {
   				System.out.println("Correct!");
				System.out.println("\n You did it in " + turns + " turns");
				keepGoing = false;
			}
		}//while
}

	public static int getMean(int low, int high) {
    		return (low + high) / 2;

	}
}

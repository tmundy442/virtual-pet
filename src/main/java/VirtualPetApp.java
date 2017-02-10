import java.util.Scanner;

public class VirtualPetApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		VirtualPet bob = new VirtualPet();
		int hunger;
		int thirst;
		int boredom;
		int tiredness;

		int choice = 0;
		System.out.println("Welcome to Virtual Dog Bob");

		do {
			//get current status values, print user prompts
			hunger = bob.getHunger();
			thirst = bob.getThirst();
			boredom = bob.getBoredom();
			tiredness = bob.getTiredness();
			System.out.println("Bob's Current Status:");
			System.out.println("Hunger: " + hunger);
			System.out.println("Thirst:" + thirst);
			System.out.println("Boredom:" + boredom);
			System.out.println("Tiredness:" + tiredness);
			System.out.println("");
			System.out.println("What do you want to do?");
			System.out.println("1. Feed Bob");
			System.out.println("2. Give Bob Some Water");
			System.out.println("3. Take Bob for a Walk");
			System.out.println("4. Put Bob to Bed");
			System.out.println("5. Nothing");
			System.out.println("6. Exit");
			System.out.println("Choose and press 'Enter':");

			choice = scanner.nextInt();
			// VirtualPet methods called depending on user choice
			if (choice == 1) {
				bob.feed();
			} else if (choice == 2) {
				thirst = bob.water();
			} else if (choice == 3) {
				boredom = bob.walk();
			} else if (choice == 4) {
				tiredness = bob.bed();
			}

			 /* if user chooses "nothing", each attribute calls the tick method
			 	and gets its own random number*/
			
			else if (choice == 5) {

				hunger = bob.getHungerTick();
				thirst = bob.getThirstTick();
				boredom = bob.getBoredomTick();
				tiredness = bob.getTirednessTick();
			}
			if (hunger > 15) {
				System.out.println("BOB IS HUNGRY, FEED HIM SOON!");
				System.out.println("");
				System.out.println("");
			}
			if (thirst > 15) {
				System.out.println("BOB IS THIRSTY, GIVE HIM SOME WATER!");
				System.out.println("");
				System.out.println("");
			}
			if (boredom > 15) {
				System.out.println("BOB IS BORED, TAKE HIM FOR A WALK!");
				System.out.println("");
				System.out.println("");
			}
			if (tiredness > 15) {
				System.out.println("BOB IS TIRED, PUT HIM TO BED!");
				System.out.println("");
				System.out.println("");
			}
		} while (choice != 6);

		System.out.println("Goodbye");
		scanner.close();
		System.exit(0);

	}
}

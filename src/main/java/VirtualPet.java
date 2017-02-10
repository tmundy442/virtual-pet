import java.util.Random;

public class VirtualPet {
	int hunger = 10;
	int thirst = 10;
	int boredom = 10;
	int tiredness = 10;

	Random generator = new Random();

	public int getHunger() {
		return hunger;
	}

	public int feed() {
		return hunger = 2;
	}

	public int getThirst() {

		return thirst;
	}

	public int water() {

		return thirst = 2;
	}

	public int getBoredom() {

		return boredom;
	}

	public int walk() {

		tiredness += 3;// if he goes for a walk, he gets a little more tired
		return boredom = 2;
	}

	public int getTiredness() {

		return tiredness;
	}

	public int bed() {

		return tiredness = 0;
	}

	public int getHungerTick() {

		int tick = generator.nextInt(5);
		hunger += tick;
		return hunger;
	}

	public int getThirstTick() {

		int tick = generator.nextInt(5);
		thirst += tick;
		return thirst;
	}

	public int getBoredomTick() {

		int tick = generator.nextInt(5);
		boredom += tick;
		return boredom;
	}

	public int getTirednessTick() {

		int tick = generator.nextInt(5);
		tiredness += tick;
		return tiredness;
	}

}

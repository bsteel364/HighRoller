import java.util.ArrayList;
import java.util.Random;

public class PowerBall {

	private ArrayList<Integer> numbers = new ArrayList(5);
	private Integer powerBallNumber;
	private boolean multiplier;
	private double cost;
	private int multiplierValue;
	
	public PowerBall(boolean multiply) {
		randomlySetNumbers(); // chooses random numbers for the powerball ticket
		if(multiply) {
			this.multiplier = true;
			this.cost = 3;
			multiplierValue = setMultiplier();
		} else {
			this.multiplier = false;
			this.cost = 2;
			multiplierValue = 1;
		}
	}
	
	private int setMultiplier() {	//randomly sets a multiplier 2, 3, 4, 5, or 10
		Random random = new Random();
		int randMultiplier = random.nextInt(6)+1;
		if(randMultiplier == 6) {
			randMultiplier = 10;
		}
		return randMultiplier;
	}
	
	public double getCost() {
		return this.cost;
	}
	
	private void randomlySetNumbers() { 
		Random random = new Random();
		
		for(int i = 0; i < 5; i++) {
			int randMultiplier = random.nextInt(69)+1;
			int temp = randMultiplier;
			while(numbers.contains(temp)) {  	//while loop prevents duplicate numbers in list since Powerball allows for ONE use of each number
				temp = random.nextInt(69)+1;
			}
			numbers.add(temp);
		}
		powerBallNumber = random.nextInt(69)+1;
	}
	
	public ArrayList getNumbers() {
		return this.numbers;
	}
	
	public int getPowerballNumber() {
		return this.powerBallNumber;
	}
	
	
}

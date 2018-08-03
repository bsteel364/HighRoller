import java.util.Scanner;

public class Simulator {

	
	public static void main(String[] args) {
		
		System.out.println("Pick a Game to Play");
		System.out.println("1) Powerball");
		Scanner sc = new Scanner(System.in);
		String selection = sc.nextLine();
		
		if(selection.equals("1")) {
			PowerballSim();
		} else {
			System.out.println("Invalid");
		}
	}
	
	public static void PowerballSim() {
		Scanner sc = new Scanner(System.in);
		PowerBall winner = new PowerBall(false);
		System.out.println("Would you like to add a multiplier to your card for an extra 1 dollar?  (yes/no)");
		String answer = sc.nextLine();
		PowerBall player;
		if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y") ) {
			player = new PowerBall(true);
		} else {
			player = new PowerBall(false);
		}
		int correctNumbers = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(winner.getNumbers().get(i).equals(winner.getNumbers().get(j))) {
					correctNumbers++;
				}
			}
		}
		boolean matchingPowerball = false;
		if(winner.getPowerballNumber() == player.getPowerballNumber()) {
			matchingPowerball = true;
		}
		
		if(matchingPowerball) {
			if(correctNumbers == 5) {
				
			}
			if(correctNumbers == 4) {
				
			}
			if(correctNumbers == 3) {
				
			}
			if(correctNumbers == 2) {
				
			}
			if(correctNumbers == 1) {
				
			}
			
		}
		if(!matchingPowerball) {
			if(correctNumbers == 5) {
				
			}
			if(correctNumbers == 4) {
				
			}
			if(correctNumbers == 3) {
				
			}
			
		}
		
		
	}
	
	
}

import java.util.Scanner;

public class Simulator {

	public static void main(String[] args) {
		
		boolean running = true;
		Wallet wallet = new Wallet();
		
		while(running) {
			System.out.println("\n====/ Menu \\====");
			System.out.println("1) Powerball");
			System.out.println("2) Check Remaining Balance");
			System.out.println("3) Quit");
			
			Scanner sc = new Scanner(System.in);
			String selection = sc.nextLine();
			if(selection.equals("1")) {
				PowerballSim(wallet);
			} else if(selection.equals("2")) {
				System.out.println("\nBALANCE: $" + wallet.getBalance());
			} else if(selection.equals("3")) {
				running = false;
				System.out.println("\n You Finished with $" + wallet.getBalance());
			} else {
				System.out.println("Invalid");
			}
		}
	}
	
	public static void PowerballSim(Wallet wallet) {
		double grandPrize = 40000000;
		Scanner sc = new Scanner(System.in);
		PowerBall winner = new PowerBall(false);
		System.out.println("Would you like to add a multiplier to your card for an extra 1 dollar?  (yes/no)");
		String answer = sc.nextLine();
		PowerBall player;
		if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y") ) {
			player = new PowerBall(true);
			wallet.spend(3);
		} else {
			player = new PowerBall(false);
			wallet.spend(2);
		}
		int correctNumbers = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(winner.getNumbers().get(i) == (player.getNumbers().get(j))) {
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
				wallet.add(grandPrize);
				System.out.println("You got the powerball and all 5 other numbers correct and won $" + grandPrize);
			}
			if(correctNumbers == 4) {
				wallet.add(50000*player.getMultiplier());
				System.out.println("You got " + correctNumbers + " and the powerball and won $" + 50000*player.getMultiplier());
			}
			if(correctNumbers == 3) {
				wallet.add(100*player.getMultiplier());
				System.out.println("You got " + correctNumbers + " and the powerball and won $" + 100*player.getMultiplier());
			}
			if(correctNumbers == 2) {
				wallet.add(7*player.getMultiplier());
				System.out.println("You got " + correctNumbers + " and the powerball and won $" + 7*player.getMultiplier());
			}
			if(correctNumbers == 1) {
				wallet.add(4*player.getMultiplier());
				System.out.println("You got " + correctNumbers + " and the powerball and won $" + 4*player.getMultiplier());
			} 
			if(correctNumbers == 0) {
				wallet.add(4*player.getMultiplier());
				System.out.println("You got " + correctNumbers + " but you did get the powerball and won $" + 4*player.getMultiplier());
			}
			
			
		}
		if(!matchingPowerball) {
			if(correctNumbers == 5) {
				if(player.isMultiplied()) {
					wallet.add(2000000);
					System.out.println("You got " + correctNumbers + " and the powerball and won $2000000");
				}else {
					wallet.add(1000000);
					System.out.println("You got " + correctNumbers + " and the powerball and won $1000000");
				}
			}
			if(correctNumbers == 4) {
				wallet.add(100*player.getMultiplier());
				System.out.println("You got " + correctNumbers + " and the powerball and won $" + 100*player.getMultiplier());
			}
			if(correctNumbers == 3) {
				wallet.add(7*player.getMultiplier());
				System.out.println("You got " + correctNumbers + " and the powerball and won $" + 7*player.getMultiplier());
			}
			
		}
		
	}
	
	
}

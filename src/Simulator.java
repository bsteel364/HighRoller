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
		
	}
	
	
}

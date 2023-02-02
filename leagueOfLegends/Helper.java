package leagueOfLegends;
import java.util.*;

public class Helper {
	Scanner inputCapture = new Scanner(System.in);

	public float floatCapture(String prompt) {
		float userInput;

		System.out.print(prompt);
		userInput = inputCapture.nextFloat();

		return userInput;
	}

	public String stringCapture(String prompt) {
		String userInput;

		System.out.print(prompt);
		userInput = inputCapture.next();

		return userInput;
	}
}

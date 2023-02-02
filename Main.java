import leagueOfLegends.*;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		Calculation leagueCalcs = new leagueOfLegends.Calculation();
		Helper leagueHelpers = new leagueOfLegends.Helper();
		
		// leagueCalcs.calculateResistances(leagueHelpers.userInput("Enter your resistance value: "));
		// leagueCalcs.calculateAbilityPower();

		// System.out.println(
		// 	"Your damage against this opponent is increased by about " + 
		// 	leagueCalcs.calculateMagicPenetration(
		// 		leagueHelpers.userInput("Enter your magic penetration stat: "),
		// 		leagueHelpers.userInput("And what is your opponent's Magic Resist? ")
		//	) + "%");

		String statChoice = JOptionPane.showInputDialog("What game statistic would you like to calculate? 1=MR, 2=Magic Penetration.");
		JOptionPane.showMessageDialog(null, "Got it. " + statChoice + " it is.");
		System.out.println(statChoice);
	}
}

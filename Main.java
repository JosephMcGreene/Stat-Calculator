import leagueOfLegends.*;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		CalculationGroup leagueCalcs = new leagueOfLegends.CalculationGroup();

		// int lethality = Integer.parseInt( JOptionPane.showInputDialog("Enter lethality:") );
		// int level = Integer.parseInt( JOptionPane.showInputDialog("Enter opponent's level:") );

		// System.out.println(leagueCalcs.armorPenFromLethality(lethality, level));
		System.out.println(leagueCalcs.armorPenFromLethality(10, 18));
		
		// String statChoice = JOptionPane.showInputDialog("What statistic would you like to calculate? 1=Armor or Magic Resist, 2=Magic Penetration.");

		// JOptionPane.showMessageDialog(null, "Got it.");

		// if (Integer.parseInt(statChoice) == 1) {
		// 	float userInput = Float.parseFloat( JOptionPane.showInputDialog("How much armor/magic resist do you have?") );
		// 	float percentReduced = leagueCalcs.calculateResistances(userInput);
		// 	JOptionPane.showMessageDialog(null, "Your damage is reduced by about " + percentReduced + "%");
		// }
	}
}

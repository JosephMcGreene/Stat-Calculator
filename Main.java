import leagueOfLegends.*;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		Calculation leagueCalcs = new leagueOfLegends.Calculation();

		String statChoice = JOptionPane.showInputDialog("What statistic would you like to calculate? 1=Armor or Magic Resist, 2=Magic Penetration.");

		JOptionPane.showMessageDialog(null, "Got it.");

		if (Integer.parseInt(statChoice) == 1) {
			float userInput = Float.parseFloat( JOptionPane.showInputDialog("How much armor/magic resist do you have?") );
			float percentReduced = leagueCalcs.calculateResistances(userInput);
			JOptionPane.showMessageDialog(null, "Your damage is reduced by about " + percentReduced + "%");
		}
	}
}

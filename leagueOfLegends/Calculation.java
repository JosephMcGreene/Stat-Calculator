package leagueOfLegends;

import javax.swing.*;


public class Calculation {

	public float calculateResistances(float resistanceValue) {
			float denominator = 100 + resistanceValue;
			float ratioTaken = 100 / denominator;
			float percentTaken = ratioTaken * 100;

			return 100 - percentTaken;
	}

	// public void calculateAbilityPower() {
	// 	try {
	// 		System.out.print("What is the ability's AP ratio percentage? ");
	// 		float scaling = inputCapture.nextFloat();
	// 		System.out.print("Great, and how much AP do you have? ");
	// 		float abilityPower = inputCapture.nextFloat();

	// 		float apRatio = scaling / 100;
	// 		float abilityDamage = abilityPower * apRatio;
	// 		float roundedDamage = Math.round(abilityDamage);
			
	// 		System.out.println("Before resistances, this ability deals about " + roundedDamage);
	// 	} finally {
	// 		inputCapture.close();
	// 	}
	// }

	public float calculateMagicPenetration(float magicPen, float opponentMR) {
		float percentReducedBefore = this.calculateResistances(opponentMR);
		float percentReducedAfter = this.calculateResistances(opponentMR - magicPen);
		float percentDmgWithPen = percentReducedAfter / percentReducedBefore * 100;

		return 100 - percentDmgWithPen;
	}
}

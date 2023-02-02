package leagueOfLegends;

import java.util.*;

public class Calculation {
	Scanner inputCapture = new Scanner(System.in);
	Helper helpers = new Helper();

	public float calculateResistances(float resistanceValue) {
			float denominator = 100 + resistanceValue;
			float ratioTaken = 100 / denominator;
			float percentTaken = ratioTaken * 100;
			float percentReduced = 100 - percentTaken;

			System.out.println("Damage is reduced by about " + percentReduced + "% before penetration.");

			return percentReduced;
	}

	public void calculateAbilityPower() {
		try {
			System.out.print("What is the ability's AP ratio percentage? ");
			float scaling = inputCapture.nextFloat();
			System.out.print("Great, and how much AP do you have? ");
			float abilityPower = inputCapture.nextFloat();

			float apRatio = scaling / 100;
			float abilityDamage = abilityPower * apRatio;
			float roundedDamage = Math.round(abilityDamage);
			
			System.out.println("Before resistances, this ability deals about " + roundedDamage);
		} finally {
			inputCapture.close();
		}
	}

	public float calculateMagicPenetration(float magicPen, float opponentMR) {
		float percentReducedBefore = this.calculateResistances(opponentMR);
		float percentReducedAfter = this.calculateResistances(opponentMR - magicPen);
		float percentDmgWithPen = percentReducedAfter / percentReducedBefore * 100;
		float dmgIncreaseWithPen = 100 - percentDmgWithPen;

		return dmgIncreaseWithPen;
	}
}

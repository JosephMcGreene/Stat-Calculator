package leagueOfLegends;

public class CalculationGroup {

	public float calculateResistances(float resistanceValue) {
			float denominator = 100 + resistanceValue;
			float ratioTaken = 100 / denominator;
			float percentTaken = ratioTaken * 100;
			return 100 - percentTaken;
	}

	public float calculateMagicPenDamage(float magicPen, float opponentMR) {
		float percentReducedBefore = this.calculateResistances(opponentMR);
		float percentReducedAfter = this.calculateResistances(opponentMR - magicPen);
		float percentDmgWithPen = percentReducedAfter / percentReducedBefore * 100;
		return 100 - percentDmgWithPen;
	}

	public float calculateAPDamage(int abilityPower, int abilityScaling) {
		float apRatio = abilityScaling / 100;
		float abilityDamage = abilityPower * apRatio;
		return Math.round(abilityDamage);
	}

	public double armorPenFromLethality(int lethalityValue, int opponentLevel) {
		// ARMOR PEN FORUMLA: lethality * (0.6 + 0.4 * opponentLevel / 18);
		double lethalityScaling = opponentLevel * 0.4 / 18 + 0.6;
		return lethalityScaling * lethalityValue; 
	}
}

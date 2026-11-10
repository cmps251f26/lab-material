package part1.exercise2;

public enum ServiceQuality {
	Excellent(.2), // 20%
	Good(.15),     // 15%
	Poor(.1);      // 10%

	private double tip;

	private ServiceQuality(double tip) {
		this.tip = tip;
	}

	public double getTip() {
		return tip;
	}
}

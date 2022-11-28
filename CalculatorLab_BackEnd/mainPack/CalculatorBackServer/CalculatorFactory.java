package mainPack.CalculatorBackServer;

public class CalculatorFactory {
	private int calcType;
	ICalculator realCalc;
	public CalculatorFactory(int calcType) {
		this.calcType = calcType;
		if(this.calcType == 1)
			this.realCalc = new CalculatorCore();
	}
	public ICalculator getCalc() {
		return this.realCalc;
	}
}

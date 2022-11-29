package mainPack.CalculatorBackServer;

public class CalculatorCore implements ICalculator{

	public double add(double firstNum, double secondNum) {
		return firstNum + secondNum;
	}

	public double subtract(double firstNum, double secondNum) {
		return firstNum - secondNum;
	}

	public double multiply(double firstNum, double secondNum) {
		return firstNum * secondNum;
	}

	public double divide(double firstNum, double secondNum) {
		return firstNum / secondNum;
	}

	public double square(double firstNum) {
		return Math.pow(firstNum, 2);
	}

	public double multInverse(double firstNum) {
		return 1 / firstNum;
	}

	public double sqrt(double firstNum) {
		return Math.sqrt(firstNum);
	}

	public double invertSign(double firstNum) {
		return -1 * firstNum;
	}

	public double percentage(double firstNum) {
		return firstNum / 100;
	}

}

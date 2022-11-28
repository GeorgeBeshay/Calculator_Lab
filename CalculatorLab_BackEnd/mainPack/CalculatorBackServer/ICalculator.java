package mainPack.CalculatorBackServer;

public interface ICalculator {
	
	public double add(double firstNum, double secondNum);
	public double subtract(double firstNum, double secondNum);
	public double multiply(double firstNum, double secondNum);
	public double divide(double firstNum, double secondNum);
	public double square(double firstNum);
	public double multInverse(double firstNum);
	public double sqrt(double firstNum);
	public double invertSign(double firstNum);
	public double percentage(double firstNum);

}

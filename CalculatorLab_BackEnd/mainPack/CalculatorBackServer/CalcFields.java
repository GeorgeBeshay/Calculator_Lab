package mainPack.CalculatorBackServer;

public class CalcFields implements CalcFieldsI{
	
	private double firstNum;
	private String op;
	private double secondNum;
	private double ans;
	
	public CalcFields() {}
	
	public CalcFields(double firstNum, String op,  double secondNum, double ans) {
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		this.ans = ans;
		this.op = op;
	}
	
	public double getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(double firstNum) {
		this.firstNum = firstNum;
	}
	public double getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(double secondNum) {
		this.secondNum = secondNum;
	}
	public double getAns() {
		return ans;
	}
	public void setAns(double ans) {
		this.ans = ans;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	public String showCalcFields() {
		return "First Number: " + this.getFirstNum() +
				"\nOperator: " + this.getOp() +
				"\nSecond Number: " + this.getSecondNum() +
				"\nAnswer: " + this.getAns();
	}
	

}

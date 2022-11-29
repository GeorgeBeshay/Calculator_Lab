package mainPack.CalculatorBackServer;

public class ReturnableCalcFields implements CalcFieldsI{
	
	private double firstNum;
	private String op;
	private double secondNum;
	private String ans;
	
	public ReturnableCalcFields() {
	}
	
	public ReturnableCalcFields(CalcFields calcFields) {
		this.firstNum = calcFields.getFirstNum();
		this.op = calcFields.getOp();
		this.secondNum = calcFields.getSecondNum();
		if(Double.isInfinite(calcFields.getAns()) || Double.isNaN(calcFields.getAns())) 
			this.ans = "Error";
		else 
			this.ans = String.valueOf(calcFields.getAns());
	}
	
	public static ReturnableCalcFields getReturnableCalcFields(CalcFields calcFields) {
		return new ReturnableCalcFields(calcFields);
	}

	public double getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(double firstNum) {
		this.firstNum = firstNum;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public double getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(double secondNum) {
		this.secondNum = secondNum;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}
	
	
	
}

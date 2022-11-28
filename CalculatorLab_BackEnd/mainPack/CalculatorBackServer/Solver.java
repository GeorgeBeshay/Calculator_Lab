package mainPack.CalculatorBackServer;

import org.springframework.stereotype.Service;

@Service
public class Solver implements ISolver{
	
	private CalcFields calcFields;
	private ICalculator realCalc;
	
	public Solver() {	
		CalculatorFactory calculatorFactory = new CalculatorFactory(1);
		this.realCalc = calculatorFactory.getCalc();
	}
	
	public Solver(CalcFields calcFields) {
		this.calcFields = calcFields;
		CalculatorFactory calculatorFactory = new CalculatorFactory(1);
		this.realCalc = calculatorFactory.getCalc();
		this.executeCalculations();
		this.shiftFields();
	}
	
	private void executeCalculations() {
		switch(this.calcFields.getOp()) {
		case "perc":
			this.calcFields.setAns(this.realCalc.percentage(this.calcFields.getFirstNum()));
			break;
		case "p-1":
			this.calcFields.setAns(this.realCalc.multInverse(this.calcFields.getFirstNum()));
			break;
		case "p2":
			this.calcFields.setAns(this.realCalc.square(this.calcFields.getFirstNum()));
			break;
		case "rt":
			this.calcFields.setAns(this.realCalc.sqrt(this.calcFields.getFirstNum()));
			break;
		case "div":
			this.calcFields.setAns(this.realCalc.divide(this.calcFields.getFirstNum(), this.calcFields.getSecondNum()));
			break;
		case "times":
			this.calcFields.setAns(this.realCalc.multiply(this.calcFields.getFirstNum(), this.calcFields.getSecondNum()));
			break;
		case "minus":
			this.calcFields.setAns(this.realCalc.subtract(this.calcFields.getFirstNum(), this.calcFields.getSecondNum()));
			break;
		case "add":
			this.calcFields.setAns(this.realCalc.add(this.calcFields.getFirstNum(), this.calcFields.getSecondNum()));
			break;
		case "revSign":
			this.calcFields.setAns(this.realCalc.invertSign(this.calcFields.getFirstNum()));
			break;
		default:
			break;
		}
	}
	public void shiftFields() {
		this.calcFields.setFirstNum(this.calcFields.getAns());
		this.calcFields.setOp("");
		this.calcFields.setSecondNum(0);
		this.calcFields.setAns(0);
	}
	public CalcFields solve(CalcFields calcFields) {
		this.calcFields = calcFields;
		this.executeCalculations();
//		this.shiftFields();
		return this.calcFields;
	}

}

package mainPack.CalculatorBackServer;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/callTheBackServer")
public class CalculatorControl {
	
	@Autowired
	private Solver solver;
	
	@PostMapping(value = {"/solveTheOperation"})
	public CalcFieldsI test(@RequestBody CalcFields calcFields) {
		System.out.println(this.solver.solve(calcFields).getAns());
		return ReturnableCalcFields.getReturnableCalcFields(this.solver.solve(calcFields));
	}

}

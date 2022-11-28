import { Injectable } from '@angular/core';
import { CalcFieldI } from '../interfaces/calc-field-i';

@Injectable({
  providedIn: 'root',
})
export class LogicCheckerService {
  constructor() {}
  percConditionsChecker(currentCalcField: CalcFieldI) {
    return currentCalcField.secondNum == '' && currentCalcField.ans == '';
  }
  MIConditionsChecker(currentCalcField: CalcFieldI) {
    return currentCalcField.secondNum == '' && currentCalcField.ans == '';
  }
  p2ConditionsChecker(currentCalcField: CalcFieldI) {
    return currentCalcField.secondNum == '' && currentCalcField.ans == '';
  }
  rtConditionsChecker(currentCalcField: CalcFieldI) {
    return currentCalcField.secondNum == '' && currentCalcField.ans == '';
  }
  divConditionsChecker(currentCalcField: CalcFieldI) {
    return currentCalcField.secondNum == '' && currentCalcField.ans == '';
  }
  timesConditionsChecker(currentCalcField: CalcFieldI) {
    return currentCalcField.secondNum == '' && currentCalcField.ans == '';
  }
  minusConditionsChecker(currentCalcField: CalcFieldI) {
    return currentCalcField.secondNum == '' && currentCalcField.ans == '';
  }
  addConditionsChecker(currentCalcField: CalcFieldI) {
    return currentCalcField.secondNum == '' && currentCalcField.ans == '';
  }
  revSignConditionsChecker(currentCalcField: CalcFieldI) {
    return currentCalcField.secondNum == '' && currentCalcField.ans == '';
  }
  eqConditionsChecker(currentCalcField: CalcFieldI) {
    return (
      (currentCalcField.op != '' &&
        currentCalcField.firstNum != '' &&
        currentCalcField.secondNum != '' &&
        currentCalcField.ans == '') ||
      (currentCalcField.firstNum != '' && currentCalcField.op == '√') ||
      (currentCalcField.firstNum != '' && currentCalcField.op == 'x^2') ||
      (currentCalcField.firstNum != '' && currentCalcField.op == '%') ||
      (currentCalcField.firstNum != '' && currentCalcField.op == '1 / x') ||
      (currentCalcField.firstNum != '' && currentCalcField.op == '√') ||
      (currentCalcField.firstNum != '' && currentCalcField.op == '+/-')
    );
  }
}

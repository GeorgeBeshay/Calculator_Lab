import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { delay, observable } from 'rxjs';
import { CalcFieldI } from '../interfaces/calc-field-i';
import { ButtonI } from '../interfaces/button-i';
import { LogicCheckerService } from '../services/logic-checker.service';

@Injectable({
  providedIn: 'root',
})
export class ButtonsService {
  constructor(private http: HttpClient) {}
  private logicChecker = new LogicCheckerService();
  private port = 8081;
  private url = `http://localhost:${this.port}/callTheBackServer/solveTheOperation`;
  // ------------------- Separator -------------------
  copyThat(currentCalcField: CalcFieldI, newOp: string = '') {
    let tempHolderOP = currentCalcField.op;
    let tempHolderSN = currentCalcField.secondNum;
    currentCalcField.firstNum = Number(currentCalcField.firstNum);
    currentCalcField.secondNum = Number(currentCalcField.secondNum);
    currentCalcField.ans = Number(currentCalcField.ans);
    currentCalcField.op = this.getCorrespondingButtonContent(
      currentCalcField.op
    );
    console.log('Front end Server: Back End, Copy that!');
    if (newOp == '') {
      this.http
        .post<CalcFieldI>(this.url, currentCalcField)
        .subscribe(
          (data: any) => (
            console.log(data),
            (currentCalcField.ans = String(data.ans)),
            (currentCalcField.op = String(tempHolderOP)),
            (currentCalcField.secondNum = String(tempHolderSN)),
            (currentCalcField.firstNum = String(currentCalcField.firstNum))
          )
        );
    } else {
      this.http
        .post<CalcFieldI>(this.url, currentCalcField)
        .subscribe(
          (data: any) => (
            console.log(data),
            (currentCalcField.firstNum = String(data.ans)),
            (currentCalcField.secondNum = ''),
            (currentCalcField.op = newOp),
            (currentCalcField.ans = ''),
            console.log(currentCalcField)
          )
        );
    }
    console.log('Back End Server: Roger That!');
  }
  // ------------------- Separator -------------------
  /*
  The Funciton that drive the remaining Number buttons Functions.
  */
  pressOnNum(currentCalcField: CalcFieldI, button: ButtonI) {
    if (currentCalcField.ans != '') {
      currentCalcField.firstNum = String(button.content);
      currentCalcField.secondNum = '';
      currentCalcField.ans = '';
      currentCalcField.op = '';
    } else if (currentCalcField.op == '') {
      currentCalcField.firstNum += button.content;
    } else if (
      currentCalcField.ans == '' &&
      (currentCalcField.op == '➕' ||
        currentCalcField.op == '➖' ||
        currentCalcField.op == '✖️' ||
        currentCalcField.op == '➗')
    ) {
      currentCalcField.secondNum += button.content;
    }
  }
  /*
  The Funciton that drive the remaining Operator buttons Functions.
  */
  pressOnOperator(currentCalcField: CalcFieldI, button: ButtonI) {
    if (currentCalcField.firstNum == '') {
      console.log(
        'Error: A First Number Must Be Provided Before An Operation.'
      );
      return;
    }
    if (currentCalcField.ans == 'Error: Divison By Zero') {
      console.log('Operations are not allowed on Error Statements.');
      this.CButtonFun(currentCalcField);
      return;
    }
    switch (button.content) {
      case 'del':
        this.delButtonFun(currentCalcField);
        break;
      case 'c':
        this.CButtonFun(currentCalcField);
        break;
      case 'ce':
        this.CEButtonFun(currentCalcField);
        break;
      case 'perc':
        if (this.logicChecker.percConditionsChecker(currentCalcField)) {
          currentCalcField.op = button.Val;
          // Call function to backend.
          this.copyThat(currentCalcField);
        } else {
          this.copyThat(currentCalcField, button.Val);
        }
        break;
      case 'p-1':
        if (this.logicChecker.MIConditionsChecker(currentCalcField)) {
          currentCalcField.op = button.Val;
          // Call function to backend.
          this.copyThat(currentCalcField);
        } else {
          this.copyThat(currentCalcField, button.Val);
        }
        break;
      case 'p2':
        if (this.logicChecker.p2ConditionsChecker(currentCalcField)) {
          currentCalcField.op = button.Val;
          // Call function to backend.
          this.copyThat(currentCalcField);
        } else {
          this.copyThat(currentCalcField, button.Val);
        }
        break;
      case 'rt':
        if (this.logicChecker.rtConditionsChecker(currentCalcField)) {
          currentCalcField.op = button.Val;
          // Call function to backend.
          this.copyThat(currentCalcField);
        } else {
          this.copyThat(currentCalcField, button.Val);
        }
        break;
      case 'div':
        if (this.logicChecker.divConditionsChecker(currentCalcField)) {
          currentCalcField.op = button.Val;
        } else {
          this.copyThat(currentCalcField, button.Val);
        }
        break;
      case 'times':
        if (this.logicChecker.timesConditionsChecker(currentCalcField)) {
          currentCalcField.op = button.Val;
        } else {
          this.copyThat(currentCalcField, button.Val);
        }
        break;
      case 'minus':
        if (this.logicChecker.minusConditionsChecker(currentCalcField)) {
          currentCalcField.op = button.Val;
        } else {
          this.copyThat(currentCalcField, button.Val);
        }
        break;
      case 'add':
        if (this.logicChecker.addConditionsChecker(currentCalcField)) {
          currentCalcField.op = button.Val;
        } else {
          this.copyThat(currentCalcField, button.Val);
        }
        break;
      case 'revSign':
        if (this.logicChecker.revSignConditionsChecker(currentCalcField)) {
          currentCalcField.op = button.Val;
          // Call function to backend.
          this.copyThat(currentCalcField);
        } else {
          this.copyThat(currentCalcField, button.Val);
        }
        break;
      case 'eq':
        if (this.logicChecker.eqConditionsChecker(currentCalcField)) {
          // Call function to backend.
          this.copyThat(currentCalcField);
        }
        break;
      default:
        console.log('Error: From "pressOnOperator()"');
        break;
    }
  }
  /*
  The Function Of The Delete Button
  */
  delButtonFun(currentCalcField: CalcFieldI) {
    if (currentCalcField.ans == '') {
      if (currentCalcField.secondNum != '') {
        currentCalcField.secondNum = currentCalcField.secondNum.slice(0, -1);
      } else if (currentCalcField.op != '') {
        currentCalcField.op = '';
      } else if (currentCalcField.firstNum != '') {
        currentCalcField.firstNum = currentCalcField.firstNum.slice(0, -1);
      }
    } else {
      this.CButtonFun(currentCalcField);
    }
  }
  /*
  The Function Of The Clear Button
  */
  CButtonFun(currentCalcField: CalcFieldI) {
    currentCalcField.firstNum = '';
    currentCalcField.op = '';
    currentCalcField.secondNum = '';
    currentCalcField.ans = '';
  }
  /*
  The Function Of The Clear Entry Button
  */
  CEButtonFun(currentCalcField: CalcFieldI) {
    console.log(currentCalcField.ans);
    if (currentCalcField.ans != '') {
      this.CButtonFun(currentCalcField);
    } else if (currentCalcField.secondNum != '') {
      currentCalcField.secondNum = '';
    } else if (currentCalcField.firstNum != '' && currentCalcField.op == '') {
      currentCalcField.firstNum = '';
    }
  }
  /*
  The Function Used to return all the buttons to be
  displayed in the calculator interface, each button is represented
  as an currentCalcFieldect, each button currentCalcFieldect contains exactly 3 attributes
  */
  getCorrespondingButtonContent(S: String) {
    let buttonsPalette = this.getButtonsPalette();
    let i = 0;
    for (; i < buttonsPalette.length; i++) {
      if (buttonsPalette[i].Val == S) return buttonsPalette[i].content;
    }
    return null;
  }
  getButtonsPalette() {
    return [
      { Val: '%', type: 'op', content: 'perc' },
      { Val: 'CE', type: 'op', content: 'ce' },
      { Val: 'C', type: 'op', content: 'c' },
      { Val: 'DEL', type: 'op', content: 'del' },
      { Val: '1 / x', type: 'op', content: 'p-1' },
      { Val: 'x^2', type: 'op', content: 'p2' },
      { Val: '√', type: 'op', content: 'rt' },
      { Val: '➗', type: 'op', content: 'div' },
      { Val: '7', type: 'num', content: 7 },
      { Val: '8', type: 'num', content: 8 },
      { Val: '9', type: 'num', content: 9 },
      { Val: '✖️', type: 'op', content: 'times' },
      { Val: '4', type: 'num', content: 4 },
      { Val: '5', type: 'num', content: 5 },
      { Val: '6', type: 'num', content: 6 },
      { Val: '➖', type: 'op', content: 'minus' },
      { Val: '1', type: 'num', content: 1 },
      { Val: '2', type: 'num', content: 2 },
      { Val: '3', type: 'num', content: 3 },
      { Val: `➕`, type: 'op', content: 'add' },
      { Val: '+/-', type: 'op', content: 'revSign' },
      { Val: '0', type: 'num', content: 0 },
      { Val: '.', type: 'num', content: '.' },
      { Val: '=', type: 'op', content: 'eq' },
    ];
  }
}

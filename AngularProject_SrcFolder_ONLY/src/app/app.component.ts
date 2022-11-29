import { Component } from '@angular/core';
import { ButtonComponent } from './components/button/button.component';
import { ButtonsService } from './services/buttons.service';
import { HttpClient } from '@angular/common/http';
import { CalcFieldI } from './interfaces/calc-field-i';
import { ButtonI } from './interfaces/button-i';
import { faYoutube } from '@fortawesome/free-brands-svg-icons';
import {} from '@fortawesome/free-regular-svg-icons';
import { faSun } from '@fortawesome/free-solid-svg-icons';
import { AppearanceModeService } from './services/appearance-mode.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  constructor(private http: HttpClient) {}
  // ------------------- Separator -------------------
  appearanceModeHandler = new AppearanceModeService();
  buttonsFunctionalityServer = new ButtonsService(this.http);
  title = 'Calculator';
  calcFields: CalcFieldI = { firstNum: '', op: '', secondNum: '', ans: '' };
  sunIcon = faSun;
  private darkMode = true;
  buttonsArrayPro = <ButtonI[]>(
    this.buttonsFunctionalityServer.getButtonsPalette()
  );
  // ------------------- Separator -------------------
  press(button: ButtonI) {
    if (button.type == 'op')
      this.buttonsFunctionalityServer.pressOnOperator(this.calcFields, button);
    else this.buttonsFunctionalityServer.pressOnNum(this.calcFields, button);
    console.log(this.calcFields);
  }
  // ------------------- Separator -------------------
  pressAMButton() {
    this.darkMode = this.appearanceModeHandler.toggleAppearanceMode(
      this.darkMode
    );
  }
  // ------------------- Separator -------------------
}

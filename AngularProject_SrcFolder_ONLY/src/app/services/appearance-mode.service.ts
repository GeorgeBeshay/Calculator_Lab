import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class AppearanceModeService {
  constructor() {}
  toggleAppearanceMode(darkMode: boolean) {
    if (darkMode) {
      document.documentElement.style.setProperty('--color1', '#0466c8');
      document.documentElement.style.setProperty('--color2', '#979dac');
      document.documentElement.style.setProperty(
        '--darkModeButtonColor',
        '#db2b39'
      );
      document.documentElement.style.setProperty('--signatureColor', '#0466c8');
    } else {
      document.documentElement.style.setProperty('--color1', '#140f2d');
      document.documentElement.style.setProperty('--color2', '#f22b29');
      document.documentElement.style.setProperty(
        '--darkModeButtonColor',
        '#376996'
      );
      document.documentElement.style.setProperty('--signatureColor', '#f22b29');
    }
    darkMode = !darkMode;
    return darkMode;
  }
}

import { TestBed } from '@angular/core/testing';

import { AppearanceModeService } from './appearance-mode.service';

describe('AppearanceModeService', () => {
  let service: AppearanceModeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AppearanceModeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

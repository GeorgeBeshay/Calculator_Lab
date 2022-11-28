import { TestBed } from '@angular/core/testing';

import { LogicCheckerService } from './logic-checker.service';

describe('LogicCheckerService', () => {
  let service: LogicCheckerService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LogicCheckerService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

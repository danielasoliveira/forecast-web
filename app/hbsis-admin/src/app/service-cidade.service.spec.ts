import { TestBed } from '@angular/core/testing';

import { ServiceCidadeService } from './service-cidade.service';

describe('ServiceCidadeService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiceCidadeService = TestBed.get(ServiceCidadeService);
    expect(service).toBeTruthy();
  });
});

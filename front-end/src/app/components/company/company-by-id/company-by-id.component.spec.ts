import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CompanyByIdComponent } from './company-by-id.component';

describe('CompanyByIdComponent', () => {
  let component: CompanyByIdComponent;
  let fixture: ComponentFixture<CompanyByIdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CompanyByIdComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CompanyByIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AggiungiSoftwareComponent } from './aggiungi-software.component';

describe('AggiungiSoftwareComponent', () => {
  let component: AggiungiSoftwareComponent;
  let fixture: ComponentFixture<AggiungiSoftwareComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AggiungiSoftwareComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AggiungiSoftwareComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

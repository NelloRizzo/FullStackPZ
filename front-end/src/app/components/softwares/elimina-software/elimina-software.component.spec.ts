import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EliminaSoftwareComponent } from './elimina-software.component';

describe('EliminaSoftwareComponent', () => {
  let component: EliminaSoftwareComponent;
  let fixture: ComponentFixture<EliminaSoftwareComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EliminaSoftwareComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EliminaSoftwareComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SoftwarelistComponent } from './softwarelist.component';

describe('SoftwarelistComponent', () => {
  let component: SoftwarelistComponent;
  let fixture: ComponentFixture<SoftwarelistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SoftwarelistComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SoftwarelistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

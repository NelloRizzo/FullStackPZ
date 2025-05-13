import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeleteLicenseComponent } from './delete-license.component';

describe('DeleteLicenseComponent', () => {
  let component: DeleteLicenseComponent;
  let fixture: ComponentFixture<DeleteLicenseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [DeleteLicenseComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DeleteLicenseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { Component } from '@angular/core';
import { LicenseService } from '../../../services/license/license.service';

@Component({
  selector: 'app-license',
  imports: [],
  templateUrl: './license.component.html',
  styleUrl: './license.component.css'
})
export class LicenseComponent {
 constructor(private licenseService:LicenseService){}
 
}

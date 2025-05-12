import { Component } from '@angular/core';
import { LicenseService } from '../../../services/license/license.service';
import { addlicenseModel } from '../../../services/models/addLicenseModel';
import { FormsModule, NgForm, NgModel } from '@angular/forms';

@Component({
  selector: 'app-license',
  imports: [FormsModule],
  templateUrl: './license.component.html',
  styleUrl: './license.component.css'
})
export class LicenseComponent {
 constructor(private licenseService:LicenseService){}
 addLicense: addlicenseModel={
  life:0,
  price:0,
  type:"",
  softwareId:0
 }

 onSubmit(){
  this.licenseService.addLicense(this.addLicense).subscribe( {  
     next: () => {
        alert('Licenza salvata con successo!');
      },
      error: (err) => {
        console.error('Errore nel salvataggio:', err);
      }
 })
  }
}
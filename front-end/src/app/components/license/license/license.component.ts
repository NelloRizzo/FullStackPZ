import { Component } from '@angular/core';
import { LicenseService } from '../../../services/license/license.service';
import { addlicenseModel } from '../../../services/models/addLicenseModel';
import { FormsModule, NgForm, NgModel } from '@angular/forms';
import { NgFor } from '@angular/common';
import { SoftwareService } from '../../../services/software-services/software.service';
import { Software } from '../../../services/models';

@Component({
  selector: 'app-license',
  imports: [FormsModule,NgFor],
  templateUrl: './license.component.html',
  styleUrl: './license.component.css'
})
export class LicenseComponent {
 constructor(private licenseService:LicenseService, private softwareService:SoftwareService){}
 addLicense: addlicenseModel={
  life:0,
  price:0,
  type:"",
  softwareId:0
 }
 softwareList: Software[]=[]

 ngOnInit(){
  this.softwareService.getallsoftwares().subscribe(s=>{this.softwareList=s})
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
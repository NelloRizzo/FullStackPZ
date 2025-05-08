import { Component } from '@angular/core';
import { LicenseService } from '../../../services/license/license.service';
import { LicenseComponent } from '../license/license.component';
import { NgFor } from '@angular/common';
import { licenseModel } from '../../../services/models/licenseModel';

@Component({
  selector: 'app-license-list',
  imports: [NgFor],
  templateUrl: './license-list.component.html',
  styleUrl: './license-list.component.css'
})
export class LicenseListComponent {

  constructor(private licenseService:LicenseService){ }
  licenseList:licenseModel[]=[]

  ngOnInit(){
    this.licenseService.getLicences().subscribe(l=>{
      this.licenseList=l;
    });
  }

}

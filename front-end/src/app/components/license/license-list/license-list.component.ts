import { Component } from '@angular/core';
import { LicenseService } from '../../../services/license/license.service';
import { LicenseComponent } from '../license/license.component';
import { NgFor } from '@angular/common';
import { licenseModel } from '../../../services/models/licenseModel';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-license-list',
  imports: [NgFor,RouterLink],
  templateUrl: './license-list.component.html',
  styleUrl: './license-list.component.css'
})
export class LicenseListComponent {

  constructor(private licenseService:LicenseService){ }
  licenseList:licenseModel[]=[]

  ngOnInit(){
    this.licenseService.getLicenses().subscribe(l=>{
      this.licenseList=l;
    });
  }

}

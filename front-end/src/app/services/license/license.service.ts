import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { LicenseListComponent } from '../../components/license/license-list/license-list.component';
import { LicenseComponent } from '../../components/license/license/license.component';
import { licenseModel } from '../models/licenseModel';
import { addlicenseModel } from '../models/addLicenseModel';

@Injectable({
  providedIn: 'root'
})
export class LicenseService {

  constructor(private http: HttpClient) { }

  getLicenses():Observable<licenseModel[]>{
    return this.http.get<licenseModel[]>('/api/license/showAll')
  }

  addLicense(license:addlicenseModel){
    return this.http.post('/api/license/add',license)
  }

  
}

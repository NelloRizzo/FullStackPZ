import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { LicenseListComponent } from '../../components/license/license-list/license-list.component';
import { LicenseComponent } from '../../components/license/license/license.component';
import { licenseModel } from '../models/licenseModel';

@Injectable({
  providedIn: 'root'
})
export class LicenseService {

  constructor(private http: HttpClient) { }

  getLicences():Observable<licenseModel[]>{
    return this.http.get<licenseModel[]>('/api/license/showAll')
  }

  addLicence(license:licenseModel){
    return this.http.post('/api/license/add',license)
  }

  
}

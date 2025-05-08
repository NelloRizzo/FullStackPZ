import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Company } from './company.model';


@Injectable({
  providedIn: 'root'
})
export class CompanyServiceService {

  constructor(private http: HttpClient) { }

  getAllCompanies(): Observable<Company[]> {
    return this.http.get<Company[]>('/api/azienda/all');
  }

  addCompany(newCompany: Company) : Observable<Company>{
    return this.http.post<Company>('/api/azienda', newCompany);
  }
  
}

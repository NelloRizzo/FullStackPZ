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
  getCompanyById(idCompany: number): Observable<Company>{
    return this.http.get<Company>('/api/azienda/'+idCompany);
  }
  addCompany(newCompany: Company) : Observable<Company>{
    return this.http.post<Company>('/api/azienda', newCompany);
  }
  deleteCompany(idCompany: number): Observable<void>{
    return this.http.delete<void>('/api/azienda/delete/'+idCompany);
  }
}

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Software } from './models';


const apiconfig = {
  baseUrl: 'http://localhost:8080/api/softwares',
  endpoints: {
    allsoftwares: '/allsoftwares',
    generate: '/generate',
  }
};


@Injectable({
  providedIn: 'root'
})
export class SoftwareService {

  constructor(private http:HttpClient) { }

    getallsoftwares(): Observable<Software[]> {
      return this.http
      .get<Software[]>(apiconfig.baseUrl + apiconfig.endpoints.allsoftwares);
    }

    generaSoftware(software: Software): Observable<void> {
      return this.http.post<void>(apiconfig.baseUrl + apiconfig.endpoints.generate, software);
    }


}

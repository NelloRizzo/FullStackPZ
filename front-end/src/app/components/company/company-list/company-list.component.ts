import { Component } from '@angular/core';
import { CompanyServiceService } from '../../../services/company/company-service.service';
import { Company } from '../../../services/company/company.model';
import { NgFor, NgIf } from '@angular/common';


@Component({
  selector: 'app-company-list',
  imports: [NgFor,NgIf],
  templateUrl: './company-list.component.html',
  styleUrl: './company-list.component.css'
})
export class CompanyListComponent {
  companies : Company[] = [];
  
  constructor(private CompanyService: CompanyServiceService){}
   
  ngOnInit(): void {
      this.CompanyService.getAllCompanies()
      .subscribe({
        next: data => this.companies = data,
        error: err => console.error('Errore durante il recupero delle aziende:', err)
    });
  }
}

import { Component } from '@angular/core';
import { CompanyServiceService } from '../../../services/company/company-service.service';
import { Company } from '../../../services/company/company.model';
import { NgFor, NgIf } from '@angular/common';
import { RouterLink, RouterModule } from '@angular/router';
import { DeleteCompanyComponent } from '../delete-company/delete-company.component';


@Component({
  selector: 'app-company-list',
  imports: [NgFor, NgIf, RouterLink, DeleteCompanyComponent],
  templateUrl: './company-list.component.html',
  styleUrl: './company-list.component.css'
})
export class CompanyListComponent {
  companies : Company[] = [];
  companyToDelete?: Company;
  showDetails = false;
  
  constructor(private CompanyService: CompanyServiceService){}
  
  ngOnInit(): void {
      this.CompanyService.getAllCompanies()
      .subscribe({
        next: data => this.companies = data,
        error: err => console.error('Errore durante il recupero delle aziende:', err)
    });
  }
  showDeleteBanner(company: Company) {
    this.companyToDelete = company;
  }
  onDeleteConfirmed(confirm: boolean) {
    if (confirm && this.companyToDelete) {
      this.CompanyService.deleteCompany(this.companyToDelete.id)
        .subscribe(() => {
          this.companies = this.companies.filter(c => c.id !== this.companyToDelete?.id);
          this.companyToDelete = undefined;
        });
    } else {
      this.companyToDelete = undefined;
    }
  }

}

import { Component } from '@angular/core';
import { Company } from '../../../services/company/company.model';
import { CompanyServiceService } from '../../../services/company/company-service.service';
import { FormsModule } from '@angular/forms';
import { NgIf } from '@angular/common';

@Component({
  selector: 'app-company-by-id',
  imports: [FormsModule, NgIf],
  templateUrl: './company-by-id.component.html',
  styleUrl: './company-by-id.component.css'
})
export class CompanyByIdComponent {
  companyId: number = 0;
  company?: Company;
  
  constructor(private CompanyService: CompanyServiceService){}
  getCompany() {
    if (this.companyId > 0) {
      console.log('Chiamata API per ID:', this.companyId);  // DEBUG: Verifica ID prima della chiamata
  
      this.CompanyService.getCompanyById(this.companyId).subscribe({
        next: data => {
          console.log('Risultato API:', data); // DEBUG: Mostra i dati ricevuti
          this.company = data;
        },
        error: err => {
          console.error('Errore nella chiamata API:', err); // DEBUG: Mostra errori
          this.company = undefined;
        }
      });
    }
  }
}

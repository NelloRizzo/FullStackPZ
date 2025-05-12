import { Component} from '@angular/core';
import { CompanyServiceService } from '../../../services/company/company-service.service';
import { Company } from '../../../services/company/company.model';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-company',
  imports: [FormsModule, CommonModule],
  templateUrl: './add-company.component.html',
  styleUrl: './add-company.component.css'
})
export class AddCompanyComponent {
  
  newCompany: Company = { id: 0, nome: '', partitaIva: '' };

  constructor(private companyService: CompanyServiceService, private router:Router) {}

  onSubmit() {
    this.companyService.addCompany(this.newCompany).subscribe(response => {
      console.log('Azienda creata:', response);
      this.router.navigate(['/company/list']);
    });
  }
}

import { Component} from '@angular/core';
import { CompanyServiceService } from '../../../services/company/company-service.service';
import { Company } from '../../../services/company/company.model';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-add-company',
  imports: [FormsModule, CommonModule],
  templateUrl: './add-company.component.html',
  styleUrl: './add-company.component.css'
})
export class AddCompanyComponent {
  
  newCompany: Company = { id: 0, nome: '', partitaIva: '' };

  constructor(private companyService: CompanyServiceService) {}

  onSubmit() {
    this.companyService.addCompany(this.newCompany).subscribe(response => {
      console.log('Azienda creata:', response);
      alert('Azienda aggiunta con successo!');
      
    });
  }
}

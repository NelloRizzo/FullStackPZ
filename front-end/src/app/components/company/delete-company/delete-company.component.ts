import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CompanyServiceService } from '../../../services/company/company-service.service';

@Component({
  selector: 'app-delete-company',
  imports: [],
  templateUrl: './delete-company.component.html',
  styleUrl: './delete-company.component.css'
})
export class DeleteCompanyComponent {
    id!:number;
    constructor( private route: ActivatedRoute,
    private router: Router, private CompanyService: CompanyServiceService){}

    ngOnInit(): void {
      this.route.paramMap.subscribe(params => {
    this.id = Number(params.get('idCompany'));
    console.log("ID ricevuto:", this.id);
  });
  }

  confirmDeletion() {
    this.CompanyService.deleteCompany(this.id).subscribe(() => {
      this.router.navigate(['/company/list']);
    });
  }
  cancel() {
    this.router.navigate(['/company/list']);
  }
}

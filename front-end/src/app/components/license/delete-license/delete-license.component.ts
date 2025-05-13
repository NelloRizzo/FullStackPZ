import { Component } from '@angular/core';
import { LicenseService } from '../../../services/license/license.service';
import { ActivatedRoute, Router, RouterLink, RouterModule } from '@angular/router';

@Component({
  selector: 'app-delete-license',
  imports: [RouterLink],
  templateUrl: './delete-license.component.html',
  styleUrl: './delete-license.component.css'
})
export class DeleteLicenseComponent {
  constructor(private licenseService:LicenseService,private router:Router,private route:ActivatedRoute){}
  id:number=0
  ngOnInit(){
    this.route.params.subscribe(params => {
      this.id = params['id'];
    });
  }

  onClickDelete(id:number){
    this.licenseService.deleteLicense(id).subscribe();
    this.router.navigate(['/license/list'])
}
onClickBack(){
  this.router.navigate(['/license/list'])
}
}

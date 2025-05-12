import { Component } from '@angular/core';
import { SoftwareService } from '../../../services/software-services/software.service';
import { FormsModule, NgModel } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-elimina-software',
  imports: [FormsModule],
  templateUrl: './elimina-software.component.html',
  styleUrl: './elimina-software.component.css'
})
export class EliminaSoftwareComponent {

  idDaEliminare: number = 0;

  constructor(private softwareService: SoftwareService, private router: Router) { }

  cancellaSoftware(id: number) {
    if (this.idDaEliminare <= 0) {
      alert('Inserire un id valido!');
      return
    }

    this.softwareService.cancellaSoftware(this.idDaEliminare).subscribe(() => {
      alert('Software eliminato con successo!');
      this.router.navigate(['software/list']); // Navigate to the software list page after successful deletion
    },
      error => {
        console.error('Id:', error);
        alert('Software non presente in database!');
    


      })
  }
}

import { Component } from '@angular/core';
import { SoftwareService } from '../../../services/software-services/software.service';
import { FormsModule, NgModel } from '@angular/forms';

@Component({
  selector: 'app-elimina-software',
  imports: [FormsModule],
  templateUrl: './elimina-software.component.html',
  styleUrl: './elimina-software.component.css'
})
export class EliminaSoftwareComponent {

  idDaEliminare: number = 0;

  constructor(private softwareService: SoftwareService) { }

  cancellaSoftware(id: number) {
    if (this.idDaEliminare <= 0) {
      alert('Inserire un id valido!');
      return
    }

    this.softwareService.cancellaSoftware(this.idDaEliminare).subscribe(() => {
      alert('Software eliminato con successo!');
    },
      error => {
        console.error('Id:', error);
        alert('Software non presente in database!');


      })
  }
}

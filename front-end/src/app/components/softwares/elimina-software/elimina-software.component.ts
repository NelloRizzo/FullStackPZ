import { Component } from '@angular/core';
import { SoftwareService } from '../../../services/software-services/software.service';
import { FormsModule, NgModel } from '@angular/forms';
import { ActivatedRoute, Route, Router } from '@angular/router';

@Component({
  selector: 'app-elimina-software',
  imports: [FormsModule],
  templateUrl: './elimina-software.component.html',
  styleUrl: './elimina-software.component.css'
})
export class EliminaSoftwareComponent {

  idDaEliminare: number = 0;

  constructor(private softwareService: SoftwareService,
    private r: ActivatedRoute,
    private routes: Router,
  ) { }

  ngOnInit() {
    this.r.params.subscribe(params => {
      this.idDaEliminare = params['id'];
    });
  }

  cancellaSoftware(id: number) {
    if (this.idDaEliminare <= 0) {
      alert('Inserire un id valido!');
    }

    this.softwareService.cancellaSoftware(this.idDaEliminare).subscribe(() => {
      alert('Software eliminato con successo!');
      this.routes.navigate(['software/list']);
    },
      error => {
        console.error('Id:', error);
        alert('Software non presente in database!');
        this.routes.navigate(['software/list']);
      })
  }
}

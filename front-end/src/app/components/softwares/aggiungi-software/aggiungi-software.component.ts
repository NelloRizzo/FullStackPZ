import { Component } from '@angular/core';
import { Software } from '../../../services/models';
import { FormsModule } from '@angular/forms';
import { SoftwareService } from '../../../services/software-services/software.service';

@Component({
  selector: 'app-aggiungi-software',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './aggiungi-software.component.html',
  styleUrl: './aggiungi-software.component.css'
})
export class AggiungiSoftwareComponent {
  software: Software = {
    name: '',
    version: '',
    id: 0 // Assuming id is auto-generated and not needed for creation
  };

  constructor(private softwareService: SoftwareService) {}

  submit(): void {
    this.softwareService.generaSoftware(this.software).subscribe({
      next: () => {
        alert('Software inserito con successo!');
        this.software = { name: '', version: '' }; // reset
      },
      error: err => {
        console.error('Errore durante l’inserimento:', err);
        alert('Errore durante l’inserimento.');
      }
    });
  }
}

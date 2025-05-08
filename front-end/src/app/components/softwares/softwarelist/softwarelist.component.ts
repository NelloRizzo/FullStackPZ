import { Component, OnInit } from '@angular/core';
import { Software } from '../../../services/models';

import { NgFor } from '@angular/common';
import { SoftwareService } from '../../../services/software-services/software.service';
import { FormsModule, NgModel } from '@angular/forms';

@Component({
  selector: 'app-softwarelist',
  imports: [NgFor, FormsModule],
  templateUrl: './softwarelist.component.html',
  styleUrl: './softwarelist.component.css'
})
export class SoftwarelistComponent implements OnInit {
  softwares: Software[] = [];
  idDaEliminare: number = 0;
  constructor(private softwareService: SoftwareService) { }

  ngOnInit(): void {
    this.softwareService.getallsoftwares().subscribe(response => {
      this.softwares = response;
    })
  }
  cancellaSoftware(id: number) {
    this.softwareService.cancellaSoftware(this.idDaEliminare).subscribe(() => {
      alert('Software eliminato con successo!');
    });
  }
}

import { Component } from '@angular/core';
import { Software } from '../../../services/models';
import { SoftwareService } from '../../../services/software.service';
import { NgFor } from '@angular/common';

@Component({
  selector: 'app-softwarelist',
  imports: [NgFor],
  templateUrl: './softwarelist.component.html',
  styleUrl: './softwarelist.component.css'
})
export class SoftwarelistComponent {
  softwares: Software[] = [];
  constructor (private softwareService: SoftwareService) { }

  nginOnInit() : void{
    this.softwareService.getallsoftwares().subscribe(response => {
      this.softwares = response;
    })
  }
}

import { Component, OnInit } from '@angular/core';
import { Software } from '../../../services/models';

import { NgFor } from '@angular/common';
import { SoftwareService } from '../../../services/software-services/software.service';

@Component({
  selector: 'app-softwarelist',
  imports: [NgFor],
  templateUrl: './softwarelist.component.html',
  styleUrl: './softwarelist.component.css'
})
export class SoftwarelistComponent implements OnInit {
  softwares: Software[] = [];
  constructor (private softwareService: SoftwareService) { }

  ngOnInit() : void{
    this.softwareService.getallsoftwares().subscribe(response => {
      this.softwares = response;
    })
  }
}

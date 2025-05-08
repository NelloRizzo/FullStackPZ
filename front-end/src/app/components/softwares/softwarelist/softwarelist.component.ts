import { Component, OnInit } from '@angular/core';
import { Software } from '../../../services/models';
import { SoftwareService } from '../../../services/software.service';
import { NgFor } from '@angular/common';

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

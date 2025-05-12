import { Component, OnInit } from '@angular/core';
import { Software } from '../../../services/softwareModel';

import { NgFor } from '@angular/common';
import { SoftwareService } from '../../../services/software-services/software.service';
import { FormsModule, NgModel } from '@angular/forms';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-softwarelist',
  imports: [NgFor, FormsModule, RouterLink],
  templateUrl: './softwarelist.component.html',
  styleUrl: './softwarelist.component.css'
})
export class SoftwarelistComponent implements OnInit {
  softwares: Software[] = [];

  constructor(private softwareService: SoftwareService) { }

  ngOnInit(): void {
    this.softwareService.getallsoftwares().subscribe(response => {
      this.softwares = response;
    })
  }
}

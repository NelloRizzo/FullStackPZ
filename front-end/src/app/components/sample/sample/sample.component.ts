import { Component } from '@angular/core';
import { SampleService } from '../../../services/sample/sample.service';

@Component({
  selector: 'app-sample',
  imports: [],
  templateUrl: './sample.component.html',
  styleUrl: './sample.component.css'
})
export class SampleComponent {

  constructor(private sampleService: SampleService) { }
  sampleData: any;

  ngOnInit() {
    this.sampleService.getSampleData().subscribe(data => {
      this.sampleData = data;
    });
  }

}

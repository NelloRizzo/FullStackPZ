import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { SoftwarelistComponent } from './components/softwares/softwarelist/softwarelist.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, SoftwarelistComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'front-end';
}

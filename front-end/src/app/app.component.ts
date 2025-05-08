import { Component } from '@angular/core';
import { LicenseComponent } from './components/license/license/license.component';
import { LicenseListComponent } from './components/license/license-list/license-list.component';
import { LicenseService } from './services/license/license.service';

@Component({
  selector: 'app-root',
  imports: [LicenseListComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Licenses List';
}

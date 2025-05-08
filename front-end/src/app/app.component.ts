import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { CompanyListComponent } from "./components/company/company-list/company-list.component";
import { AddCompanyComponent } from "./components/company/add-company/add-company.component";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, CompanyListComponent, AddCompanyComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'front-end';
}

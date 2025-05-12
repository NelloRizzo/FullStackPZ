import { Routes } from '@angular/router';
import { AddCompanyComponent } from './components/company/add-company/add-company.component';
import { CompanyListComponent } from './components/company/company-list/company-list.component';

export const routes: Routes = [
    { path: '/api/company/list', component: CompanyListComponent},
    { path: '/api/company/add', component: AddCompanyComponent}
];
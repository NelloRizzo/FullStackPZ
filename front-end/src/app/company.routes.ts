import { Routes } from '@angular/router';
import { AddCompanyComponent } from './components/company/add-company/add-company.component';
import { CompanyListComponent } from './components/company/company-list/company-list.component';
import { DeleteCompanyComponent } from './components/company/delete-company/delete-company.component';

const routes: Routes = [
    { path: 'company/list', component: CompanyListComponent},
    { path: 'company/add', component: AddCompanyComponent},
    { path: 'company/delete/:idCompany', component: DeleteCompanyComponent}
];

export default routes;
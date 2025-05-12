import { Routes } from '@angular/router';
import { LicenseListComponent } from './components/license/license-list/license-list.component';
import { LicenseComponent } from './components/license/license/license.component';

const routes: Routes = [
    { path: 'license/list', component: LicenseListComponent },
    { path: 'license/add', component: LicenseComponent }
];

export default routes;
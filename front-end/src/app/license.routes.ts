import { Routes } from '@angular/router';
import { LicenseListComponent } from './components/license/license-list/license-list.component';
import { LicenseComponent } from './components/license/license/license.component';
import { DeleteLicenseComponent } from './components/license/delete-license/delete-license.component';

const routes: Routes = [
    { path: 'license/list', component: LicenseListComponent },
    { path: 'license/add', component: LicenseComponent },
    { path: 'license/delete/:id',component: DeleteLicenseComponent}
];

export default routes;
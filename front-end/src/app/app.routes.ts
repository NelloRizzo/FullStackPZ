import { Routes } from '@angular/router';
import companyRoutes from './company.routes';
import softwareRoutes from './softwate.routes';
import licenseRoutes from './license.routes';

export const routes: Routes = [
    ...companyRoutes,
    ...softwareRoutes,
    ...licenseRoutes
];

import { Routes } from '@angular/router';
import companyRoutes from './company.routes';
import softwareRoutes from './softwate.routes';

export const routes: Routes = [
    ...companyRoutes,
    ...softwareRoutes
];

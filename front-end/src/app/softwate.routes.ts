import { Routes } from '@angular/router';
import { SoftwarelistComponent } from './components/softwares/softwarelist/softwarelist.component';
import { AggiungiSoftwareComponent } from './components/softwares/aggiungi-software/aggiungi-software.component';

const routes: Routes = [
    { path: 'software/list', component: SoftwarelistComponent},
    { path: 'software/add', component: AggiungiSoftwareComponent}
];

export default routes;
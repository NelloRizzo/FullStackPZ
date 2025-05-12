import { Routes } from '@angular/router';
import { SoftwarelistComponent } from './components/softwares/softwarelist/softwarelist.component';
import { AggiungiSoftwareComponent } from './components/softwares/aggiungi-software/aggiungi-software.component';
import { EliminaSoftwareComponent } from './components/softwares/elimina-software/elimina-software.component';

const routes: Routes = [
    { path: 'software/list', component: SoftwarelistComponent},
    { path: 'software/add', component: AggiungiSoftwareComponent},
    { path: 'software/elimina', component: EliminaSoftwareComponent},
];

export default routes;
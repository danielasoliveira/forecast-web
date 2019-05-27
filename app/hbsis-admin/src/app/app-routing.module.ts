import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { CidadeFormComponent } from './cidade-form/cidade-form.component';
import { CidadeListComponent } from './cidade-list/cidade-list.component';

const routes: Routes = [

  { path: '', component: CidadeListComponent },
  { path: 'cidades', component: CidadeListComponent },
  { path: 'addcidade', component: CidadeFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RateListComponent } from './rate-list/rate-list.component';
import { CreateRateComponent } from './create-rate/create-rate.component';

const routes: Routes = [
  { path: '', redirectTo: 'rate', pathMatch: 'full' },
  { path: 'rates', component: RateListComponent },
  { path: 'add', component: CreateRateComponent },
  //{ path: 'update/:id', component: UpdateRateComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

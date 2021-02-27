import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { CustomerComponent } from './customer/customer.component';
import { HomeComponent } from './home/home.component';
import { SimsComponent } from './sims/sims.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  {
    path: 'customer',
    component: CustomerComponent,
  },
  {
    path: 'sim',
    component: SimsComponent,
  },
  { path: '**', redirectTo: '' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}

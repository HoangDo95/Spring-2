import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CartComponent} from './cart/cart.component';
import {HomeComponent} from './home/home.component';
import {DetailComponent} from './detail/detail.component';


const routes: Routes = [
  {path: 'home', component: HomeComponent},
  {path: 'home/cart', component: CartComponent},
  {path: 'hoke/detail', component: DetailComponent},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class BookRoutingModule { }

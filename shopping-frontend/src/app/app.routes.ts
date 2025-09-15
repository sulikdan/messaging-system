import {Routes} from '@angular/router';
import {PageNotFoundComponent} from './others/page-not-found/page-not-found.component';
import {ErrorComponent} from './others/error/error.component';
import {HomeComponent} from './body/home/home.component';
import {ProductsComponent} from './body/products/products.component';
import {CreationComponent} from './body/creation/creation.component';
import {CustomerComponent} from './body/creation/customer/customer.component';
import {ProductComponent} from './body/creation/product/product.component';
import {ProductModelComponent} from './body/creation/product-model/product-model.component';

export const routes: Routes = [
  {
    path: '', children: [
      {path: 'home', component: HomeComponent},
      {path: 'products', component: ProductsComponent},
      {
        path: 'creation', component: CreationComponent, children:
          [
            {path: 'customer', component: CustomerComponent},
            {path: 'product', component: ProductComponent},
            {path: 'product-model', component: ProductModelComponent},
            {path: '', redirectTo: 'customer', pathMatch: 'full'}
          ]
      },
      {path: '', redirectTo: 'home', pathMatch: 'full'}
    ]
  },
  {path: 'error', component: ErrorComponent},
  {path: '**', component: PageNotFoundComponent}

];

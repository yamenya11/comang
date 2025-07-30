import { Routes } from '@angular/router';
import { AddproductfaildComponent } from './addproductfaild.component';
export const routes: Routes = [
 { path: '', redirectTo: 'addproductfaild', pathMatch: 'full' },
  { path: 'addproductfaild', loadComponent: () => import('./addproductfaild.component').then(m => m.AddproductfaildComponent) }

  ];

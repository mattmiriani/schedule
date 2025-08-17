import { Routes } from '@angular/router';
import { LoginComponent } from './auth/login/login.component';
import {HomeComponent} from './home/home.component';
import {LogoutComponent} from './auth/logout/logout.component';

export const appRoutes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: 'login', component: LoginComponent },
  { path: 'home', component: HomeComponent },
  { path: 'logout', component: LogoutComponent },
];

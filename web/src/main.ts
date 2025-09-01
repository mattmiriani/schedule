import { bootstrapApplication } from '@angular/platform-browser';
import { AppComponent } from './app/app';
import { provideHttpClient } from '@angular/common/http';
import { provideOAuthClient } from 'angular-oauth2-oidc';
import { provideRouter } from '@angular/router';
import { appRoutes } from './app/app.routes';
import 'twind/shim'
import './app/twind.config'

bootstrapApplication(AppComponent, {
  providers: [
    provideHttpClient(),
    provideOAuthClient(),
    provideRouter(appRoutes)
  ],
}).catch(err => console.error(err));

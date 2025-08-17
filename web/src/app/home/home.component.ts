import { Component } from '@angular/core';
import { AuthService } from '../auth/auth.service';
import {RouterLink} from '@angular/router';

@Component({
  selector: 'app-home',
  imports: [
    RouterLink
  ],
  templateUrl: './home.component.html'
})
export class HomeComponent {
  constructor(public auth: AuthService) {}
}

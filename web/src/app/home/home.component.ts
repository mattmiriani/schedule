import { Component } from '@angular/core';
import { AuthService } from '../auth/auth.service';
import { Navbar } from "../components/navbar/navbar";

@Component({
  selector: 'app-home',
  imports: [
      Navbar
  ],
  templateUrl: './home.component.html'
})
export class HomeComponent {
  constructor(public auth: AuthService) {}
}

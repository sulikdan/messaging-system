import { Component } from '@angular/core';
import {MatButton, MatIconButton, MatMiniFabButton} from '@angular/material/button';
import {MatIconModule} from '@angular/material/icon';

@Component({
  selector: 'app-header',
  imports: [
    MatButton,
    MatIconModule,
    MatIconButton
  ],
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent {

  isDarkMode = false;

  changeTheme() {
    this.isDarkMode = !this.isDarkMode;
  }
}

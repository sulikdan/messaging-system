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
  templateUrl: './header.html',
  styleUrl: './header.css'
})
export class Header {

  isDarkMode = false;

  changeTheme() {
    this.isDarkMode = !this.isDarkMode;
  }
}

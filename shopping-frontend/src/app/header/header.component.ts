import {Component, inject} from '@angular/core';
import {MatButton, MatIconButton} from '@angular/material/button';
import {MatIconModule} from '@angular/material/icon';
import {SideNavService} from '../others/services/side-nav.service';

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
  sideNavService: SideNavService = inject(SideNavService);

  changeTheme() {
    this.isDarkMode = !this.isDarkMode;
  }

  openMenu() {
    this.sideNavService.openSideNav();
  }
}

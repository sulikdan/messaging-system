import {Component, inject, OnDestroy, OnInit} from '@angular/core';
import {MatButton, MatIconButton} from '@angular/material/button';
import {MatIconModule} from '@angular/material/icon';
import {SideNavService} from '../others/services/side-nav.service';
import {NavigationEnd, Router, RouterLink, RouterLinkActive} from '@angular/router';
import {filter, Subscription} from 'rxjs';

@Component({
  selector: 'app-header',
  imports: [
    MatButton,
    MatIconModule,
    MatIconButton,
    RouterLink,
    RouterLinkActive
  ],
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent implements OnInit, OnDestroy{

  path: string = "";
  subscription$: Subscription | undefined;

  isDarkMode = false;
  sideNavService: SideNavService = inject(SideNavService);


  constructor(private router: Router) {
  }

  ngOnInit() {
    this.subscription$ = this.router.events
      .pipe(filter(e => e instanceof NavigationEnd))
      .subscribe((e) => {
          if (e instanceof NavigationEnd) {
            this.path = e.urlAfterRedirects.split('/')[1];
            console.log("Current path:-" + this.path + "-");
          }
        }
      );
  }

  changeTheme() {
    this.isDarkMode = !this.isDarkMode;
  }

  openMenu() {
    // this.sideNavService.openSideNav();
    this.sideNavService.changeSideNavState();
  }

  ngOnDestroy() {
    if (this.subscription$) {
      this.subscription$.unsubscribe();
    }
  }
}

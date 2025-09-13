import {Component, OnDestroy, OnInit, signal, Signal, ViewChild} from '@angular/core';
import {MatDrawer, MatSidenav, MatSidenavContainer} from '@angular/material/sidenav';
import {SideNavService} from '../../others/services/side-nav.service';
import {MatIconModule} from '@angular/material/icon';
import {MatListItem, MatNavList} from '@angular/material/list';
import {MatIconButton} from '@angular/material/button';
import {AppMaterialModule} from '../../app-material.module';
import {NavigationEnd, Router, RouterLink, RouterLinkActive} from '@angular/router';
import {filter, Subscription} from 'rxjs';

@Component({
  selector: 'app-side-nav',
  imports: [
    MatIconModule,
    MatSidenavContainer,
    MatSidenav,
    MatNavList,
    MatIconButton,
    MatListItem,
    RouterLink,
    RouterLinkActive
  ],
  templateUrl: './side-nav.component.html',
  styleUrl: './side-nav.component.css',
})
export class SideNavComponent implements OnInit, OnDestroy {


  sideNavService: SideNavService;
  isShownSignal: Signal<boolean> = signal(false);

  @ViewChild('drawer') drawer: MatDrawer | undefined;


  constructor(private router: Router, sideNavService: SideNavService) {
    this.sideNavService = sideNavService;
  }

  ngOnInit(): void {
    this.drawer?.close().then(r => {
      console.log("Closing drawer by default.")
    });


    this.isShownSignal = this.sideNavService.getIsSideNavOpen().asReadonly();
  }


  changeSideNavState() {
    if(this.isShownSignal()){
      this.sideNavService.collapseSideNav()
    } else {
      this.sideNavService.openSideNav()
    }
  }

  ngOnDestroy() {
  }
}

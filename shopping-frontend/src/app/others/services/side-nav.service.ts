import {Injectable, Signal, signal} from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SideNavService {

  private isSideNavOpen = signal<boolean>(false);


  openSideNav(){
    this.isSideNavOpen.set(true);
  }

  collapseSideNav() {
    this.isSideNavOpen.set(false);
  }

  public getIsSideNavOpen(){
    return this.isSideNavOpen;
  }



}

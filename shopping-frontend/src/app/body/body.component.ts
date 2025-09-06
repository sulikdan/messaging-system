import { Component } from '@angular/core';
import {SideNavComponent} from './side-nav/side-nav.component';
import {RouterOutlet} from '@angular/router';

@Component({
  selector: 'app-body',
  imports: [
    SideNavComponent,
    RouterOutlet
  ],
  templateUrl: './body.component.html',
  styleUrl: './body.component.css'
})
export class BodyComponent {

}

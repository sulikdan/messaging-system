import { Component } from '@angular/core';
import {SideNavCreationComponent} from './creation/side-nav-creation/side-nav-creation.component';
import {RouterOutlet} from '@angular/router';

@Component({
  selector: 'app-body',
  imports: [
    RouterOutlet
  ],
  templateUrl: './body.component.html',
  styleUrl: './body.component.css'
})
export class BodyComponent {

}

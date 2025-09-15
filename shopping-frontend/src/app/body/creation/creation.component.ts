import { Component } from '@angular/core';
import {RouterOutlet} from '@angular/router';
import {SideNavCreationComponent} from './side-nav-creation/side-nav-creation.component';

@Component({
  selector: 'app-creation',
  imports: [
    RouterOutlet,
    SideNavCreationComponent
  ],
  templateUrl: './creation.component.html',
  styleUrl: './creation.component.css'
})
export class CreationComponent {

}

import { Component } from '@angular/core';
import {
  MatCard,
  MatCardActions,
  MatCardContent,
  MatCardHeader,
  MatCardSubtitle,
  MatCardTitle
} from '@angular/material/card';
import {MatButton} from '@angular/material/button';
import {MatFormField} from '@angular/material/form-field';
import {MatLabel} from '@angular/material/form-field';
import {MatInput} from '@angular/material/input';
import {ReactiveFormsModule} from '@angular/forms';

@Component({
  selector: 'app-customer',
  imports: [
    MatCard,
    MatCardHeader,
    MatCardTitle,
    MatCardSubtitle,
    MatCardActions,
    MatButton,
    MatCardContent,
    MatFormField,
    MatLabel,
    MatInput,
    ReactiveFormsModule
  ],
  templateUrl: './customer.component.html',
  styleUrl: './customer.component.css'
})
export class CustomerComponent {




  createCustomer() {

  }

  resetTemplate() {

  }
}

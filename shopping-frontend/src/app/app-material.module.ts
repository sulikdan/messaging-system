import {MatIconModule, MatIconRegistry} from '@angular/material/icon';
import {Injectable, NgModule} from '@angular/core';

@NgModule({
  imports: [MatIconModule]
})
export class AppMaterialModule {

  constructor(private iconRegistry: MatIconRegistry) {
    iconRegistry.setDefaultFontSetClass("material-icons-round", "mat-ligature-font", "blue900");
  }
}

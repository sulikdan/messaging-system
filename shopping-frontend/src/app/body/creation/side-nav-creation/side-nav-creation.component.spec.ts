import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SideNavCreationComponent } from './side-nav-creation.component';

describe('SideNavCreationComponent', () => {
  let component: SideNavCreationComponent;
  let fixture: ComponentFixture<SideNavCreationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SideNavCreationComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SideNavCreationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

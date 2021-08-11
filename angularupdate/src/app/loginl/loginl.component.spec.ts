import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginlComponent } from './loginl.component';

describe('LoginlComponent', () => {
  let component: LoginlComponent;
  let fixture: ComponentFixture<LoginlComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LoginlComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LoginlComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

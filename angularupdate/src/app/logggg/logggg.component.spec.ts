import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoggggComponent } from './logggg.component';

describe('LoggggComponent', () => {
  let component: LoggggComponent;
  let fixture: ComponentFixture<LoggggComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LoggggComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LoggggComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

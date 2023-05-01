import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SaveVideoDeatilsComponent } from './save-video-deatils.component';

describe('SaveVideoDeatilsComponent', () => {
  let component: SaveVideoDeatilsComponent;
  let fixture: ComponentFixture<SaveVideoDeatilsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SaveVideoDeatilsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SaveVideoDeatilsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

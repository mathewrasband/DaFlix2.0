import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SaveVideoDeatilsComponent } from './save-video-deatils/save-video-deatils.component';
import { UploadVideoComponent } from './upload-video/upload-video.component';

const routes: Routes = [
  {
    path: 'upload-video', component: UploadVideoComponent,
  },
  {
    path: 'save-video-details', component: SaveVideoDeatilsComponent,
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

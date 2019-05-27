 
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule, } from '@angular/common/http';
import { CidadeFormComponent } from './cidade-form/cidade-form.component';
import { FormsModule } from '@angular/forms';
import { CidadeService } from './cidade.service';
import { CidadeListComponent } from './cidade-list/cidade-list.component';



@NgModule({
  declarations: [
    AppComponent,
    CidadeFormComponent,
    CidadeListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [CidadeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
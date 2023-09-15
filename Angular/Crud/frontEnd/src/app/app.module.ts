import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { ListEmpresasComponent } from './components/list-empresas/list-empresas.component';
import { AddEditEmpresasComponent } from './components/add-edit-empresas/add-edit-empresas.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    ListEmpresasComponent,
    AddEditEmpresasComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

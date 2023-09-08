import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { ListProductosComponent } from './components/list-productos/list-productos.component';
import { AddEditProductsComponent } from './components/add-edit-products/add-edit-products.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    ListProductosComponent,
    AddEditProductsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

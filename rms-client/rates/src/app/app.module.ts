import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AuthRoutingModule } from './auth-routing.module';
import { CreateRateComponent } from './create-rate/create-rate.component';
import { RateDetailsComponent } from './rate-details/rate-details.component';
import { RateListComponent } from './rate-list/rate-list.component';

@NgModule({
  declarations: [
    CreateRateComponent,
    RateDetailsComponent,
    RateListComponent
  ],
  imports: [
    FormsModule,
    BrowserModule,
    AppRoutingModule,
    AuthRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

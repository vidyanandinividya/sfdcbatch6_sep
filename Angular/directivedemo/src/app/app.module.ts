import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TestComponent } from './test/test.component';
import { ExerciseComponent } from './exercise/exercise.component';
import { BasicHighlightDirectiveDirective } from './basic-highlight-directive.directive';
import { BetterHighlightDirectiveDirective } from './better-highlight-directive.directive';

@NgModule({
  declarations: [
    AppComponent,
    TestComponent,
    ExerciseComponent,
    BasicHighlightDirectiveDirective,
    BetterHighlightDirectiveDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

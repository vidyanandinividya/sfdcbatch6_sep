import { Component } from '@angular/core';
import { Employee } from './employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'tdf';
  topics=['Angular','React','Vue']
  emp=new Employee('John','john@gmail.com',1234354390,'','morning',true)
  onSubmit()
  {
    console.log(this.emp)
  }
}

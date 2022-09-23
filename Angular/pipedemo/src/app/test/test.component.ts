import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template:`
  <h2>{{name | lowercase}} </h2>
  <h2>{{name | uppercase}} </h2>
  <h2>{{message | titlecase}} </h2>
  <h2>{{message | slice:5:7}} </h2>
  <h2>{{employee | json}} </h2>
  <h2>{{5.678 | number:'1.2-3'}} </h2>
  <h2>{{5.678 | number:'3.4-5'}} </h2>
  <h2>{{5.678 | number:'3.1-2'}} </h2>
  <h2>{{0.25 | percent}} </h2>
  <h2>{{0.25 | currency}} </h2>
  <h2>{{0.25 | currency:'INR'}} </h2>
  <h2>{{0.25 | currency:'EUR'}} </h2>
  <h2>{{0.25 | currency:'INR':'code'}} </h2>
  <h2>{{date}}</h2>
  <h2>{{date|date:'short'}}</h2>
  <h2>{{date|date:'shortDate'}}</h2>
  <h2>{{date|date:'shortTime'}}</h2>
  <h2>{{20|demo:total}}</h2>
  `,
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {
  name="Capgemini"
  message="welcome to capgemini"
  employee={
    "firstName":"John",
    "lastName":"smith"
  }
  total=50;
  date=new Date();
  constructor() { }

  ngOnInit(): void {
  }

}

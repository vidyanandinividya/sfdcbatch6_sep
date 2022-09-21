import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-first',
 // templateUrl: './first.component.html',
  template:`
  <h3>My First Component Template</h3>
  `,
  //styleUrls: ['./first.component.css']
  styles:[
    `
    h3{
      color:red;
    }
    `
  ]
})
export class FirstComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}

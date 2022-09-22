import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {
displayName=false
color="blue"
colors=["red","green","blue","yellow"]
employees=[
  {name:'john',email:'john@gmail.com',phone:'1234567'},
  {name:'annie',email:'annie@gmail.com',phone:'76543318'},
  {name:'hary',email:'hary@gmail.com',phone:'456779889'},
  {name:'jack',email:'jack@gmail.com',phone:'1234567'},
]
  constructor() { }

  ngOnInit(): void {
  }

}

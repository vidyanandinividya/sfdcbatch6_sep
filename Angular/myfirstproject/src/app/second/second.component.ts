import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-second',
  templateUrl: './second.component.html',
  styleUrls: ['./second.component.css']
})
export class SecondComponent implements OnInit {
  title:string="Data Binding Demo"
  num1:number=10
  num2:number=20
  names=['john','jack','tom']
  buttonDisabled=true
  nameDetails='The name is display in paragraph'
  name='vidya'
  updateName()
  {
    this.name='John'
  }
  fullName:string="vidya mishra"
  constructor() { }

  ngOnInit(): void {
  }

}

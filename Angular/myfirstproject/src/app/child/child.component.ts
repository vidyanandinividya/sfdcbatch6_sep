import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';


@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {
//@Input() parentData!:string;
@Input('parentData') name!:string;
@Output() childEvent=new EventEmitter();
  constructor() { }

  ngOnInit(): void {
  }
  fireEvent()
  {
    this.childEvent.emit('Hey Parent');
  }

}

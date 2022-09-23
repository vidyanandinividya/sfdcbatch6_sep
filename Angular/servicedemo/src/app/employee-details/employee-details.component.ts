import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee-details',
  template:`
  <h2>Employee List</h2>
  <h2>{{errorMessage}}</h2>
  <ul *ngFor="let employee of employees">
    <li>{{employee.id}}.{{employee.name}} - {{employee.age}}</li>
  </ul>
  
  `,
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent implements OnInit {
  public employees:any=[]
  public errorMessage:any;
  constructor(private _empService:EmployeeService) { }

  ngOnInit(): void {
      this._empService.getEmployee()
          .subscribe(data=>this.employees=data,
            error=>this.errorMessage=error)
  }

}

import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
emp=new Employee();
empList:any=[];
  constructor(private empService:EmployeeService) { }

  ngOnInit(): void {
    
  }
  onSubmit()
  {
  this.empService.addEmployee(this.emp).subscribe({
    next:(data)=>{
    let msg=data?"Employee registered successfully":"OOPs!! some error occured";
    console.log(data);
    alert(msg)
  },
  error:
  (error)=>{
    console.log(error);
    alert("OOPs!! some error occured")
  }
})
  }
  getUser()
  {
    this.empService.getEmployee().subscribe(data=>{
      console.log(data)
      this.empList=data

    })
  }
  deleteEmployee(id:any)
  {
    this.empService.deleteEmployee(id).subscribe((data)=>{
      console.log(data)
    })
  }

}

import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './employee';
import { throwError, of } from 'rxjs';
import { catchError } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private _url:string="http://localhost:3000/employee"
  
  getEmployee():Observable<Employee[]>
  {
    /*return [
      {"id":1,"name":'Andrew',"age":30},
      {"id":2,"name":'Brandon',"age":25},
      {"id":3,"name":'Christina',"age":26},
      {"id":4,"name":'Elena',"age":31}
    ]*/
    return this.http.get<Employee[]>(this._url).pipe(
      catchError(error=>{
        return throwError(error.message|| "Server Error");
      })
    )
                    
  }
 addEmployee(employee:Employee)
 {
  return this.http.post(this._url,employee)
 }
 deleteEmployee(id:any)
 {
  let url=`http://localhost:3000/employee/${id}`
  return this.http.delete(url)
 }
  constructor(private http:HttpClient) { }
}

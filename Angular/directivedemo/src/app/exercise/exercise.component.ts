import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-exercise',
  templateUrl: './exercise.component.html',
  styleUrls: ['./exercise.component.css']
})
export class ExerciseComponent implements OnInit {
showSecret=false;
log:any=[];
onToggleDetails()
{
  this.showSecret=!this.showSecret
  this.log.push(this.log.length + 1)
}
  constructor() { }

  ngOnInit(): void {
  }

}

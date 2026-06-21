import { Component } from '@angular/core';

import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-courses',
  imports: [CommonModule, FormsModule],
  templateUrl: './courses.html',
  styleUrl: './courses.css'
})
export class Courses {

  courses = [
    {
      id: 1,
      name: "Angular",
      duration: "30 Days"
    },
    {
      id: 2,
      name: "Spring Boot",
      duration: "25 Days"
    },
    {
      id: 3,
      name: "Java",
      duration: "20 Days"
    }
  ];

  selectedCourse = "";
  searchText="";


enroll(courseName:string){

  this.selectedCourse = courseName;

}

}
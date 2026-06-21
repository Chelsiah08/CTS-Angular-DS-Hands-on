import { Component } from '@angular/core';
import { Header } from './components/header/header';
import { Home } from './pages/home/home';
import { Courses } from './pages/courses/courses';

@Component({
  selector: 'app-root',
  imports: [
    Header,
    Home,
    Courses
  ],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
}
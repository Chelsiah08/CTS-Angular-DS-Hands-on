package com.chelsia.studentmanagement.controller;

import com.chelsia.studentmanagement.model.Student;
import com.chelsia.studentmanagement.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public String addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id,
                                @RequestBody Student updatedStudent) {
        return studentService.updateStudent(id, updatedStudent);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        return studentService.deleteStudent(id);
    }

    @GetMapping("/name/{name}")
    public List<Student> getStudentByName(@PathVariable String name) {
        return studentService.getStudentByName(name);
    }

    @GetMapping("/department/{department}")
    public List<Student> getStudentByDepartment(@PathVariable String department) {
        return studentService.getStudentByDepartment(department);
    }

    @GetMapping("/name/{name}/department/{department}")
    public List<Student> getStudentByNameAndDepartment(@PathVariable String name,
                                                       @PathVariable String department) {
        return studentService.getStudentByNameAndDepartment(name, department);
    }

    @GetMapping("/sort/name/asc")
    public List<Student> getStudentsByNameAsc() {
        return studentService.getStudentsByNameAsc();
    }

    @GetMapping("/sort/name/desc")
    public List<Student> getStudentsByNameDesc() {
        return studentService.getStudentsByNameDesc();
    }

    @GetMapping("/sort/department/asc")
    public List<Student> getStudentsByDepartmentAsc() {
        return studentService.getStudentsByDepartmentAsc();
    }

    @GetMapping("/jpql/department/{department}")
    public List<Student> getStudentsByDepartmentJPQL(@PathVariable String department) {
        return studentService.getStudentsByDepartmentJPQL(department);
    }

    @GetMapping("/native/department/{department}")
    public List<Student> getStudentsByDepartmentNative(@PathVariable String department) {
        return studentService.getStudentsByDepartmentNative(department);
    }

    @GetMapping("/search/{name}")
    public List<Student> searchStudent(@PathVariable String name) {
        return studentService.searchStudent(name);
    }

    @GetMapping("/starts/{name}")
    public List<Student> getStudentsStartingWith(@PathVariable String name){
        return studentService.getStudentsStartingWith(name);
    }

    @GetMapping("/ends/{name}")
    public List<Student> getStudentsEndingWith(@PathVariable String name){
        return studentService.getStudentsEndingWith(name);
    }

    @GetMapping("/count/{department}")
    public long countStudents(@PathVariable String department){
        return studentService.countStudents(department);
    }

    @GetMapping("/exists/{name}")
    public boolean existsStudent(@PathVariable String name){
        return studentService.existsStudent(name);
    }

    @DeleteMapping("/delete/{name}")
    public void deleteStudentByName(@PathVariable String name){
        studentService.deleteStudentByName(name);
    }
}
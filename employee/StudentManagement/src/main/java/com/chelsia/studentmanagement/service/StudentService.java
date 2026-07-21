package com.chelsia.studentmanagement.service;

import com.chelsia.studentmanagement.model.Student;
import com.chelsia.studentmanagement.repository.StudentRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Add Student
    public String addStudent(Student student) {

        studentRepository.save(student);

        return "Student Added Successfully!";
    }

    // Get All Students
    public List<Student> getAllStudents() {

        return studentRepository.findAll();

    }

    // Get Student By ID
    public Student getStudentById(int id) {

        Optional<Student> student = studentRepository.findById(id);

        return student.orElse(null);
    }

    // Update Student
    public String updateStudent(int id, Student updatedStudent) {

        Optional<Student> studentOptional = studentRepository.findById(id);

        if (studentOptional.isPresent()) {

            Student student = studentOptional.get();

            student.setName(updatedStudent.getName());
            student.setDepartment(updatedStudent.getDepartment());

            studentRepository.save(student);

            return "Student Updated Successfully!";
        }

        return "Student Not Found!";
    }

    // Delete Student
    public String deleteStudent(int id) {

        if (studentRepository.existsById(id)) {

            studentRepository.deleteById(id);

            return "Student Deleted Successfully!";
        }

        return "Student Not Found!";
    }

    public List<Student> getStudentByName(String name) {
        return studentRepository.findByName(name);
    }

    public List<Student> getStudentByDepartment(String department) {
        return studentRepository.findByDepartment(department);
    }

    public List<Student> getStudentByNameAndDepartment(String name, String department) {
        return studentRepository.findByNameAndDepartment(name, department);
    }

    public List<Student> getStudentsByNameAsc() {
        return studentRepository.findAllByOrderByNameAsc();
    }

    public List<Student> getStudentsByNameDesc() {
        return studentRepository.findAllByOrderByNameDesc();
    }

    public List<Student> getStudentsByDepartmentAsc() {
        return studentRepository.findAllByOrderByDepartmentAsc();
    }

    public List<Student> getStudentsByDepartmentJPQL(String department) {
        return studentRepository.getStudentsByDepartmentJPQL(department);
    }

    public List<Student> getStudentsByDepartmentNative(String department) {
        return studentRepository.getStudentsByDepartmentNative(department);
    }

    public List<Student> searchStudent(String name) {
        return studentRepository.findByNameContaining(name);
    }

    public List<Student> getStudentsStartingWith(String name){
        return studentRepository.findByNameStartingWith(name);
    }

    public List<Student> getStudentsEndingWith(String name){
        return studentRepository.findByNameEndingWith(name);
    }

    public long countStudents(String department){
        return studentRepository.countByDepartment(department);
    }

    public boolean existsStudent(String name){
        return studentRepository.existsByName(name);
    }

    public void deleteStudentByName(String name){
        studentRepository.deleteByName(name);
    }

}
package com.chelsia.studentmanagement.repository;

import com.chelsia.studentmanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findByName(String name);

    List<Student> findByDepartment(String department);

    List<Student> findByNameAndDepartment(String name, String department);

    List<Student> findAllByOrderByNameAsc();

    List<Student> findAllByOrderByNameDesc();

    List<Student> findAllByOrderByDepartmentAsc();

    @Query("SELECT s FROM Student s WHERE s.department = ?1")
    List<Student> getStudentsByDepartmentJPQL(String department);

    @Query(value = "SELECT * FROM student WHERE department = ?1", nativeQuery = true)
    List<Student> getStudentsByDepartmentNative(String department);

    List<Student> findByNameContaining(String name);

    List<Student> findByNameStartingWith(String name);

    List<Student> findByNameEndingWith(String name);

    long countByDepartment(String department);

    boolean existsByName(String name);

    void deleteByName(String name);

}
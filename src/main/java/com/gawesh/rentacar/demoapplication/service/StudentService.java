package com.gawesh.rentacar.demoapplication.service;

import com.gawesh.rentacar.demoapplication.model.Student;

public interface StudentService {

    Student save(Student student);

    Student fetchStudentById(int id);
}

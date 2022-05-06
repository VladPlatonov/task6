package com.platonov.lab6.model.service;


import com.platonov.lab6.model.entity.Student;
import com.platonov.lab6.model.repo.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    public void save(Student student){
        studentRepository.save(student);
    }
    public void delete(Long id){
        studentRepository.deleteById(id);
    }
}

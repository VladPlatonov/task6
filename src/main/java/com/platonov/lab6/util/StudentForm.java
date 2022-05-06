package com.platonov.lab6.util;


import com.platonov.lab6.model.entity.Student;
import lombok.Data;

@Data
public class StudentForm {

    String name;
    String surname;
    Integer age;

    public Student toStudent(){
        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);
        student.setAge(age);
        return student;
    }
}

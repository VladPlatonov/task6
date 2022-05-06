package com.platonov.lab6.model.entity;
import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String surname;
    Integer age;
}

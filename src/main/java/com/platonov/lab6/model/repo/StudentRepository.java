package com.platonov.lab6.model.repo;

import com.platonov.lab6.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}

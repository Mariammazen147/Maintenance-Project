package com.example.LMS.repositories;

import com.example.LMS.models.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel,Integer> {

}

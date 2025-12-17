package com.example.demo.repository;

import org.springframework.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.StudentEntity;
@Repository
public interface StudentRepo extends JpaRepository<StudentEntity,Integer>{

}

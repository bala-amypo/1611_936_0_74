package com.example.demo.repository;

import org.springframework.jpa.repository.JpaRepository;
import org.springframework.sterotype.Repository;
import com.example.demo.entity.StudentEntity;
@Repository
public Interface StudentRepo extends JpaRepository<StudentEntity,Integer>{

}

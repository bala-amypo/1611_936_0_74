package com.example.demo.repository;


import org.springframework.sterotype.Repository;
@Repository
public Interface StudentRepo extends JpaRepository<StudentEntity,Integer>{

}

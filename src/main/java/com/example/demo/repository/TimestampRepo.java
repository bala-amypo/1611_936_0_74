package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Timestamp;
import com.example.demo.entity.ValidationEntity;
@Repository
public interface TimestampRepo extends JpaRepository<Timestamp,Long>{

}

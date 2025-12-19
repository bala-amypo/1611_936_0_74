package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.IdDetailsRepo;
import com.example.demo.entity.ValidationEntity;
@Repository
public interface IdDetailsRepo extends JpaRepository<IdDetails,Long>{

}

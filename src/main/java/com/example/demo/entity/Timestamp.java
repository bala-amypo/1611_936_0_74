package com.example.demo.entity;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Timestamp{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
    @PrePersist
    
    public void Oncreate(){
    LocalDateTime now = LocalDateTime.now();
    this.createdAt = now;
    this.updateAt = now;
    }

    @PreUpdate
    
    public void Onupdate(){
        LocalDateTime now = LocalDateTime.now();
        this.updateAt = now;
    }
}
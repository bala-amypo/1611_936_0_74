package com.example.works.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "person")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private Integer year;

    @ManyToMany
    @JoinTable(
        name = "commontable",
        joinColumns = @JoinColumn(name = "id"),
        inverseJoinColumns = @JoinColumn(name ="id"))
        private List<Course> cou;
}

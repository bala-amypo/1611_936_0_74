package com.example.demo.entity

@Entity
public class StudentEntity{
    private Integer id;
    private String username;
    private String email;
    private String password;
    private Date created;
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        
    }


}
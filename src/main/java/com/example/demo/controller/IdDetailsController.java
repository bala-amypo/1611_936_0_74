package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.entity.IdDetails;
import com.example.demo.service.IdDetailsService;
import jakarta.validation.Valid;
@RestController
public class IdDetailsController{
    @Autowired IdDetailsService ser;
    @PostMapping("/tpost")
    
    public IdDetails tsendData(@Valid @RequestBody IdDetails entity){
        return ser.tpostData(entity);
    }

    // @GetMapping("/vgetid/{id}")
    // public ValidationEntity vgetDataId(@PathVariable long id){
    //     return ser.vgetData(id);
    // }
}
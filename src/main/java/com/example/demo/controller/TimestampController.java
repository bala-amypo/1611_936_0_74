package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.entity.Timestamp;
import com.example.demo.service.TimestampService;
import jakarta.validation.Valid;
@RestController
public class TimestampController{
    @Autowired TimestampService ser;
    @PostMapping("/tpost")
    
    public Timestamp tsendData(@Valid @RequestBody Timestamp entity){
        return ser.tpostData(entity);
    }

    // @GetMapping("/vgetid/{id}")
    // public ValidationEntity vgetDataId(@PathVariable long id){
    //     return ser.vgetData(id);
    // }
}
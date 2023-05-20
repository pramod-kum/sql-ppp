package com.geekster.Gulshan.controller;

import com.geekster.Gulshan.mode.Userss;
import com.geekster.Gulshan.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userController {
    @Autowired
    private IUserRepo iUserRepo;

    @PostMapping("addUser")
    public String addUser(@RequestBody Userss userss){
        iUserRepo.save(userss);
        return "User added successfully!!";
    }
    @GetMapping("getUser")
    public List<Userss> getUser(){
       return iUserRepo.findAll();
    }

}

package com.example.demo.controller;


import com.example.demo.model.PostsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController implements Demo {



    @Autowired Demo demoService;


    public String HelloWorld() {

        return demoService.HelloWorld();
    }

    public List<PostsModel> getAllPosts() {

        return demoService.getAllPosts();
    }
}

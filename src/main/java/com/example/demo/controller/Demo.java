package com.example.demo.controller;

import com.example.demo.model.PostsModel;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface Demo {
    @GetMapping("/")
    String HelloWorld();

    @GetMapping("/getAllPosts")
    List<PostsModel> getAllPosts();
}

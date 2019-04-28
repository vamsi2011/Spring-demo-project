package com.example.demo.sevice;

import com.example.demo.client.PostsClient;
import com.example.demo.model.PostsModel;
import com.example.demo.controller.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService implements Demo {

    @Autowired
    PostsClient postsClient;

    @Override
    public String HelloWorld() {
        return "Hello wold from service";
    }

    @Override
    public List<PostsModel> getAllPosts() {
        return postsClient.getPosts();
    }
}

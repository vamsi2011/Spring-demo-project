package com.example.demo.sevice;

import com.example.demo.client.PostsClient;
import com.example.demo.model.PostsModel;
import com.example.demo.controller.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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


                List<PostsModel> list =  postsClient.getPosts().stream().map(post -> {
                    post.setFare(null);
                return post;}).collect(Collectors.toList());
//
//                for(PostsModel post : list) {
//                    post.setFare(null);
//                }

                return list;
    }

    @Override
    public String sendErrorMessage() {
        return null;
    }
}

package com.example.demo.client;


import com.example.demo.model.PostsModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="POSTClient", url = "https://jsonplaceholder.typicode.com/")
public interface PostsClient {

    @GetMapping(value="/posts", consumes = MediaType.APPLICATION_JSON_VALUE)
    List<PostsModel> getPosts();

}

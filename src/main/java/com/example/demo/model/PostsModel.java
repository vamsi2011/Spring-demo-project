package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class PostsModel  implements Serializable {

    //@JsonIgnore
    private Integer id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer userId;
    private String title;
    private String body;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty
    private List<ShoppingItinerary> fare = Arrays.asList(new ShoppingItinerary[]{ new ShoppingItinerary("dasd", "bangalore"),
    new ShoppingItinerary("dsada", "hyderabad")});

    @JsonProperty
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @JsonProperty
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    //@JsonProperty
    public List<ShoppingItinerary> getFare() {
        return fare;
    }

    public void setFare(List<ShoppingItinerary> fare) {
        this.fare = fare;
    }
}

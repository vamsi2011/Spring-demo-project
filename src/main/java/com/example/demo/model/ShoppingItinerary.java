package com.example.demo.model;

public class ShoppingItinerary {

    private String id;

    private String city;

    public ShoppingItinerary() {
        super();
    }

    public ShoppingItinerary(String id, String city) {
        this.id = id;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

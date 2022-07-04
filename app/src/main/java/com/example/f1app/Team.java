package com.example.f1app;

public class Team {
    private int id;
    private String name;
    private String image;

    public Team(String id, String name, String image) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.image = image;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getImage() {
        return image;
    }
}

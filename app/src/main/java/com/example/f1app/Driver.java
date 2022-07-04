package com.example.f1app;

public class Driver {
    private int id;
    private String name;
    private String team;
    private String image;

    public Driver(String id, String name, String team, String image) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.team = team;
        this.image = image;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTeam() {
        return team;
    }
    public String getImage() {
        return image;
    }
}

package com.example.demo;

public class Artist {
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStage_name() {
        return stage_name;
    }

    public void setStage_name(String stage_name) {
        this.stage_name = stage_name;
    }

    public String getTour_bus() {
        return tour_bus;
    }

    public void setTour_bus(String tour_bus) {
        this.tour_bus = tour_bus;
    }

    private String stage_name;
    private String tour_bus;
}

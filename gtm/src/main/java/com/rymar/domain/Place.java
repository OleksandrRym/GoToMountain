package com.rymar.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rymar.config.DurationDeserializer;
import lombok.Data;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Data
public class Place {
    private PlaceType type;
    private String name;
    @JsonDeserialize(using = DurationDeserializer.class)
    private Duration duration;
    private double distanceKm;
    private Region region;
    private RailwayStation railwayStation;
    private List<String> photos = new ArrayList<>();

    public void addPhoto(String photo) {
        photos.add(photo);
    }

    public void rename(String name) {
        this.name = name;
    }
}

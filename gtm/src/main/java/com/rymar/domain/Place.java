package com.rymar.domain;
import jakarta.persistence.*;
import lombok.Data;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "places")
@Data
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PlaceType type;

    @Column(nullable = false)
    private String name;

    // Duration збережемо як секунди
    @Column(name = "duration_seconds")
    private Long durationSeconds;

    @Column(name = "distance_km")
    private double distanceKm;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;

    @ManyToOne
    @JoinColumn(name = "railway_station_id")
    private RailwayStation railwayStation;

    @ElementCollection
    @CollectionTable(
            name = "place_photos",
            joinColumns = @JoinColumn(name = "place_id")
    )
    @Column(name = "photo_url")
    private List<String> photos = new ArrayList<>();


    public void addPhoto(String photo) {
        photos.add(photo);
    }

    public void rename(String name) {
        this.name = name;
    }

    public Duration getDuration() {
        return durationSeconds != null ? Duration.ofSeconds(durationSeconds) : null;
    }

    public void setDuration(Duration duration) {
        this.durationSeconds = duration != null ? duration.getSeconds() : null;
    }
}
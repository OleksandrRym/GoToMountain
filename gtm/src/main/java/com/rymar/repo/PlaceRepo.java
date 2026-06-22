package com.rymar.repo;

import com.rymar.domain.Place;
import com.rymar.domain.RailwayStation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlaceRepo extends JpaRepository <Place, Long> {

    List<Place> findAllByRailwayStation(RailwayStation railwayStation);
}

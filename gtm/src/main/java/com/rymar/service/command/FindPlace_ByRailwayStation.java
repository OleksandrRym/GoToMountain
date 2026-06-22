package com.rymar.service.command;

import com.rymar.domain.RailwayStation;
import com.rymar.repo.PlaceRepo;
import lombok.AllArgsConstructor;

import java.util.Map;

@AllArgsConstructor
public class FindPlace_ByRailwayStation extends Process{
    private final PlaceRepo placeRepo;
    @Override
    void execute() {
        placeRepo.findAllByRailwayStation(RailwayStation.MYKULYCHYN);
    }
}

package com.rymar.domain;

import lombok.Data;

@Data
public class Place {
    String type;
    String duration;
    String km;
    String region;
    String railwayStation;
    String[] photo;
}

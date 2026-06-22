CREATE TABLE regions (
                         id BIGSERIAL PRIMARY KEY,
                         name VARCHAR(255) NOT NULL
);

CREATE TABLE railway_stations (
                                  id BIGSERIAL PRIMARY KEY,
                                  name VARCHAR(255) NOT NULL
);

CREATE TABLE places (
                        id BIGSERIAL PRIMARY KEY,
                        type VARCHAR(50) NOT NULL,
                        name VARCHAR(255) NOT NULL,
                        duration_seconds BIGINT,
                        distance_km DOUBLE PRECISION,
                        region_id BIGINT,
                        railway_station_id BIGINT,
                        CONSTRAINT fk_region
                            FOREIGN KEY (region_id) REFERENCES regions(id),
                        CONSTRAINT fk_railway_station
                            FOREIGN KEY (railway_station_id) REFERENCES railway_stations(id)
);

CREATE TABLE place_photos (
                              place_id BIGINT NOT NULL,
                              photo_url TEXT,
                              CONSTRAINT fk_place
                                  FOREIGN KEY (place_id) REFERENCES places(id) ON DELETE CASCADE
);
package com.rymar.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rymar.domain.Place;

import java.io.File;

public class FileReader {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

       Place data = mapper.readValue(
                new File("gtm/src/main/resources/static/data.json"),
                Place.class
        );
        System.out.println(data);
    }
}


package com.example.vue_demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="/api/data/car", produces = "application/json")
public class DataAPI {

    @GetMapping()
    public List<String> getCars(){

        List<String> list = new ArrayList<>(
            List.of("2005 Bugatti Veyron",
                    "2005 VW Golf GTI",
                    "2003 Rolls Royce Phantom",
                    "2009 Ferrari 458",
                    "1996 Porsche Boxster",
                    "1999 BMW 320d",
                    "1998 Ford Focus",
                    "1993 Porsche 911 993",
                    "2010 Lexus LFA",
                    "2008 Nissan GT-R"));

        return list;
    }

}

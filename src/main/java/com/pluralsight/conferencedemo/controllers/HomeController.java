package com.pluralsight.conferencedemo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;


@RestController
public class HomeController {
    @Value("${app.version}")
    private String version;

    @GetMapping
    @RequestMapping("/")
    public Map getStatus(){
        Map map= new HashMap<String,String>();
        map.put("app-version", version);
        return map;
    }
}

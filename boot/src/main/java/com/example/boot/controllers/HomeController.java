package com.example.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @Autowired
    BuildProperties buildProperties;

    //yaml < properties < env < cli
    @Value("${some.value}")
    String someValue;

    @GetMapping
    @RequestMapping("/")
    public Map getVersion() {
        Map map = new HashMap<String,String>();
        map.put("some-value",someValue);
        map.put("artifact-version", buildProperties.getVersion());
        return map;
    }
}

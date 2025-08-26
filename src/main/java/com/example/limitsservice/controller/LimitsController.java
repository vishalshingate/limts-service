package com.example.limitsservice.controller;

import com.example.limitsservice.bean.Limits;
import com.example.limitsservice.configuration.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    private final Configuration configuration;

    public LimitsController(Configuration configuration) {
        this.configuration = configuration;
    }
    @GetMapping("/limits")
    public Limits retriverLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
        //return new Limits(1, 1000);
    }
}

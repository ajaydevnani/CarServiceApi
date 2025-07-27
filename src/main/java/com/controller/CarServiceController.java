package com.controller;

import com.models.car;
import com.service.CarDetailsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/cars")
public class CarServiceController {

    @Autowired
    CarDetailsService carDetailsService;

    @GetMapping
    public List<car> getAllCars() {
        return carDetailsService.getCarDetails();
    }
}
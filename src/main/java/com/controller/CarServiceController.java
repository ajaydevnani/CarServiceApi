package com.controller;

import com.models.Car;
import com.service.CarDetailsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarServiceController {

    private final CarDetailsService carDetailsService;

    @GetMapping
    public List<Car> getAllCars() {
        return carDetailsService.getCarDetails();
    }
}

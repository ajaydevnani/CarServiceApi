package com.service;

import com.Repository.GetCarInfo;
import com.models.Car;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarDetailsService {

    private final GetCarInfo getCarInfo;

    public List<Car> getCarDetails() {
        return getCarInfo.getCarInfo();
    }
}

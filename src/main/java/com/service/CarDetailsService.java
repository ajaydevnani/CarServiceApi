package com.service;

import com.Repository.GetCarInfo;
import com.models.car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarDetailsService {

    @Autowired
    GetCarInfo getCarInfo;

    public List<car> getCarDetails() {
        return getCarInfo.getCarInfo();
    }
}

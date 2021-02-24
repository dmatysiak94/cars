package com.example.demo.carDao;

import com.example.demo.carEntity.CarEntity;

import java.util.List;

public interface ICarDao {

    String saveCar(List<CarEntity> car);
}

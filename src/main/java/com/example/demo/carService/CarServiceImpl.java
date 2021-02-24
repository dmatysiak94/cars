package com.example.demo.carService;

import com.example.demo.carDao.ICarDao;
import com.example.demo.carEntity.CarEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements ICarservice {

    private ICarDao carDao;

    @Autowired
    public CarServiceImpl(ICarDao carDao){
        this.carDao = carDao;
    }


    @Override
    public String saveCar(MultipartFile multipartFile) {

        File file = new File(multipartFile.getOriginalFilename());


    }

    private List<CarEntity> filterCars(List<CarEntity> carList){
       return carList.stream().filter(car -> Objects.nonNull(car.getKolor())).collect(Collectors.toList());
    }
}

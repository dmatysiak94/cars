package com.example.demo.carController;

import com.example.demo.carService.ICarservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/car")
public class CarController {

    private ICarservice carService;

    @Autowired
    public CarController(ICarservice carService){
        this.carService = carService;
    }

    @PostMapping("/carController")
    public ResponseEntity<Object> saveCar(@RequestParam("file") MultipartFile file) {

        String result = carService.saveCar(file);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}

package com.swagger.example;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/car")
public class CarController {

    ConcurrentHashMap<String, Car> carsMap = new ConcurrentHashMap();

    @GetMapping("/{id}")
    @ApiOperation(value = "Get Car info by ID", notes = "Specify an 'id' in the url path to get its Car info.", response = Car.class)
    public Car getCarInfo(@ApiParam(value = "unique id of the car", required = true) @PathVariable String id) {
        return carsMap.get(id);
    }

    @PostMapping("/")
    public void addCar(@RequestBody Car car) {
        carsMap.put(car.getId(), car);
    }

    @GetMapping("/")
    public List<Car> getAllCars() {
        return new ArrayList<Car>(carsMap.values());
    }

}

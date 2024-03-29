package com.org.inventory.controller;

import com.org.inventory.model.Car;
import com.org.inventory.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/inventory")
public class InventorySystemController {

    //swagger-url
    // http://localhost:8080/swagger-ui.html

    @Autowired
    CarService carService;


    @GetMapping("/car")
    //@PreAuthorize("hasRole('USER') or hasRole('ROLE_USER')")
    private List<Car> getAllCars() {
        return carService.getAllCars();
    }


    @GetMapping("/car/{id}")
    private Car getCar(@PathVariable("id") int id) {
        return carService.getCarById(id);
    }


    @DeleteMapping("/car/{id}")
    private void deleteCar(@PathVariable("id") int id) {
        carService.delete(id);
    }


    @PostMapping("/car")
    private int saveCar(@RequestBody Car car) {
        carService.saveOrUpdate(car);
        return car.getId();
    }
}



package com.org.inventory.services;

import com.org.inventory.model.Car;
import com.org.inventory.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;


    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        carRepository.findAll().forEach(c -> cars.add(c));
        return cars;
    }

    public Car getCarById(int id) {
        return carRepository.findById(id).get();
    }

    public void saveOrUpdate(Car car) {
        carRepository.save(car);
    }

    public void delete(int id) {
        carRepository.deleteById(id);
    }


}

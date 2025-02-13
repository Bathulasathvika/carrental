package com.sathvika.carrental.service;

import com.sathvika.carrental.model.User;
import com.sathvika.carrental.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> cars = new ArrayList<>();

    public CarService() {
        initializeData();
    }

    private void initializeData() {
        cars.add(new Car("Maruti Swift", true, 500));
        cars.add(new Car("Honda City", true, 700));
        cars.add(new Car("Tata Altroz", true, 600));
        cars.add(new Car("Toyota Fortuner", true, 500));
        cars.add(new Car("Audi", true, 700));
        cars.add(new Car("Ford EcoSport", true, 600));
    }

    public List<Car> getAllCars() {
        return cars;
    }

    public void setCarPrice(int carIndex, double newPrice) {
        if (carIndex >= 0 && carIndex < cars.size()) {
            Car car = cars.get(carIndex);
            car.setPrice(newPrice);
        }
    }

    public void rentCar(User user, int carIndex) {
        if (carIndex >= 0 && carIndex < cars.size()) {
            Car car = cars.get(carIndex);
            if (car.isAvailable()) {
                car.setAvailable(false);
                user.setRentedCar(car);
            }
        }
    }

    public void returnCar(User user) {
        Car car = user.getRentedCar();
        if (car != null) {
            car.setAvailable(true);
            user.setRentedCar(null);
        }
    }
}
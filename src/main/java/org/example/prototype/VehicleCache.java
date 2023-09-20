package org.example.prototype;

import java.util.HashMap;
import java.util.Map;

public class VehicleCache {
    private Map<String, Vehicle> cache = new HashMap<>();
    public VehicleCache() {
        Car car = new Car();
        car.brand = "Bugatti";
        car.model = "Chiron";
        car.color = "Blue";
        car.topSpeed = 261;
        Bus bus = new Bus();
        bus.brand = "Mercedes";
        bus.model = "Setra";
        bus.color = "White";
        bus.doors = 48;

        cache.put("Bugatti Chiron", car);
        cache.put("Mercedes Setra", bus);
    }

    public Vehicle get(String key) {
        return cache.get(key).clone();
    }
}

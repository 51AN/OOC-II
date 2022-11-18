package assignment2.ContentCoupling;

import assignment2.ContentCoupling.Car;

public class Mercedes {
    public int distanceCoverable(Car car){
        car.coverage = car.mileage * car.speed;
        return car.coverage;
    }
}

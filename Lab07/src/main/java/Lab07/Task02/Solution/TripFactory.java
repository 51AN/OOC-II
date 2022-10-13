package Lab07.Task02.Solution;

import Lab07.Task01.Solution.*;
import Lab07.Task02.Problem.VehicleType;

public class TripFactory {
    public ITrip chooseTrip (VehicleType type, int distanceKM, int timeMinutes, int numberOfPassengers) {
        ITrip master = null;
        if(type.equals(VehicleType.SEDAN)) {
            master = new SEDAN(distanceKM, timeMinutes, numberOfPassengers);
        } else if(type.equals(VehicleType.MOTOR_BIKE)){
            master = new MOTOR_BIKE(distanceKM,timeMinutes,numberOfPassengers);
        }else if(type.equals(VehicleType.SEVEN_SEATER)){
            master = new SEVEN_SEATER(distanceKM,timeMinutes,numberOfPassengers);
        }
        return master;
    }
}

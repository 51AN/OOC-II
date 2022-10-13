package Lab07.Task02.Solution;

import Lab07.Task02.Problem.VehicleType;

public class Trip {

    private ITrip type;

    public Trip(VehicleType type, int distanceKM, int timeMinutes, int numberOfPassengers){
        this.type = new TripFactory().chooseTrip(type , distanceKM, timeMinutes, numberOfPassengers);
    }

    public int perHeadFare(){
        return type.perHeadFare();
    }

    public boolean canTakeTrip(){
        return type.canTakeTrip();
    }
}

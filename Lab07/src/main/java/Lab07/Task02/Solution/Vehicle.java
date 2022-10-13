package Lab07.Task02.Solution;

public abstract class Vehicle implements ITrip {
    int distanceKM;
    int timeMinutes;
    int numberOfPassengers;

    public Vehicle(int distanceKM, int timeMinutes, int numberOfPassengers){
        this.distanceKM = distanceKM;
        this.timeMinutes = timeMinutes;
        this.numberOfPassengers = numberOfPassengers;
    }
}

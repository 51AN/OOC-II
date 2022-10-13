package Lab07.Task02.Solution;

public class MOTOR_BIKE extends Vehicle{

    public MOTOR_BIKE(int distanceKM, int timeMinutes, int numberOfPassengers){
        super(distanceKM,timeMinutes,numberOfPassengers);
    }
    @Override
    public int perHeadFare(){
        return  (Math.max(25, distanceKM * 20) / numberOfPassengers);
    }

    @Override
    public boolean canTakeTrip(){
        return numberOfPassengers <= 1 && distanceKM <= 10;
    }

}

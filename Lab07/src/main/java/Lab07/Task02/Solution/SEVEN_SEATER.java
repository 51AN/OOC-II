package Lab07.Task02.Solution;

public class SEVEN_SEATER extends Vehicle{

    public SEVEN_SEATER(int distanceKM, int timeMinutes, int numberOfPassengers){
        super(distanceKM,timeMinutes,numberOfPassengers);
    }
    @Override
    public int perHeadFare(){
        int fare;
        if (distanceKM < 10)
            fare = 300 / numberOfPassengers;
        else
            fare = distanceKM * 30 / numberOfPassengers;
        return  (fare);
    }

    @Override
    public boolean canTakeTrip(){
        return numberOfPassengers <= 7 && distanceKM >= 10;
    }
}

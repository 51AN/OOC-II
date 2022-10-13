package Lab07.Task02.Solution;

public class SEDAN extends Vehicle{


    public SEDAN(int distanceKM, int timeMinutes, int numberOfPassengers){
        super(distanceKM,timeMinutes,numberOfPassengers);
    }
    @Override
    public int perHeadFare(){
        return  ((50 + distanceKM * 30 + timeMinutes * 2) / numberOfPassengers);
    }

    @Override
    public boolean canTakeTrip(){
        return numberOfPassengers <= 4 && distanceKM <= 25;
    }
}

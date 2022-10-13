package Lab07.TestTask02;
import Lab07.Task02.Solution.Trip;
import Lab07.Task02.Problem.VehicleType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TripTest {

    @Test
    public void TestTripFare1(){
        Trip trip = new Trip(VehicleType.SEDAN,1,2,3);
        int fare = 0;
        fare = trip.perHeadFare();
        assertEquals(28, fare);

    }

    @Test
    public void TestTripFare2(){
        Trip trip = new Trip(VehicleType.MOTOR_BIKE,1,2,3);
        int fare = 0;
        fare = trip.perHeadFare();
        assertEquals(8, fare);

    }

    @Test
    public void TestTripFare3(){
        Trip trip = new Trip(VehicleType.SEVEN_SEATER,1,2,3);
        int fare = 0;
        fare = trip.perHeadFare();
        assertEquals(100, fare);

    }

    @Test
    public void TestCanGoOnTrip1(){
        Trip trip = new Trip(VehicleType.SEDAN,1,2,3);
        assertTrue(trip.canTakeTrip());
    }

    @Test
    public void TestCanGoOnTrip2(){
        Trip trip = new Trip(VehicleType.MOTOR_BIKE,1,2,3);
        assertFalse(trip.canTakeTrip());
    }

    @Test
    public void TestCanGoOnTrip3(){
        Trip trip = new Trip(VehicleType.SEVEN_SEATER,10,2,3);
        assertTrue(trip.canTakeTrip());
    }






}

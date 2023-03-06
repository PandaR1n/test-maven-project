package HomeWork7;


import org.junit.Test;


public class TokenTest {


    @Test
    public void testToken() {
        String token = BookingRest.testGetToken();
        String id = BookingRest.createBookingId();
        BookingRest.examinationBooking(id);
        BookingRest.putBooking(id,token);
        BookingRest.delBooking(id,token);
        BookingRest.examinationBookingDel(id);

}

}


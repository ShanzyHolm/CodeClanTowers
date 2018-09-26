import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    ArrayList<Bedroom> bedrooms;
    Bedroom bedroom1;
    Bedroom bedroom2;

    @Before
    public void before() {
        bedrooms = new ArrayList<>();
        hotel = new Hotel("The KodeKlan Kitty Kat Hotel", bedrooms);
        bedroom2 = new Bedroom (1, 2, "single", 10.00);
        bedroom1 = new Bedroom (2, 1, "double", 19.99);
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);

    }

    @Test
    public void getHotelName() {
        assertEquals("The KodeKlan Kitty Kat Hotel", hotel.getName());
    }

    @Test
    public void getRoomCount() {
        assertEquals(2, hotel.getRoomCount());
    }
}

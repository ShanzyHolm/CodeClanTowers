import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    ArrayList<Bedroom> bedrooms;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;

    @Before
    public void before() {
        bedrooms = new ArrayList<>();
        hotel = new Hotel("The KodeKlan Kitty Kat Hotel", bedrooms);
        bedroom2 = new Bedroom (1, 2, "single", 10.00);
        bedroom1 = new Bedroom (2, 1, "double", 19.99);
        bedroom3 = new Bedroom (4, 1, "family", 24.99);
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        bedrooms.add(bedroom3);

    }

    @Test
    public void getHotelName() {
        assertEquals("The KodeKlan Kitty Kat Hotel", hotel.getName());
    }

    @Test
    public void getRoomCount() {
        assertEquals(3, hotel.getRoomCount());
    }
}

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
    DiningRoom diningRoom;
    ConferenceRoom conferenceRoom;
    Guest guest;
    Guest guest2;

    @Before
    public void before() {
        bedrooms = new ArrayList<>();
        diningRoom = new DiningRoom(2);
        conferenceRoom = new ConferenceRoom(1, "Scratching Post", 5.99);
        hotel = new Hotel("The KodeKlan Kitty Kat Hotel", bedrooms, diningRoom, conferenceRoom);
        bedroom2 = new Bedroom (1, 2, "single", 10.00);
        bedroom1 = new Bedroom (2, 1, "double", 19.99);
        bedroom3 = new Bedroom (4, 3, "family", 24.99);
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        bedrooms.add(bedroom3);
        guest = new Guest ("Tabby");
        guest2 = new Guest ("Fluffy");

    }

    @Test
    public void getHotelName() {
        assertEquals("The KodeKlan Kitty Kat Hotel", hotel.getName());
    }

    @Test
    public void getRoomCount() {
        assertEquals(3, hotel.getRoomCount());
    }

    @Test
    public void hotelHasDiningroom() {
        assertEquals(diningRoom, hotel.getDiningRoom());
    }

    @Test
    public void hotelHasConferenceRoom() {
        assertEquals(conferenceRoom, hotel.getConferenceRoom());
    }

    @Test
    public void hotelRoomStartsEmpty() {
        assertEquals(0, hotel.roomGuestCountBedroom(bedroom1));
    }

    @Test
    public void canCheckInGuestToBedroom() {
        hotel.checkInGuestToBedroom(bedroom1, guest);
        assertEquals(1, hotel.roomGuestCountBedroom(bedroom1));
    }

    @Test
    public void canCheckOutGuestToBedroom() {
        hotel.checkInGuestToBedroom(bedroom1, guest);
        hotel.checkOutGuestFromBedroom(bedroom1, guest);
        assertEquals(0, hotel.roomGuestCountBedroom(bedroom1));
    }

    @Test
    public void canCheckInGuestToDiningRoom() {
        hotel.checkInGuestToDiningRoom(diningRoom, guest);
        assertEquals(1, hotel.roomGuestCountDiningroom(diningRoom));
    }

    @Test
    public void canCheckOutGuestToDiningRoom() {
        hotel.checkInGuestToDiningRoom(diningRoom, guest2);
        hotel.checkOutGuestFromDiningroom(diningRoom, guest2);
        assertEquals(0, hotel.roomGuestCountDiningroom(diningRoom));
    }

    @Test
    public void canCheckInGuestToConferenceRoom() {
        hotel.checkInGuestToConferenceRoom(conferenceRoom, guest);
        assertEquals(1, hotel.roomGuestCountConferenceRoom(conferenceRoom));
    }

    @Test
    public void canCheckOutGuestToConferenceRoom() {
        hotel.checkInGuestToConferenceRoom(conferenceRoom, guest2);
        hotel.checkOutGuestFromConferenceRoom(conferenceRoom, guest2);
        assertEquals(0, hotel.roomGuestCountConferenceRoom(conferenceRoom));
    }

    @Test
    public void hotelCanGetGuestList() {
        hotel.checkInGuestToBedroom(bedroom1, guest);
        ArrayList<Guest> copy = hotel.getGuestsForBedroom(bedroom1);
        assertEquals(1, copy.size());
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before() {
        this.conferenceRoom = new ConferenceRoom(1, "Scratching Post", 5.50);
        this.guest = new Guest("Tabby");
    }

    @Test
    public void conferenceRoomStartsEmpty() {
        assertEquals(0, conferenceRoom.guestCount());
    }

    @Test
    public void hasCapacity() {
        assertEquals(1, conferenceRoom.getCapacity());
    }

    @Test
    public void hasName() {
        assertEquals("Scratching Post", conferenceRoom.getRoomName());
    }

    @Test
    public void conferenceRoomHasRate() {
        assertEquals(5.50, conferenceRoom.getDailyRate(), 0.01);
    }

    @Test
    public void canAddGuestsToRoom() {
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void canRemoveGuestsFromRoom() {
        conferenceRoom.addGuest(guest);
        conferenceRoom.removeGuest();
        assertEquals(0, conferenceRoom.guestCount());
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    Guest guest;
    DiningRoom diningRoom;

    @Before
    public void before(){
        this.diningRoom = new DiningRoom(1);
        this.guest = new Guest("Tabby");
    }

    @Test
    public void diningroomStartsEmpty() {
        assertEquals(0, diningRoom.guestCount());
    }

    @Test
    public void hasCapacity() {
        assertEquals(1, diningRoom.getCapacity());
    }

    @Test
    public void canAddGuest() {
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.guestCount());
    }

    @Test
    public void canRemoveGuest() {
        diningRoom.addGuest(guest);
        diningRoom.removeGuest();
        assertEquals(0, diningRoom.guestCount());
    }
}



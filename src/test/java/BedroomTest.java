import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(2, 1, "Double", 19.99);
        guest = new Guest("Tabby");
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void bedroomHasNumber() {
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void bedroomHasType() {
        assertEquals("Double", bedroom.getRoomType());
    }

    @Test
    public void bedroomHasRate() {
        assertEquals(19.99, bedroom.getNightlyRate(), 0.01);
    }

    @Test
    public void canAddGuestToRoom() {
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void canRemoveGuestsFromRoom() {
        bedroom.addGuest(guest);
        bedroom.removeGuest();
        assertEquals(0, bedroom.guestCount());
    }
}

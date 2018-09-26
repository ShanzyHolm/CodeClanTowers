import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        this.guest = new Guest("Tabby");
    }

    @Test
    public void hasName() {
        assertEquals("Tabby", guest.getName());
    }
}

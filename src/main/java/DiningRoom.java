import java.util.ArrayList;

public class DiningRoom {

    private int capacity;
    private ArrayList<Guest> guests;

    public DiningRoom(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int guestCount() {
        return this.guests.size();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        int i = this.guests.indexOf(guest);
        this.guests.remove(i);
    }
}

import java.util.ArrayList;

public class ConferenceRoom {
    private ArrayList<Guest> guests;
    private int capacity;
    private String roomName;
    private double dailyRate;

    public ConferenceRoom(int capacity, String roomName, double dailyRate) {
        this.guests = new ArrayList<>();
        this.capacity = capacity;
        this.roomName = roomName;
        this.dailyRate = dailyRate;

    }

    public int guestCount() {
        return this.guests.size();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getRoomName() {
        return this.roomName;
    }

    public double getDailyRate() {
        return this.dailyRate;
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public void removeGuest() {
        this.guests.remove(0);
    }
}

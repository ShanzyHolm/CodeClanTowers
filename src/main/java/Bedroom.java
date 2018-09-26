import java.util.ArrayList;

public class Bedroom {
    private int capacity;
    private ArrayList<Guest> guests;
    private int roomNumber;
    private String roomType;
    private double nightlyRate;

    public Bedroom(int capacity, int roomNumber, String roomType, double nightlyRate) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.nightlyRate = nightlyRate;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int guestCount() {
        return this.guests.size();
    }

    public String getRoomType() {
        return roomType;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        int i = this.guests.indexOf(guest);
        this.guests.remove(i);
    }

    public ArrayList<Guest> guestList() {
        return new ArrayList<>(this.guests);
    }
}

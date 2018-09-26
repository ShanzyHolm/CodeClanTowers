import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private DiningRoom diningRoom;
    private ConferenceRoom conferenceRoom;

    public Hotel(String name, ArrayList<Bedroom> bedrooms, DiningRoom diningRoom, ConferenceRoom conferenceRoom){
        this.name = name;
        this.bedrooms =  bedrooms;
        this.diningRoom = diningRoom;
        this.conferenceRoom = conferenceRoom;
    }

    public String getName() {
        return this.name;
    }

    public int getRoomCount() {
        return this.bedrooms.size();
    }

    public DiningRoom getDiningRoom() {
        return diningRoom;
    }

    public ConferenceRoom getConferenceRoom() {
        return conferenceRoom;
    }

    public int roomGuestCountBedroom(Bedroom bedroom) {
        return bedroom.guestCount();
    }

    public void checkInGuestToBedroom(Bedroom bedroom, Guest guest) {
        bedroom.addGuest(guest);
    }

    public void checkOutGuestFromBedroom(Bedroom bedroom, Guest guest) {
        bedroom.removeGuest(guest);
    }

    public void checkInGuestToDiningRoom(DiningRoom diningRoom, Guest guest) {
        diningRoom.addGuest(guest);
    }

    public void checkOutGuestFromDiningroom(DiningRoom diningRoom, Guest guest) {
        diningRoom.removeGuest(guest);
    }

    public int roomGuestCountDiningroom(DiningRoom diningRoom) {
        return diningRoom.guestCount();
    }

    public void checkInGuestToConferenceRoom(ConferenceRoom conferenceRoom, Guest guest) {
        conferenceRoom.addGuest(guest);
    }

    public void checkOutGuestFromConferenceRoom(ConferenceRoom conferenceRoom, Guest guest) {
        conferenceRoom.removeGuest(guest);
    }

    public int roomGuestCountConferenceRoom(ConferenceRoom conferenceRoom) {
        return conferenceRoom.guestCount();
    }

    public ArrayList<Guest> getGuestsForBedroom(Bedroom bedroom) {
        return bedroom.guestList();
    }



}

//ArrayList<Guest> copy = room.getGuests();
//copy.add(guest);
//return new ArrayList<>(this.guests);



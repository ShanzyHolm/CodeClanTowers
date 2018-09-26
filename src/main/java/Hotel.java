import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedrooms;

    public Hotel(String name, ArrayList<Bedroom> bedrooms){
        this.name = name;
        this.bedrooms =  bedrooms;
    }

    public String getName() {
        return this.name;
    }


    public int getRoomCount() {
        return this.bedrooms.size();
    }



}

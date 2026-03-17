import java.util.*;

class Room {
    boolean available;
    Room(boolean available){this.available=available;}
}

public class BookMyStayApp {
    public static void main(String[] args) {
        ArrayList<Room> rooms=new ArrayList<>();
        rooms.add(new Room(true));
        rooms.add(new Room(false));

        int count=0;
        for(Room r:rooms) if(r.available) count++;

        System.out.println("Available: "+count);
    }
}
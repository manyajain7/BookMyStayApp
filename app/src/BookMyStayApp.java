import java.util.*;

class Room {
    int id; boolean available;
    Room(int id,boolean available){
        this.id=id; this.available=available;
    }
}

public class BookMyStayApp {
    public static void main(String[] args) {
        ArrayList<Room> rooms=new ArrayList<>();
        rooms.add(new Room(101,true));
        rooms.add(new Room(102,false));

        for(Room r:rooms)
            if(r.available)
                System.out.println("Available Room: "+r.id);
    }
}
import java.util.*;

class Room {
    int id; String type; boolean available;
    Room(int id,String type,boolean available){
        this.id=id; this.type=type; this.available=available;
    }
}

public class BookMyStayApp {
    public static void main(String[] args) {
        ArrayList<Room> rooms=new ArrayList<>();
        rooms.add(new Room(101,"Single",true));
        rooms.add(new Room(102,"Double",false));

        for(Room r:rooms)
            System.out.println(r.id+" "+r.type+" "+r.available);
    }
}
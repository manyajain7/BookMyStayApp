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

        int bookId=101;

        for(Room r:rooms){
            if(r.id==bookId && r.available){
                r.available=false;
                System.out.println("Room booked");
            }
        }
    }
}
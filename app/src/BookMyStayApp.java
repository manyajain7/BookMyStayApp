import java.util.*;

class Room {
    int id; boolean available;
    Room(int id,boolean available){
        this.id=id; this.available=available;
    }
}

public class BookMyStayApp {
    public static void main(String[] args) {
        Room r=new Room(101,false);

        if(!r.available)
            System.out.println("Already booked!");
    }
}
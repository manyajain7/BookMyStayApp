class Room {
    int id; boolean available;
    Room(int id){this.id=id; available=false;}
}

public class BookMyStayApp {
    public static void main(String[] args) {
        Room r=new Room(101);
        r.available=true;
        System.out.println("Booking cancelled");
    }
}
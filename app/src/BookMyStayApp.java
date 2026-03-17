class Booking {
    int roomId,customerId;
    Booking(int r,int c){
        roomId=r; customerId=c;
    }
}

public class BookMyStayApp {
    public static void main(String[] args) {
        Booking b=new Booking(101,1);
        System.out.println("Booking done for room "+b.roomId);
    }
}
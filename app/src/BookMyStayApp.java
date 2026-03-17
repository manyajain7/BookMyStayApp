
class Room {
    int roomId;
    String roomType;
    boolean isAvailable;

    Room(int roomId, String roomType, boolean isAvailable) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.isAvailable = isAvailable;
    }

    void displayRoom() {
        System.out.println("Room ID: " + roomId +
                ", Type: " + roomType +
                ", Available: " + isAvailable);
    }
}

public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("       Room Initialization (UC2)      ");
        System.out.println("======================================");

        ArrayList<Room> roomList = new ArrayList<>();

        roomList.add(new Room(101, "Single", true));
        roomList.add(new Room(102, "Double", true));
        roomList.add(new Room(103, "Suite", false));

        System.out.println("\nRoom Details:");
        for (Room room : roomList) {
            room.displayRoom();
        }

        System.out.println("\nRooms initialized successfully!");
    }
}
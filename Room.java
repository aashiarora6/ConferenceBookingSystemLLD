public class Room {
    BookingInfo bookingInfo;
    String roomName;
    Room(String roomName, BookingInfo bookingInfo){
        this.bookingInfo = bookingInfo;
        this.roomName = roomName;
    }
    public Room(String roomName) {
        this.roomName = roomName;
    }
}

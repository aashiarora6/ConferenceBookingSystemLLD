public class Room {
    public static Object bookings;
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

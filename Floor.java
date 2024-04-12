import java.util.*;

public class Floor {
    List<Room> meetingRooms;
    int floorNumber;

    public Floor(int floorNumber){
        this.floorNumber = floorNumber;
    }

    public void addMeetingRoom(String roomName){
        for(Room room: meetingRooms){
            if(room.roomName == roomName){
                System.out.println("The Room :" + roomName + "Already exits in meeting Rooms");
                return;
            }
        }
        meetingRooms.add(new Room(roomName));
        System.out.println("The room" + roomName + "has been successfully been added as MeetingRoom");
    }

    public Room getRoom(int roomNumber){
        for(Room room: meetingRooms){
            if(room.roomName == roomNumber){
                return room;
            }
        }
        System.out.println("The room doesn't exist you will have to create the Room : " + roomNumber);
        return null;
    }

    public void addMeetingRoom(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addMeetingRoom'");
    }

    public Object getRoom(int roomNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRoom'");
    }
    
}

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

    public Room getRoom(String roomName){
        for(Room room: meetingRooms){
            if(room.roomName == roomName){
                return room;
            }
        }
        System.out.println("The room doesn't exist you will have to create the Room : " + roomName);
        return null;
    }
    
}

import java.util.*;

public class Building {
    List<Floor> listOfFloor;
    String buildingName;

    Building(String BuildingName){
        this.buildingName = BuildingName;
    }
    public void addFloor(Floor temp){
        for (Floor f : listOfFloor) {
            if (f.floorNumber == temp.floorNumber) {
                System.out.println("Floor is already there");
                return;
            }
        }
        listOfFloor.add(temp);
        System.out.println("Floor number " + temp.floorNumber + " successfully added in the building " + buildingName);
    }

    public Floor getFloor(int floorNumber){
        for (Floor f : listOfFloor) {
            if (f.floorNumber == floorNumber)
                return f;
        }
        return null;
    }

}

import java.sql.Date;
import java.sql.Time;
import java.util.zip.DataFormatException;

import javax.xml.crypto.Data;

public class Duration {
    Date date = new Date(0);
    Time startTime;
    Time endTime;

    Duration(int roomNumber, String startTime2, String endTime2){
        this.date = roomNumber;
        this.startTime = startTime2;
        this.endTime = endTime2;
    }

    public Duration(int roomNumber, String startTime2, String endTime2) {
        //TODO Auto-generated constructor stub
    }
}

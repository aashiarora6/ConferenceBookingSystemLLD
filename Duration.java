import java.sql.Date;
import java.sql.Time;
import java.util.zip.DataFormatException;

import javax.xml.crypto.Data;

public class Duration {
    Date date = new Date(0);
    Time startTime;
    Time endTime;

    Duration(Date date, Time startTime, Time endTime){
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}

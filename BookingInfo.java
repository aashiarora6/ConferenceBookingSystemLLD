import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BookingInfo {
    List<Duration> bookingInfo;
    
    /**
     * @param duration
     * @return
     */
    public boolean isMeetingAvaliable(Duration duration){
        Collections.sort(bookingInfo, (a, b)-> a.date == b.date ? a.startTime == b.starTime : a.starTime -b.startTime : a.date - b.date);

        for(Duration book: bookingInfo){
            if (book.date == duration.date) {
                if ((book.startTime.compareTo(duration.startTime) >= 0
                        && duration.startTime.compareTo(book.endTime) <= 0) ||
                        (book.startTime.compareTo(duration.endTime) >= 0
                                && duration.endTime.compareTo(temp.endTime) <= 0))
                    return false;
            }
        }
        bookingInfo.add(duration);
        return true;
    }
}

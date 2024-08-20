package ProblemSolving.sembilan.DateCalendarClass;

import java.util.Calendar;
import java.util.Date;

public class MenggunakanCalendar {
    public static void main(String[] args) {
        Calendar testCalender = Calendar.getInstance();


        testCalender.set(Calendar.YEAR,2024);


        testCalender.set(Calendar.MONTH, Calendar.AUGUST);
        testCalender.set(Calendar.DAY_OF_MONTH, 20);
        testCalender.set(Calendar. MINUTE, 35);
        testCalender.set(Calendar. SECOND, 0);
        testCalender.set(Calendar. MILLISECOND, 0);

//        System.out.println(testCalender);

        Date newData = testCalender.getTime();
        System.out.println(newData);


    }
}

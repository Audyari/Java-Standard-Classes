package ProblemSolving.sembilan.DateCalendarClass;

import java.util.Date;

public class DateCalendarClass {

    public static void main(String[] args) {
        Date testTanggal = new Date();
        System.out.println(testTanggal);

        long testTanggalMillisecond = testTanggal.getTime();

        System.out.println(testTanggalMillisecond);

    }
}

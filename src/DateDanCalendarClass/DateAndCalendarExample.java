package DateDanCalendarClass;

import java.util.Calendar;
import java.util.Date;

public class DateAndCalendarExample {

    public static void main(String[] args) {

        // Contoh penggunaan Date
        Date currentDate = new Date();
        System.out.println("Tanggal saat ini: " + currentDate);

        // Contoh penggunaan Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.JULY, 1, 10, 30, 0);
        System.out.println("Tanggal dan waktu yang ditetapkan: " + calendar.getTime());

        // Menambahkan 3 hari ke tanggal saat ini
        calendar.add(Calendar.DAY_OF_MONTH, 3);
        System.out.println("Tanggal 3 hari dari sekarang: " + calendar.getTime());

        // Membandingkan dua tanggal
        Calendar otherCalendar = Calendar.getInstance();
        otherCalendar.set(2023, Calendar.JUNE, 30);
        if (calendar.after(otherCalendar)) {
            System.out.println("Tanggal pertama lebih baru dari tanggal kedua");
        } else {
            System.out.println("Tanggal pertama lebih lama atau sama dengan tanggal kedua");
        }
    }
}

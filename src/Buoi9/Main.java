package Buoi9;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        LocalDate d1 = d.plusDays(5); // tăng thêm ngày;
        LocalDate d3 = d.minusDays(5); // Giam ngay;

        LocalDate t = LocalDate.of(2022,10,15);

        LocalDate y = LocalDate.parse("2022-10-09");

        long b = ChronoUnit.DAYS.between(d, d1); // Khoảng cách giữa 2 ngày
        System.out.println(b);
        System.out.println(y.getDayOfWeek());
    }
}

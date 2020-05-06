package Java;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //How to format time in AM-PM format?
        Date date= new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("HH:mm:ss a");
        System.out.println(simpleDateFormat.format(date));
        System.out.println("===================");
        LocalDate localDate=LocalDate.now();

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("E dd-MMM-yyyy");
        System.out.println(localDate.format(dateTimeFormatter));



    }
}

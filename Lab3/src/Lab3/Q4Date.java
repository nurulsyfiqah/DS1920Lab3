package Lab3;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.*;

public class Q4Date {

    public static void main(String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat day = new SimpleDateFormat("EEEE");
        Date date = new Date();
        String today = dateFormat.format(date);

        System.out.println("Today Date (dd/mm/yyyy) : " + today);
        System.out.println("Today is on "+ day.format(date));
        System.out.print("Search Date (dd/mm/yyyy) : ");
        String searchDate = s.nextLine();

        Date searchDt = dateFormat.parse(searchDate);
        Date todayDt = dateFormat.parse(today);

        long diff = todayDt.getTime() - searchDt.getTime();
        int days = (int) (-diff/(24*60*60*1000));

        System.out.println("Search Date is on "+ day.format(nameOfDate(todayDt,days)));

    }

    public static Date nameOfDate(Date todayDate, int diff){
        Calendar cal = Calendar.getInstance();
        cal.setTime(todayDate);
        if(diff==0){
            return todayDate;
        }else
        cal.add(Calendar.DATE,diff);
        return cal.getTime();
        }
    }

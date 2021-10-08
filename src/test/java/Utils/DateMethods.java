package Utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateMethods {
    public String getCurrentDate_MMM_dd_yyyy() {
        Date nw = new Date();
        SimpleDateFormat df = new SimpleDateFormat("MMM dd yyyy");
        return df.format(nw);
    }

    public String getCurrentDate_MMM_d_yyyy() {
        Date nw = new Date();
        SimpleDateFormat df = new SimpleDateFormat("MMM d yyyy");
        return df.format(nw);
    }

    public String getCurrentDate_d() {
        Date nw = new Date();
        SimpleDateFormat df = new SimpleDateFormat("d");
        return df.format(nw);
    }

    public String getCurrentDate_dd() {
        Date nw = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd");
        return df.format(nw);
    }

    public String getCurrentHourAs_haa() {
        Date nw = new Date();
        SimpleDateFormat df = new SimpleDateFormat("haa");
        return df.format(nw);
    }

    public String getCurrentHoursInTwoHourIntervals(int lol) {
        List<String> expectedHours = new ArrayList<>();
        expectedHours.add("Now");

        SimpleDateFormat df = new SimpleDateFormat("haa");//format date to required format
        Calendar cal = Calendar.getInstance();

        for (int i = 1; i < lol; i++) {
            cal.add(Calendar.HOUR, 2);
            expectedHours.add(df.format(cal.getTime()).toLowerCase());
        }
        String b = expectedHours.toString();
        System.out.println(expectedHours);
        return b;
    }


}

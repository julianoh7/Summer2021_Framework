package Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMethods {
    public String getCurrentDate_MMM_dd_yyyy(){
        Date nw = new Date();
        SimpleDateFormat df = new SimpleDateFormat("MMM dd yyyy");
        return df.format(nw);
    }
    public String getCurrentDate_MMM_d_yyyy(){
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
}

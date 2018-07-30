package Util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static String getDashboardActibityStreamDateString(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        return sdf.format(date);
    }
}

package com.upgrad.ublog.utils;

import java.time.LocalDateTime;

/**
 * TODO: 4.13. Implement a method with the following signature.
 *  public static String format(LocalDateTime localDateTime)
 *  This method should convert the default date time to the human readable format[dd-MM-yyyy HH:mm:ss].
 */

public class DateTimeFormatter {
    public static String format(LocalDateTime localDateTime){

        LocalDateTime dateTime = localDateTime.now();

        String dt=String.valueOf(dateTime);
        String[] dateTimeArray=dt.split("T");
        String date=dateTimeArray[0];
        String time=dateTimeArray[1];

        String[] dateRev=date.split("-");

        String newDate="";
        for(int i=0;i<dateRev.length;i++){
            newDate=dateRev[i] + newDate;
            if(i!=(dateRev.length -1)){
                newDate= "-" + newDate ;
            }
        }
        String[] timeHH=time.split(":");
        int hour=Integer.parseInt(timeHH[0]);
        hour=hour+12;

        timeHH[0]=String.valueOf(hour);

        String newTime="";
        for(int i=0;i<timeHH.length;i++){
            newTime=newTime + timeHH[i] ;
            if(i!=(dateRev.length -1)){
                newTime=  newTime + ":" ;
            }
        }
        String datetime= newDate +" " +newTime;

        return datetime;

    }


}

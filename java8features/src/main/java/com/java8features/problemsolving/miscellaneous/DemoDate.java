package com.java8features.problemsolving.miscellaneous;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate {

    public static void main(String[] args) throws ParseException {

        String date="22-03-2023";
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat sdf2=new SimpleDateFormat("dd-MM-yy");
        Date date2=sdf2.parse(date);
        String formattedDate=sdf.format(date2);
        System.out.println(formattedDate);
    }
}

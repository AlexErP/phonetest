package com.test.tele1.util;

public class Utils {

    public static String getPrettyString (String s){

        return String.format("%-10s", s).replace(" ", "x");
    }
}

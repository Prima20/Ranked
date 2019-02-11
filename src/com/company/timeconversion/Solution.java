package com.company.timeconversion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
            String hourTime = s.substring(8,10);
            String convertedHour;
            int hour = 0;

            if(hourTime.equals("PM")){

                hour = Integer.parseInt(s.substring(0,2));

                if(hour == 12){

                }else{
                    hour += 12;
                }
            }
            else{
                hour = Integer.parseInt(s.substring(0,2));

                if(hour == 12){
                    return "00" + s.substring(2,8);
                }else if (hour < 12){
                    return "0" + hour + s.substring(2,8);
                }
            }
            convertedHour = String.valueOf(hour) + s.substring(2,8);

        return convertedHour;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        System.out.println(result);
        //bw.write(result);
        //bw.newLine();

        //bw.close();
    }

}

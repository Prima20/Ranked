package com.company.plusminus;

import java.util.Scanner;

public class Solution {
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        double pos =0, neg =0 , zero = 0;
        double resPos, resNeg, resZero;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                pos= pos + 1;
            }else if(arr[i] < 0){
                neg= neg + 1;
            }else{
                zero = zero + 1;
            }
        }



        resPos = pos / arr.length;
        resNeg = neg / arr.length;
        resZero = zero / arr.length;

        System.out.println(resPos);
        System.out.println(resNeg);
        System.out.println(resZero);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

package com.thealgorithms.maths;

import java.util.Scanner;


public class SquareRootWithBabylonianMethod {
    /**
     * get the value, return the square root
     *
     * @param num contains elements
     * @return the square root of num
     */
    public static float square_Root(float num)
    {
        float a = num;
        float b = 1;
        double e = 0.000001;
        while (a - b > e) {
            a = (a + b) / 2;
            b = num / a;
        }
        return a;
    }
    
    /**
    * get the value and num of digits accuracy
    * @param num element
    * @param acc the number of digits accuracy
    * @return the square root of num with acc digits accuracy
    */
    public static float square_Root(float num, int acc) {
        float a = num;
        float b = 1;
        double e;
        e = (acc <= 15)? Math.pow(10, acc) : Math.pow(10, 15);   // 15 is the max digits accuracy, right?
        while(a - b > e) {
            a = (a + b) / 2;
            b = num / a;
        }
        return a;
    }

}

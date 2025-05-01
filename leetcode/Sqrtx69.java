package leetcode;

import java.util.Scanner;

/*
Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 */
public class Sqrtx69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose sqrt you want");
        int n = sc.nextInt();
       // Sqrtx69 sq=new Sqrtx69();
        System.out.println(mysqrt(n));

    }
    public static int mysqrt(int x) {
        int start = 1;
        int end = x;
        int ans = 0;
        while (start <= end) {

            int mid = start + (end - start) / 2;
            if ((long)mid * mid == x) {
                return mid;
            }
            else if ((long)mid * mid > x) {
                end = mid - 1;
            }
            else
            {
                ans=mid;
                start=mid+1;
            }


        }
        return ans;
    }
}

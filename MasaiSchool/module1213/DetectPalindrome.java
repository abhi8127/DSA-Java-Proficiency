package MasaiSchool.module1213;

import java.util.Scanner;

public class DetectPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int rev=0;
        for(int i=n;i!=0;i=i/10)
        {
            int digit=i%10;
            rev=rev*10+digit;
        }
        System.out.println("Reverse of the number "+n+" is "+rev);
        if(n==rev){
            System.out.println(n+" is palindrome ");
        }
        else {
            System.out.println(n+ " is not a palindrome");
        }

    }
}

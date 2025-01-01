package MasaiSchool.module1213;

import java.util.Scanner;

public class CatchThat420 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str= sc.next();
        int n=str.length();
        int count=0;
        for(int i=0;i<n-2;i++)
        {
            if (str.charAt(i) == '4' && str.charAt(i + 1) == '2' && str.charAt(i + 2) == '0')
            {
                count++;
                break;
            }

        }
        if(count==1)
        {
            System.out.println("caught");

        }
        else
        {
            System.out.println("escaped");
        }
    }
}

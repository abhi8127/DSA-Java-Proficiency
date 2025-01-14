package MasaiSchool.module1214;

import java.util.Scanner;

public class OddOfOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Please enter the element of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int oddCount=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                oddCount++;
            }
        }
        if(oddCount%2!=0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("NO");
        }

    }
}

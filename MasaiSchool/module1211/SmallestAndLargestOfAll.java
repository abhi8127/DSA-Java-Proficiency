package MasaiSchool.module1211;

import java.util.Scanner;

public class SmallestAndLargestOfAll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the value in the array");

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }

            if(arr[i]<min)
            {
                min=arr[i];
            }
        }

        System.out.println("Max in array is "+max);
        System.out.println("Min in array is "+min);
    }
}

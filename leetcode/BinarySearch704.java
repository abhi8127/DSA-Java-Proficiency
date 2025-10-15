package leetcode;

import java.util.Scanner;

/*
Given an array of integers nums which is sorted in ascending order,
 and an integer target, write a function to search target in nums.
 If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.
 */
public class BinarySearch704 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element in the array in ascending order");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target value you want to search");
        int t=sc.nextInt();

        BinarySearch704 bs=new BinarySearch704();
        System.out.println(bs.search(arr,t));

    }

    public int search(int[] nums,int target)
    {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if (target>nums[mid]) {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }

        return -1;
    }
}

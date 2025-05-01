package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Given two integer arrays nums1 and nums2, return an array of their intersection.
 Each element in the result must appear as many times as it shows in both arrays and
 you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 */
public class intersectionOfTwoArr350 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        System.out.println("Enter the element in first array");
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();

        }
        System.out.println("Enter the size of the Second array");
        int m=sc.nextInt();
        int []arr2=new int[m];

        System.out.println("Enter the element in the second array");
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(intersectionOfTwoArr350.intersection(arr1, arr2)));

    }

    public static int[] intersection(int[] nums1,int[] nums2)
    {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    list.add(nums2[j]);
                    nums2[j]=-1;
                    break;
                }
            }
        }
        int[] result=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            result[i]=list.get(i);
        }
        return result;
    }
}

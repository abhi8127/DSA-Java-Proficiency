package MasaiSchool.W2D5;

public class MaxInArray {
    public static void main(String[] args){
        int[] arr={8,3,6,1,166};
        int max=arr[0];
        for(int i=1;i< arr.length;i++)
        {
         if(arr[i]>max)
         {
             max=arr[i];
         }

        }
        System.out.println(max);
    }
}

package MasaiSchool.W2D5;

public class MinInArray {
    public static void main(String[] args){
        int[] arr1={10,34,23,-15,1000};
        System.out.println(min(arr1));

    }

    public static int min(int[] arr){
        int min=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
}

package MasaiSchool.W2D5;

public class EvenArray {
    public static void main(String []args){
     int[] arr={10,20,21,16,13};
        System.out.println("Even in array are ");
        Even(arr);

        System.out.println("Odd in array are ");
        odd(arr);
    }
   static public void Even(int arr[]){
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println(arr[i]);
            }
        }

    }

    static void odd(int[] arr){
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.println(arr[i]);
            }
        }
    }

}

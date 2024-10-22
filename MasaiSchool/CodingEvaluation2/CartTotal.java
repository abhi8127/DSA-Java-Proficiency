package MasaiSchool.CodingEvaluation2;

public class CartTotal {
    public static void main(String[] args) {
 int[] quantity={2,1,2};
 int price[]={100,20,40};
        System.out.println(TotalPrice(quantity,price));
    }
    public static int TotalPrice(int[] quantity,int[] price)
    {
        int n= quantity.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
           sum=sum+quantity[i]*price[i];
        }
        return sum;
    }
}

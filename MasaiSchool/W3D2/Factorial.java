package MasaiSchool.W3D2;

public class Factorial {
    public static void main(String[] args) {
        int n=5;
        Factorial f1= new Factorial();
        System.out.println(f1.fact(n));
    }
    public int fact(int num)
    {
       int product=1;
       for(int i=1;i<=num;i++)
       {
           product=product*i;
       }
       return product;
    }
}

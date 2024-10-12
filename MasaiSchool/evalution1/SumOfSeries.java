package MasaiSchool.evalution1;
/*
Given two Integer N,X Find the value of the series : 1 + X + X*X + X*X*X +.........Nth term
 where N is the no of term ,X contain the value of x.
 if N<=0 or X<=0 print -1
 */
public class SumOfSeries {
    public static void main(String[] args) {
        int N=3, X=2;
        int sum=0;
        for(int i=0;i<N;i++)
        {
            sum=sum+(int)Math.pow(X,i);
        }
        System.out.println(sum);

    }
}

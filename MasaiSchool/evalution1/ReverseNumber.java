package MasaiSchool.evalution1;

public class ReverseNumber {
    public static void main(String[] args) {
        int num=791;
        System.out.println(rev(num));
    }

    public static int rev(int n){
        int rev=0;
        while(n!=0){
            int digit =n%10;

            rev=rev*10+digit;
            n=n/10;
        }
        return rev;
    }
}

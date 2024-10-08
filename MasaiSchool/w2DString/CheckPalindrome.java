package MasaiSchool.w2DString;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str="naman";
        if(palindromeOrNot(str))
        {
            System.out.println(str+" is a palindrome");
        }
        else {
            System.out.println(str+" is not a palindrome");
        }

    }

    public static boolean palindromeOrNot(String str){
        int n=str.length();
        String rev="";
        for(int i=n-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)) {
            return true;
        }
        return false;

    }
}

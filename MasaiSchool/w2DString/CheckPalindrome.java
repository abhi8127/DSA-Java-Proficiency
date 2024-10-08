package MasaiSchool.w2DString;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str="naaman";
        if(palindromeOrNot(str))
        {
            System.out.println(str+" is a palindrome");
        }
        else {
            System.out.println(str+" is not a palindrome");
        }

        System.out.println(palindrome(str));

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

    // Using two pointer
    public static boolean palindrome(String str){
        int n=str.length();
        int i=0,j=n-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return false;
            }
            i++;
            j--;


        }
        return true;



    }
}

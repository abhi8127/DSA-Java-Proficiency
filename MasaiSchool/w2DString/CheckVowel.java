package MasaiSchool.w2DString;

public class CheckVowel {
    public static void main(String[] args) {
        String str="abhishek";

        if(vowel(str))
        {
            System.out.println("String contain vowel ");

        }
        else {
            System.out.println("String did not contain vowel");
        }

        noOfVowelAndConsonent(str);

    }
    public static boolean vowel(String str){
        int n=str.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                count++;
                break;
            }
        }
        if(count>0)
        {
            return true;
        }
        else {
            return false;
        }
    }

    static public void noOfVowelAndConsonent(String str){
        int n=str.length();
        int vow=0;
        int cons=0;
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                vow++;
            }
            else {
                cons++;
            }
        }
        System.out.println("no of vowels are : "+ vow);
        System.out.println("no of consonant are : "+ cons);
    }
}

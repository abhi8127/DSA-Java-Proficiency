package MasaiSchool.CodingEvaluation2;

public class CapitalLetter {
    public static void main(String[] args) {
        String str="raHuL";
        int n=str.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)>'A'&&str.charAt(i)<'Z')
            {
                count++;
            }
        }
        System.out.println(count*13);
    }
}

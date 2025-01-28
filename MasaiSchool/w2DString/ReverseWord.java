package MasaiSchool.w2DString;

public class ReverseWord {
    public static void main(String[] args) {
        String str="Hello World";
        String result="";

        String [] word=str.split(" ");
        for(int i=0;i< word.length;i++)
        {
            String RevWord="";
            for(int j=word[i].length()-1;j>=0;j--)
            {
                RevWord=RevWord+word[i].charAt(j);
            }
            result=result+RevWord+" ";
        }
        System.out.println(result);
    }
}

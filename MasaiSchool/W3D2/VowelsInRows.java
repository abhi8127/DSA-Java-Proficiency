package MasaiSchool.W3D2;

public class VowelsInRows {
    public static void main(String[] args) {
        char[][] arr={{'a','b'} , {'c','d'} , {'e','f'}};

        for(int i=0;i< arr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]=='a'||arr[i][j]=='e'||arr[i][j]=='i'||arr[i][j]=='o'||arr[i][j]=='u')
                {
                    count++;
                    break;
                }
            }
            if(count>0)
            {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}

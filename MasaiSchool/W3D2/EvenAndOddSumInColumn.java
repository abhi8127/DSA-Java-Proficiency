package MasaiSchool.W3D2;

public class EvenAndOddSumInColumn {
    public static void main(String[] args) {
        int[][] arr={{1,2,3}, {4,5,6} ,{7,8,9}};
        for(int j=0;j<arr.length;j++)
        {
            int evensum=0,oddsum=0;
            for(int i=0;i< arr.length;i++)
            {
                if(arr[i][j]%2==0)
                {
                    evensum=evensum+arr[i][j];
                }
                else{
                    oddsum=oddsum+arr[i][j];
                }
            }
            System.out.println("even sum in column"+j+" "+evensum);
            System.out.println("odd sum in column"+j+" "+oddsum);
        }
    }
}

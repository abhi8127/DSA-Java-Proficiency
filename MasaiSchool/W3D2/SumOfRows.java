package MasaiSchool.W3D2;

public class SumOfRows {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}, {5, 6, 7}};
        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[i].length; j++) {

                sum = sum + mat[i][j];

            }
            System.out.println(sum);
        }
    }
}

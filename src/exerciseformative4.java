public class exerciseformative4
{
    public static void main(String[] args)
    {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("The sum is " + sum(matrix));
        System.out.println("The max is " + max(matrix));
    }
    public static int sum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];

            }
        }
        return sum;
    }
    public static int max(int[][] matrix) {
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max)
                {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }


}

public class exerciseformative4
{
    public static void main(String[] args)
    {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                if (matrix[i][j] > max)
                {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("The sum is " +sum);
        System.out.println("The max is " +max);
    }

}

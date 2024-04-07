public class exo1formatif
{

    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        System.out.println("The sum is " + sum);

        int max = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The maximum is " + max);

    }

}

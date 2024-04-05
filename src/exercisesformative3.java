import java.util.ArrayList;

public class exercisesformative3
{

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);

        int sum = sum(array);
        System.out.println("The sum is " + sum);

        double aver = avg(array);
        System.out.println("The average is " + aver);

        removeEven(array);
        System.out.println("After removing the even numbers: " + array);

    }


    public static int sum(ArrayList<Integer> array)
    {
        int sum = 0;
        for (int i=0; i < array.size(); i++ ) {
            sum = sum + array.get(i);
            {
                sum = sum / (array.size());

            }

        }
        return sum;
    }

    public static double avg(ArrayList<Integer> array) {
        int avg = 0;
        for (int i=0; i < array.size(); i++ ) {
            avg = avg + array.get(i);
            {
                avg = avg / (array.size());

            }

        }
        return avg;
    }
    public static void removeEven(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) {
                array.remove(i);
                i--;
            }
        }
    }
}
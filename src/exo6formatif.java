import java.util.ArrayList;

public class exo6formatif {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        int sum = sum(array);
        System.out.println("The sum is " + sum);

        int max = max(array);
        System.out.println("The maximum is " + max);
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

        public static int max(ArrayList<Integer> array)
        {
            int max = 0;
            for (int i=0; i < array.size(); i++ ) {
                if (array.get(i) > max) {
                    max = array.get(i);
                }
            }
            return max;
        }

    }


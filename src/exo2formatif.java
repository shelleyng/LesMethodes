public class exo2formatif
{
    public static void main(String[] args)
    {

        String[] names = {"Shelley", "Daniel", "Zoe", "Emmeline"};
        String name = "Shelley";
        int index = indexOf(names, name);
        if (index!= -1) {
            System.out.println(name + " is at index " + index);
        }
        else
        {
            System.out.println(name + " is not in the array");
        }
    }
    public static int indexOf(String[] names, String name)
    {
        for (int i = 0; i < names.length; i++)
        {
            if (names[i].equals(name))
            {
                return i;
            }
        }
        return -1;
    }
}

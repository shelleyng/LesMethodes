import java.util.ArrayList;
import java.util.List;

public class exemplecoll
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("Avec les élements ajoutés: " + list);

        list.remove("b");
        System.out.println("Après avoir enlevé B: " + list);

        String element = list.get(0);
        System.out.println("Élement à l'indice 0: " + element);

        System.out.print("Parcourir la collection: ");
        for (String str : list)  {
            System.out.print(str + " ");
        }
        System.out.println();

        int size = list.size();
        System.out.println("Grandeur de list: " + size);

        boolean isEmpty = list.isEmpty();
        System.out.println("Est vide? " + isEmpty);

        list.clear();
        System.out.println("Après avoir effacé la liste: " + list);

        List<String> newList = new ArrayList<>();
        newList.add("x");
        newList.add("y");
        newList.add("z");
        list.addAll(newList);
        System.out.println("Après ajout des élements d'une autre collection: " + list);
    }
}

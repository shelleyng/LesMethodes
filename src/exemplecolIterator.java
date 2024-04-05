import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class exemplecolIterator
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("a");list.add("b");list.add("c");

        Iterator<String> iterator = list.iterator();
        System.out.print("Parcourir avec iterator: ");
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();

        iterator = list.iterator();
        System.out.print("modification: ");
        while(iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("b")) {
                iterator.remove();
            }
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("Après avoir modifié en enlevant 'B': " + list);
    }

}

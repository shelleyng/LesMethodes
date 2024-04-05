public class principal
{
    public static void main(String[] args)
    {
        principal abc=new principal();
        abc.afficher();
    }
    public void afficher ()
    {
        System.out.println("Message");
        saluer("John");
    }
    public static void saluer (String nom)
    {
        System.out.println("Bonjour "+nom);
    }
    public static int calculer(int a, int b)
    {
        return a+b;
    }
    public static boolean isPresent (int [] monTab)
    {
        boolean a=false;
        for (int i = 0; i < monTab.length; i++)
        {
            if (monTab[i] == 0)
                a=true;
        }
        return true;
    }
}

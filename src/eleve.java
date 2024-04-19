/**
 * @author : shelley
 * @Description :
 * @created : 2024-04-15, Monday
 **/
public class eleve
{
    String nom;
    String prenom;
    String age;
    int numEleve;
    

    public eleve(int numEleve, String nom, String prenom, String age)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numEleve = numEleve;

    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getPrenom()
    {
        return prenom;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public String getAge()
    {
        return age;
    }

    public void setAge(String age)
    {
        this.age = age;
    }
}

/**
 * @author : shelley
 * @Description : What is a class?
 * @created : 2024-04-15, Monday
 **/
public class car
{
    String make;
    String model;

    //constructor
    public car(String make, String model)
    {
        this.make = make;
        this.model = model;
    }
    //Getters & Setters

    public String getMake()
    {
        return make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }
}

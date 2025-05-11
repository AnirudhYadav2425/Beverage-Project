package Beverage_Project;

public abstract class Beverage 
{
    String name;
    double price;
    public Beverage(String name, double price)
    {
        this.name=name;
        this.price=price;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public abstract void prepare();
    
}

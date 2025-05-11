package Beverage_Project;

public class Coffee extends Beverage
{
    boolean hasMilk;
    boolean hasSuger;

    public Coffee(String name, double price, boolean hasMilk,boolean hasSuger)
    {
        super(name,price);
        this.hasMilk=hasMilk;
        this.hasSuger=hasSuger;
    }
    public void prepare()
    {
        System.out.println("Preparing " + getName() + ".....");
        System.out.println("1. Brewing coffee beans.");
        if(hasMilk)
        System.out.println("2. Adding milk.");
        if (hasSuger)
        System.out.println("3. Adding suger.");
        System.out.println("4. Coffee is ready!");  
    }
}

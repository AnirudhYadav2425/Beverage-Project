package Beverage_Project;

public class Juice extends Beverage
{
    String flavor;
    boolean isFresh;

    public Juice(String flavor, double price,boolean isFresh)
    {
        super(flavor + "Juice",price);
        this.flavor=flavor;
        this.isFresh= isFresh;
    }
    public void prepare()
    {
        System.out.println("Preparing " + getName() + ".....");
        if (isFresh)
        System.out.println("1. Extracting fresh juice.");
        else System.out.println("1. Pouring juice from the bottle.");
        System.out.println("2. Serving " + flavor + "juice.");
    }
}

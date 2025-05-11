package Beverage_Project;

public class Wine extends Beverage 
{
    int vintageYear;
    double alcoholContent;

    public Wine(String name, double price, int vintageYear, double alcoholContent)
    {
        super(name + "Wine", price);
        this.vintageYear=vintageYear;
        this.alcoholContent=alcoholContent;
    }
    public void prepare()
    {
        System.out.println("Preparing " + getName() + ".....");
        System.out.println("1.Opening the wine bottle.");
        System.out.println("2.Pouring wine into a glass.");
        System.out.println("3.Vintage Year: " + vintageYear + " Alcohol Content: " + alcoholContent + "%.");
    }
}
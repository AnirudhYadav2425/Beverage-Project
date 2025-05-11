package Beverage_Project;

public class User
{
    public static void main(String[] args)
    {
        Coffee coffee=new Coffee("Espresso", 100.0, true,false);
        System.out.println("Order: " + coffee.getName() + " -rupee"+ coffee.getPrice());
        coffee.prepare();

        System.out.println("\n");

        Juice juice=new Juice("Orange", 80.0, true);
        System.out.println("Order: " + juice.getName() + " -rupee" + juice.getPrice());
        juice.prepare();

        System.out.println("\n");


        Wine wine =new Wine("Chardonnay", 500.0, 2018,13.5);

        System.out.println("Order: " + wine.getName() + "-rupee" + wine.getPrice());
        wine.prepare();
    }
}

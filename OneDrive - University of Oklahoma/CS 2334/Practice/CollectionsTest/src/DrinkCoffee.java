
public class DrinkCoffee
{
    public DrinkCoffee() 
    {
        
    }
    
    public static void drinkCoffee(Coffee cup)
    {
        
        
        while (! cup.isEmpty())
        {
            cup.takeOneSip();
            //drinkCoffee(cup);
        }
        
        
    }
    
    public static void main(String[] args)
    {
        Coffee cup = new Coffee();
        
        drinkCoffee(cup);
        System.out.println("empty yo");
    }
    
}

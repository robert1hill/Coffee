
public class Coffee
{
    
    private int sips = 10;
    
    public Coffee()
    {
        
    }
    
    public void takeOneSip()
    {
      System.out.println("one");
        --sips;
    }
    
    public boolean isEmpty()
    {
        return (sips <= 0);
    }
    
}

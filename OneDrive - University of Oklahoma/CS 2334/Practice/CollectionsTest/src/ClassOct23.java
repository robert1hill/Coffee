
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class ClassOct23
{
    public static <T> void main(String[] args)
    {
        String line = "  TAIR SRAD BATV ";
        line = line.trim();
        String[] parts = line.split("\\s+");
        System.out.println(parts.length);
        
        List<String> list = new ArrayList<String>(Arrays.asList(parts));
        System.out.println(list);
        
        list.add("Hallo");
        list.add("Eat a fire");
        LinkedList<String> lList = new LinkedList<>(list);
        LinkedList<String> dList = (LinkedList<String>) lList.clone();
        
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(new Integer(9));
        ints.add(3);
        Iterator<Integer> iter = ints.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
        
        for(Integer i : ints)
        {
            System.out.println(i);
        }
        
    }
}

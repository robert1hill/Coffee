import java.util.Scanner;

public class Palindrome
{

   
    
    public static String isPalindrome(String input, int position)
    {
        
        if (position >= (1))
        {
            return "It's a Palindrome";
        }
        else
        {
            if (input.charAt(position) == (input.charAt(input.length() - 1 - position)))
            {
                
                isPalindrome(input, position + 1);
            }
            else
            {
                return "It's not a Palindrome";
            }
          
        }
        
        
    }
    
    
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("put in a String");
        System.out.println(Palindrome.isPalindrome(s.nextLine(), 0));

    }

}

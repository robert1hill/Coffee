import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class QuickSip
{
    
    
    public static void main(String[] args)
    {
        
        JFrame frame = new JFrame();
        JButton button = new JButton("Add Coffee");
        
        
        class DrinksCoffee implements ActionListener
        {

            private int gulps;
            
            public DrinksCoffee(int gulps)
            {
                this.gulps = gulps;
            }
            
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
              
                if (gulps > 0)
                {
                    System.out.println(gulps);
                }
                else if (gulps == 0)
                {
                    System.out.println("done");
                    JOptionPane.showMessageDialog(null,  "Make another?");
                    System.exit(0);
                }
                --gulps;
            }
            
        }
        
        DrinksCoffee dc = new DrinksCoffee(100);
        Timer t = new Timer (100, dc);
        t.start();
        
        
        System.exit(0);
        
    }
}

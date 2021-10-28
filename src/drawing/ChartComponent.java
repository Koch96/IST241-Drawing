package drawing;

import java.awt.*;
import javax.swing.*;

/** @author sak5680 */
public class ChartComponent extends JComponent{
    public void paintComponent(Graphics g){
        g.fillRect(0, 10, 200, 10);
        g.fillRect(0, 30, 300, 10);
        g.fillRect(0, 50, 100, 10);
        
        g.setColor(Color.CYAN);
        g.drawLine(350, 35, 305, 35);
        g.drawLine(305, 35, 310, 30);
        g.drawLine(305, 35, 310, 40);
        
        g.setColor(Color.YELLOW);
        g.fillOval(350, 25, 25, 20);
        
        g.setColor(Color.BLACK);
        g.drawString("Best", 350, 40);
        
        g.setColor(Color.RED);
        g.drawLine(350, 55, 105, 55);
        g.drawLine(105, 55, 110, 50);
        g.drawLine(105, 55, 110, 60);
        
        g.setColor(Color.YELLOW);
        g.fillOval(350, 45, 35, 20);
        
        g.setColor(Color.BLACK);
        g.drawString("Worst", 350, 60);
    }
}

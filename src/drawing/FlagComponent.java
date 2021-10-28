package drawing;

/** @author sak5680 */ 

import java.awt.*;
import javax.swing.*;

public class FlagComponent extends JComponent{
    
    public void paintComponent(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(100,100,30,60);
        g.setColor(Color.WHITE);
        g.fillRect(130,100,30,60);
        g.setColor(Color.RED);
        g.fillRect(160,100,30,60);
    }
    
}

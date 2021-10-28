package drawing;

import java.awt.*;
import javax.swing.*;

/** @author sak5680 */
public class ChartComponent extends JComponent{
    public void paintComponent(Graphics g){
        g.fillRect(0, 10, 200, 10);
        g.fillRect(0, 30, 200, 10);
        g.fillRect(0, 50, 200, 10);
    }
}

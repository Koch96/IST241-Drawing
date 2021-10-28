package drawing;

import javax.swing.*;


//@author sak5680

public class Drawing {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JComponent component = new FlagComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }

}

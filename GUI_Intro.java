import java.util.*;

import javax.swing.JOptionPane;

public class GUI_Intro {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter Your Name");
        JOptionPane.showMessageDialog(null, "Hello "+name);
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        JOptionPane.showMessageDialog(null, "The number is: "+number);
    }
}

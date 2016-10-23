/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamickeypadforatm;

import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Kauz
 */
public class AccountScreen extends JFrame {
    
    JFrame panel2;
    JTextField welcomeField;

    public AccountScreen() {
        panel2=new JFrame("Dynamic keypad for ATM");
        panel2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        welcomeField=new JTextField("Thanks for using our ATM Service. We're happy to help you!");
    }
    public void launchFrame2(){
         panel2.setLayout(null);
        panel2.setVisible(true);
        panel2.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        panel2.add(welcomeField);
        welcomeField.setSize(360, 50);
        welcomeField.setLocation(500, 300);
        welcomeField.setEditable(false);
        welcomeField.setHorizontalAlignment(JTextField.CENTER);
    }
    
    public static void main(String adacd[]){
        AccountScreen acc=new  AccountScreen();
        acc.launchFrame2();
    }
    
}

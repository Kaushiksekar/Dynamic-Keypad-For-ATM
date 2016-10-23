/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamickeypadforatm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Kauz
 */
public class WelcomeScreen extends JFrame implements ActionListener{

    
    JFrame panel;
    JButton nextScreen,visuallyChallScreen;
    JTextField welcomeField;
    
    
    public WelcomeScreen(){
        panel=new JFrame("Dynamic keypad for ATM");
        panel.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        nextScreen=new JButton();
        visuallyChallScreen=new JButton();
        welcomeField=new JTextField("Welcome to XYZ bank. Please press the button below to continue");
        
    }
     public void launchFrame(){
        panel.setLayout(null);
        panel.setVisible(true);
        panel.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
         panel.add(welcomeField);
        welcomeField.setSize(360, 50);
        welcomeField.setLocation(500, 150);
        welcomeField.setEditable(false);
        welcomeField.setHorizontalAlignment(JTextField.CENTER);
        
        
        
        panel.add(nextScreen);
        nextScreen.setSize(250, 50);
        nextScreen.setLocation(580, 250);
        nextScreen.setLabel("Continue");
        nextScreen.setHorizontalAlignment(JButton.CENTER);
        nextScreen.addActionListener(this);
        
        panel.add(visuallyChallScreen);
        visuallyChallScreen.setSize(250, 50);
        visuallyChallScreen.setLocation(580, 320);
        visuallyChallScreen.setLabel("Login for Visually challenged");
        visuallyChallScreen.setHorizontalAlignment(JButton.CENTER);
        visuallyChallScreen.addActionListener(this);
       
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        WelcomeScreen welcome=new WelcomeScreen();
        welcome.launchFrame();
        
    }

    void switchScreen(ActionEvent e){
        JButton buttonName;
        
        buttonName=(JButton) e.getSource();
        
        if(buttonName.getText() == "Continue"){
             
        panel.dispose();
        ATMDynamicKeypad atm=new ATMDynamicKeypad();
        atm.launchFrame();
        }
        else if(buttonName.getText() == "Login for Visually challenged"){
            KeypadForVisuallyChallenged key=new KeypadForVisuallyChallenged();
            key.launchFrame();
            panel.dispose();
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        switchScreen(e);
        
       
        
        
    }



    
   
    
}

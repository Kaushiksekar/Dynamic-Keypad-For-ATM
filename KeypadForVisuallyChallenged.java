/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamickeypadforatm;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import static java.lang.Thread.sleep;



import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Kauz
 */
public class KeypadForVisuallyChallenged extends JFrame implements ActionListener{

    public JFrame panel1;
    JTextField tf;
    JTextField tf1;
    JTextField tf2;
    JTextField tf3;
    JTextField tf4;
    JButton button;
    int counter=0;
    int counter1=0;
    int counter2=0;
    int counter3=0;
    int digit=1;
    boolean timeFlag;
    String textOfTf="";

    public KeypadForVisuallyChallenged() {
        panel1=new JFrame("Keypad for Visually Challenged");
        panel1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        
        tf=new JTextField("Digit1");
        tf.setEnabled(false);
        tf.setHorizontalAlignment(JTextField.CENTER);
        
       tf1=new JTextField("Digit2");
        tf1.setEnabled(false);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        
        tf2=new JTextField("Digit3");
        tf2.setEnabled(false);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        
        tf3=new JTextField("Digi4");
        tf3.setEnabled(false);
        tf3.setHorizontalAlignment(JTextField.CENTER);
        
        tf4=new JTextField();
        tf4.setEnabled(false);
        tf4.setHorizontalAlignment(JTextField.CENTER);
        
        button=new JButton();
    }
     public void launchFrame(){
        panel1.setLayout(null);
        panel1.setVisible(true);
        panel1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
         panel1.add(tf);
        tf.setSize(100, 50);
        tf.setLocation(0, 150);
        tf.setEnabled(false);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setVisible(false);
        
        panel1.add(tf1);
        tf1.setSize(100, 50);
        tf1.setLocation(150, 150);
        tf1.setEnabled(false);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        tf1.setVisible(false);
        
        panel1.add(tf2);
        tf2.setSize(100, 50);
        tf2.setLocation(300, 150);
        tf2.setEnabled(false);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        tf2.setVisible(false);
        
        
        panel1.add(tf3);
        tf3.setSize(100, 50);
        tf3.setLocation(450, 150);
        tf3.setEnabled(false);
        tf3.setHorizontalAlignment(JTextField.CENTER);
        tf3.setVisible(false);
       
        panel1.add(tf4);
        tf4.setSize(300, 50);
        tf4.setLocation(520, 30);
        tf4.setEnabled(false);
        tf4.setHorizontalAlignment(JTextField.CENTER);
        
        
        
        panel1.add(button);
        button.setSize(1366,620);
        button.setLocation(0, 85);
        button.setLabel("Press");
        button.setHorizontalAlignment(JTextField.CENTER);
        button.addActionListener(this);
        
        
        
     }
     
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        KeypadForVisuallyChallenged tt=new KeypadForVisuallyChallenged();
        tt.launchFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Thread thread=new Thread(){
            @Override
            public void run(){
                try{
                    if(digit==1){
                    sleep(5000);
                    counter++;
                    digit++;
                    if(counter>4){
                        tf.setText("4");
                    }
                    else{
                    tf.setText(String.valueOf(counter));}
                    tf4.setText(tf.getText());
                    //textOfTf=textOfTf+tf.getText();
                    //tf.setText(textOfTf);
                   /* if(counter==1){
                        tf.setText(tf.getText()+counter);
                    }
                    else if(counter==2){
                        tf.setText(tf.getText()+counter);
                    }
                    else if(counter==3){
                       tf.setText(tf.getText()+counter);
                    }
                    else {
                       tf.setText(tf.getText()+counter);
                    }*/
                    
                    }
                    else if(counter>0 && counter1==0){
                        sleep(5000);
                        counter1++;
                        digit++;
                        if(counter1>4){
                            tf1.setText("4");
                        }
                        else{
                        tf1.setText(String.valueOf(counter1));}
                        tf4.setText(tf.getText()+tf1.getText());
                    }
                     else if(counter1>0 && counter2==0){
                        sleep(5000);
                        counter2++;
                        digit++;
                        if(counter2>4){
                            tf2.setText("4");
                        }
                        else{
                        tf2.setText(String.valueOf(counter2));}
                        tf4.setText(tf.getText()+tf1.getText()+tf2.getText());
                    }
                     else if(counter2>0 && counter3==0){
                        sleep(5000);
                        counter3++;
                        digit++;
                        if(counter3>4){
                            tf3.setText("4");
                        }
                        else{
                        tf3.setText(String.valueOf(counter3));}
                        tf4.setText(tf.getText()+tf1.getText()+tf2.getText()+tf3.getText());
                    }
                    
                }
                catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        };
        thread.start();
    }
    

   

   
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamickeypadforatm;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Kauz
 */
public class ATMDynamicKeypad extends JFrame implements ActionListener {

    /**
     * @param args the command line arguments
     */
    
    
    public JFrame panel1;
    JPasswordField passArea;
    JTextField errorMsg;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bEnter,bCancel,bClear,bDummy1,bDummy2,bDummy3;
    List<Integer> dataList1 = new ArrayList<Integer>();
    List<Integer> dataList2 = new ArrayList<Integer>();
    List<Integer> dataList3 = new ArrayList<Integer>();
    
    public ATMDynamicKeypad(){
        
        
        
  
        
        
        
        
        
        
        panel1=new JFrame("Dynamic keypad for ATM");
        panel1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        passArea = new JPasswordField();
        passArea.setEnabled(false);
        passArea.setHorizontalAlignment(JPasswordField.CENTER);
        errorMsg=new JTextField();
        errorMsg.setEnabled(false);
        errorMsg.setHorizontalAlignment(JTextField.CENTER);
        b0=new JButton();
        b1=new JButton();
        b2=new JButton();
        b3=new JButton();
        b4=new JButton();
        b5=new JButton();
        b6=new JButton();
        b7=new JButton();
        b8=new JButton();
        b9=new JButton();
        bEnter=new JButton();
        bCancel=new JButton();
        bClear=new JButton();
        bDummy1=new JButton();
        bDummy2=new JButton();
        bDummy3=new JButton();
        
    }
    public void launchFrame(){
        panel1.setLayout(null);
        panel1.setVisible(true);
        panel1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
        try{
        
          for (int i = 7; i <10; i++) {
      dataList1.add(i);
    }
    Collections.shuffle(dataList1);
    
    
    
     for (int i = 1; i <4; i++) {
      dataList2.add(i);
    }
    Collections.shuffle(dataList2);
    
    
    for (int i = 4; i <7; i++) {
      dataList3.add(i);
    }
    Collections.shuffle(dataList3);
    
   }
        catch(Exception e){
            System.out.println(e);
        }
        
        String outp1=Integer.toString(dataList1.get(0));
        String outp2=Integer.toString(dataList1.get(1));
        String outp3=Integer.toString(dataList1.get(2));
        String outp4=Integer.toString(dataList2.get(0));
        String outp5=Integer.toString(dataList2.get(1));
        String outp6=Integer.toString(dataList2.get(2));
        String outp7=Integer.toString(dataList3.get(0));
        String outp8=Integer.toString(dataList3.get(1));
        String outp9=Integer.toString(dataList3.get(2));
        
        panel1.add(passArea);
        passArea.setSize(400, 35);
        passArea.setLocation(400, 150);
                
        panel1.add(b0);
        b0.setSize(70, 50);
        b0.setLocation(400, 250);
        b0.setLabel(outp4);
        b0.addActionListener(this);
        
        panel1.add(b1);
        b1.setSize(70, 50);
        b1.setLocation(500, 250);
        b1.setLabel(outp5);
        b1.addActionListener(this);
        
        panel1.add(b2);
        b2.setSize(70, 50);
        b2.setLocation(600, 250);
        b2.setLabel(outp6);
        b2.addActionListener(this);
        
        panel1.add(bCancel);
        bCancel.setSize(100, 50);
        bCancel.setLocation(700, 250);
        bCancel.setLabel("CANCEL");
        bCancel.addActionListener(this);
        
        panel1.add(b3);
        b3.setSize(70, 50);
        b3.setLocation(400, 330);
        b3.setLabel(outp7);
        b3.addActionListener(this);
        
        panel1.add(b4);
        b4.setSize(70, 50);
        b4.setLocation(500, 330);
        b4.setLabel(outp8);
        b4.addActionListener(this);
        
        panel1.add(b5);
        b5.setSize(70, 50);
        b5.setLocation(600, 330);
        b5.setLabel(outp9);
        b5.addActionListener(this);
        
        panel1.add(bClear);
        bClear.setSize(100, 50);
        bClear.setLocation(700, 330);
        bClear.setLabel("CLEAR");
        bClear.addActionListener(this);
        
        
        
        panel1.add(b6);
        b6.setSize(70, 50);
        b6.setLocation(400, 410);
        b6.setLabel(outp1);
        b6.addActionListener(this);
        
        panel1.add(b7);
        b7.setSize(70, 50);
        b7.setLocation(500, 410);
        b7.setLabel(outp2);
        b7.addActionListener(this);
        
        panel1.add(b8);
        b8.setSize(70, 50);
        b8.setLocation(600, 410);
        b8.setLabel(outp3);
        b8.addActionListener(this);
        
        panel1.add(bEnter);
        bEnter.setSize(100, 50);
        bEnter.setLocation(700, 410);
        bEnter.setLabel("ENTER");
        bEnter.addActionListener(this);
        
        panel1.add(bDummy1);
        bDummy1.setSize(70, 50);
        bDummy1.setLocation(400, 490);
        bDummy1.setLabel("");
        bDummy1.addActionListener(this);
        
        panel1.add(b9);
        b9.setSize(70, 50);
        b9.setLocation(500, 490);
        b9.setLabel("0");
        b9.addActionListener(this);
        
        panel1.add(bDummy2);
        bDummy2.setSize(70, 50);
        bDummy2.setLocation(600, 490);
        bDummy2.setLabel("");
        bDummy2.addActionListener(this);
        
        panel1.add(bDummy3);
        bDummy3.setSize(100, 50);
        bDummy3.setLocation(700, 490);
        bDummy3.setLabel("");
        bDummy3.addActionListener(this);
        
        
        panel1.add(errorMsg);
        errorMsg.setSize(360, 50);
        errorMsg.setLocation(420, 600);
        errorMsg.hide();
        }
    public void addDigitToDisplay(ActionEvent e){
        String charSizeInDisplay;
        
        charSizeInDisplay=passArea.getText();
        JButton a;
        a= (JButton) e.getSource();
        if(a.getText() == "CLEAR"){
            passArea.setText(passArea.getText().substring(0, passArea.getText().length()-1));
        }
        else if(a.getText() == "CANCEL"){
            panel1.dispose();
        }
        else if(a.getText() == "ENTER"){
            if(charSizeInDisplay.length()==4){
                panel1.dispose();
                AccountScreen acc1=new AccountScreen();
                acc1.launchFrame2();
            }
            else{
                errorMsg.setText("Sorry! Please enter the 4 letter password fully!");
                
                errorMsg.show();
            }
        }
        else{
        passArea.setText(passArea.getText()+a.getText());
        charSizeInDisplay=passArea.getText();
        if(charSizeInDisplay.length()>4){
            passArea.setText(passArea.getText().substring(0, 4));
        }
        }
        
        //passArea.setText;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        ATMDynamicKeypad atm=new ATMDynamicKeypad();
        atm.launchFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         
        
      addDigitToDisplay(e);
        
       
    }
}


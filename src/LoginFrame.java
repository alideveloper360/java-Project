/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ATA
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class LoginFrame extends JFrame implements ActionListener {
    boolean fc= false;
    private String username;
    private char[] Password;
    
    Container container=getContentPane();
    JLabel userLabel=new JLabel("USERNAME");
    JLabel passwordLabel=new JLabel("PASSWORD");
    JTextField userTextField=new JTextField();
    JPasswordField passwordField=new JPasswordField();
    JButton loginButton=new JButton("LOGIN");
    JButton resetButton=new JButton("CLEAR");
    JCheckBox showPassword=new JCheckBox("Show Password");
   
    public LoginFrame() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        addActionEvent();
        
    }
    
    
        public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        
        userLabel.setBounds(50,150,100,30);
       passwordLabel.setBounds(50,220,100,30);
       userTextField.setBounds(150,150,150,30);
       passwordField.setBounds(150,220,150,30);
       showPassword.setBounds(150,250,150,30);
       loginButton.setBounds(50,300,100,30);
       resetButton.setBounds(200,300,100,30);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    public void addComponentsToContainer() {
       container.add(userLabel);
       container.add(passwordLabel);
       container.add(userTextField);
       container.add(passwordField);
       container.add(showPassword);
       container.add(loginButton);
       container.add(resetButton);
    }
    public void addActionEvent() {
       loginButton.addActionListener(this);
       resetButton.addActionListener(this);
       showPassword.addActionListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        
    public void actionPerformed(ActionEvent e) {
        
          if (e.getSource() == loginButton) {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
           
           String tempu;
           String tempp;
           String path = "USERDATA.txt";
           try{
           Scanner x = new Scanner(new File(path));
           x.useDelimiter("[,\n]");
           while (x.hasNext()  && !fc)
           {
              tempu = x.next();
              tempp = x.next();
              
              if(tempu.trim().equals(userText.trim()) && tempp.trim().equals(pwdText.trim()) ){
                  fc = true;  
              }
           }
           pass();
          x.close();
          
           System.out.println(fc);
       }
        catch(FileNotFoundException ae){
            System.out.println("error");
        }
           
           
//           
           
 
        }
        //Coding Part of RESET button
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
       //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
 
 
        }
    
    }
    public void pass()
           {
                if(fc==false)
                {javax.swing.JOptionPane.showMessageDialog(this, "Invalid Username or Password");
                return;        
                }
                else{
                javax.swing.JOptionPane.showMessageDialog(this, "Login Successful");
                NewJFrame ok1=new NewJFrame();
                    ok1.setVisible(true);
                    this.dispose();
                    }
           }
      public static void main(String[] a) throws FileNotFoundException{
        //Creating object of LoginFrame class and setting some of its properties
        LoginFrame frame=new LoginFrame();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(10,10,370,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(null);
        frame.setResizable(false);
        String username = "bob69";
        String password = "1234";
        String path = "C:\\Users\\ATA\\Desktop\\USERDATA.txt";
 
        
    }
      
    
}


    
  
    



    

    // Variables declaration - do not modify                     
    // End of variables declaration                   


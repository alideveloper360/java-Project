
import com.sun.glass.events.KeyEvent;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammad Ali
 */
public class Income extends javax.swing.JFrame {
    int countp=0;
    /**
     * Creates new form Income
     */
    public Income() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        java.io.File filee = new java.io.File("File\\Expences.txt"); 
            
            BufferedReader brp; 
        try {
            brp = new BufferedReader(new FileReader(filee));
            String stt; 
            
            try {
                while ((stt = brp.readLine()) != null)
                {   countp++;
                    System.out.println(stt);
                }
            } catch (IOException ex) {
                Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(countp==0){
        countp++;
        }
        System.out.println(countp);
        
        
        FileReader file;
        int phy = 0;
        int current_amount;
        try {
            file = new FileReader("File\\TotalAmount.txt");
            BufferedReader bf= new BufferedReader(file);
            String st = bf.readLine();
            int sum=0;
            int count=0;
        while((st=bf.readLine())!=null){
          
            StringTokenizer stn = new StringTokenizer(st);
            phy=Integer.parseInt(stn.nextToken());
            label5.setText(st);
            sum=sum+phy;
            count++;
            System.out.printf("Total Amount=%d\n", sum);
            System.out.println("--------------------------------------------------------------------------");
            
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        select = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        inc_amount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        text2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Muhammad Ali(03077905764)");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Total Amount : ");

        label5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        select.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        select.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Electricity Bill", "Mobile bill", "Transport", "Adversiting", "Misc.Expense", "Refreshment", "Rep. and maintaince", "Rent office", "Postage", "stationary", "Imdad Mustaqeem", "Programs", "Salary", "others" }));
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("Select :");

        inc_amount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inc_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inc_amountActionPerformed(evt);
            }
        });
        inc_amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inc_amountKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("Enter Amount :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setText("Description : ");

        text2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text2ActionPerformed(evt);
            }
        });
        text2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text2KeyPressed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("View record");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("dummy");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\pic\\lnp.PNG")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 365, Short.MAX_VALUE)
                .addGap(22, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inc_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(inc_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1153, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectActionPerformed

    private void inc_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inc_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inc_amountActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.hide();
        NewJFrame nf1=new NewJFrame();
        nf1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        FileReader file;
        int phy = 0;
        int current_amount;
        try {
            file = new FileReader("File\\TotalAmount.txt");
            BufferedReader bf= new BufferedReader(file);
            String st = bf.readLine();
            int sum=0;
            int count=0;
        while((st=bf.readLine())!=null){
          
            StringTokenizer stn = new StringTokenizer(st);
            phy=Integer.parseInt(stn.nextToken());
            sum=sum+phy;
            count++;
            //System.out.printf("Total Amount=%d\n", sum);
            System.out.println("--------------------------------------------------------------------------");
            
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        /////////////////////////******************************** Field Data******************///////////////
        String gen_amount=(String)select.getSelectedItem();
        String gen_description=inc_amount.getText();
        String des_des=text2.getText();
////////////////////////////////////////////////////////////Writing data into file///////////////////////////////////
        String fileContent =" , "+gen_amount;
        String val2=" , "+gen_description;
        String val4=Integer.toString(countp);
        String val3=val4;
        String val5=" , "+des_des;
        current_amount=Integer.parseInt(gen_description);
        phy=phy-current_amount;
        System.out.println("Hello amount : "+phy);
        String str1 = Integer.toString(phy);
        String str2="Total_Amount";
        
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter("File\\Expences.txt",true));
                            ////////////////amount write///////////////////////
            
            writer.newLine();
            writer.write(val3);
            writer.write(val2);
            
            writer.write(val5);
            writer.write(fileContent);
            //writer.newLine();
            //System.out.println(val3+val2+val5+fileContent);
            //writer.newLine();
            writer.close();
            
            BufferedWriter wr;
            wr = new BufferedWriter(new FileWriter("File\\TotalAmount.txt"));
            wr.write(str2);
            wr.newLine();
            wr.write(str1);
            wr.close();
            javax.swing.JOptionPane.showMessageDialog(rootPane,"Sucessfully enter");
            countp++;
            inc_amount.setText("");
            text2.setText("");
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
            javax.swing.JOptionPane.showMessageDialog(rootPane,"Error");
        }
        
                    ///////////////////************subtraction**********////////////////
        
        


        //////////////////////*********SET new amount**********/////////////
        
                                             
        
        
        
        FileReader file1;
        int phy1 = 0;
        //int current_amount;
        try {
            file1 = new FileReader("File\\TotalAmount.txt");
            BufferedReader bf= new BufferedReader(file1);
            String st = bf.readLine();
            int sum=0;
            int count=0;
        while((st=bf.readLine())!=null){
          
            StringTokenizer stn = new StringTokenizer(st);
            phy=Integer.parseInt(stn.nextToken());
            label5.setText(st);
            sum=sum+phy1;
            count++;
            System.out.printf("Total Amount=%d\n", sum);
            System.out.println("--------------------------------------------------------------------------");
            
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        FileReader file2;
        int phy2 = 0;
        //int current_amount;
        try {
            file2 = new FileReader("File\\TotalAmount.txt");
            BufferedReader bf= new BufferedReader(file2);
            String st = bf.readLine();
            int sum=0;
            int count=0;
        while((st=bf.readLine())!=null){
          
            StringTokenizer stn = new StringTokenizer(st);
            phy=Integer.parseInt(stn.nextToken());
            sum=sum+phy1;
            count++;
            System.out.printf("Total Amount=%d\n", sum);
            System.out.println("--------------------------------------------------------------------------");
            if(phy<0){
                javax.swing.JOptionPane.showMessageDialog(rootPane,"Total Amount is Less than zero");
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        table3 up=new table3();
        up.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        update3 up=new update3();
        up.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text2ActionPerformed

    private void inc_amountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inc_amountKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        text2.requestFocus();
        }
    }//GEN-LAST:event_inc_amountKeyPressed

    private void text2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text2KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        FileReader file;
        int phy = 0;
        int current_amount;
        try {
            file = new FileReader("File\\TotalAmount.txt");
            BufferedReader bf= new BufferedReader(file);
            String st = bf.readLine();
            int sum=0;
            int count=0;
        while((st=bf.readLine())!=null){
          
            StringTokenizer stn = new StringTokenizer(st);
            phy=Integer.parseInt(stn.nextToken());
            sum=sum+phy;
            count++;
            //System.out.printf("Total Amount=%d\n", sum);
            System.out.println("--------------------------------------------------------------------------");
            
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        /////////////////////////******************************** Field Data******************///////////////
        String gen_amount=(String)select.getSelectedItem();
        String gen_description=inc_amount.getText();
        String des_des=text2.getText();
////////////////////////////////////////////////////////////Writing data into file///////////////////////////////////
        String fileContent =" , "+gen_amount;
        String val2=" , "+gen_description;
        String val4=Integer.toString(countp);
        String val3=val4;
        String val5=" , "+des_des;
        current_amount=Integer.parseInt(gen_description);
        phy=phy-current_amount;
        System.out.println("Hello amount : "+phy);
        String str1 = Integer.toString(phy);
        String str2="Total_Amount";
        
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter("File\\Expences.txt",true));
                            ////////////////amount write///////////////////////
            writer.newLine();
            writer.write(val3);
            writer.write(val2);
            
            writer.write(val5);
            writer.write(fileContent);
            //writer.newLine();
            
            //writer.newLine();
            writer.close();
            
            BufferedWriter wr;
            wr = new BufferedWriter(new FileWriter("File\\TotalAmount.txt"));
            wr.write(str2);
            wr.newLine();
            wr.write(str1);
            wr.close();
            javax.swing.JOptionPane.showMessageDialog(rootPane,"Sucessfully enter");
            countp++;
            inc_amount.setText("");
            text2.setText("");
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
            javax.swing.JOptionPane.showMessageDialog(rootPane,"Error");
        }
        
                    ///////////////////************subtraction**********////////////////
        
        


        //////////////////////*********SET new amount**********/////////////
        
                                             
        
        
        
        FileReader file1;
        int phy1 = 0;
        //int current_amount;
        try {
            file1 = new FileReader("File\\TotalAmount.txt");
            BufferedReader bf= new BufferedReader(file1);
            String st = bf.readLine();
            int sum=0;
            int count=0;
        while((st=bf.readLine())!=null){
          
            StringTokenizer stn = new StringTokenizer(st);
            phy=Integer.parseInt(stn.nextToken());
            label5.setText(st);
            sum=sum+phy1;
            count++;
            System.out.printf("Total Amount=%d\n", sum);
            System.out.println("--------------------------------------------------------------------------");
            
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        FileReader file2;
        int phy2 = 0;
        //int current_amount;
        try {
            file2 = new FileReader("File\\TotalAmount.txt");
            BufferedReader bf= new BufferedReader(file2);
            String st = bf.readLine();
            int sum=0;
            int count=0;
        while((st=bf.readLine())!=null){
          
            StringTokenizer stn = new StringTokenizer(st);
            phy=Integer.parseInt(stn.nextToken());
            sum=sum+phy1;
            count++;
            System.out.printf("Total Amount=%d\n", sum);
            System.out.println("--------------------------------------------------------------------------");
            if(phy<0){
                javax.swing.JOptionPane.showMessageDialog(rootPane,"Total Amount is Less than zero");
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_text2KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Income().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inc_amount;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label5;
    private javax.swing.JComboBox select;
    private javax.swing.JTextField text2;
    // End of variables declaration//GEN-END:variables
}

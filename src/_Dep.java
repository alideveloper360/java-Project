/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



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
import javax.swing.JFrame;

/**
 *
 * @author Muhammad Ali
 */
public class _Dep extends javax.swing.JFrame {
    int countp=0;
    /**
     * Creates new form _Dep
     */
    public _Dep() {
        initComponents();
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        java.io.File filee = new java.io.File("File\\O_income.txt"); 
            
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
        if(countp==0)
        {
        countp++;
        }
        System.out.println(countp);
        
        
        
        ////////////////////////////////////////////////////////////////////////////////////
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        damount = new javax.swing.JTextField();
        ddes = new javax.swing.JTextField();
        label5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setPreferredSize(new java.awt.Dimension(1153, 662));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Total Amount : ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Enter G. dep. Amount : ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("Description :");

        damount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        damount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                damountKeyPressed(evt);
            }
        });

        ddes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ddes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ddesKeyPressed(evt);
            }
        });

        label5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("dummy");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("View Record");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\pic\\lnp.PNG")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ddes, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(174, 174, 174)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(damount, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(205, 205, 205))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4)
                                .addGap(225, 225, 225))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel4))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(damount, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(ddes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(191, 191, 191))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1253, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
        NewJFrame1 nf2=new NewJFrame1();
        nf2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        ////////////////////////*************Get Amount From file************////////////////
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
            System.out.printf("Total Amount=%d\n", sum);
            System.out.println("--------------------------------------------------------------------------");
            
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ////////////////////////////////***************Write data into file*****************///////////
        
        String Dep_amount=damount.getText();
        String Dep_des=ddes.getText();
        String fileContent =" , "+Dep_amount;
        String val2=" , "+Dep_des;
        String val3=Integer.toString(countp);
        System.out.println(Dep_des+fileContent+val2);
        current_amount=Integer.parseInt(Dep_amount);
        current_amount=current_amount+phy;
        //System.out.println("Hello amount : "+current_amount);
        String str1 = Integer.toString(current_amount);
        String str2="Total_Amount";
    BufferedWriter writer;
    //c9713
        try {
            writer = new BufferedWriter(new FileWriter("File\\O_income.txt",true));
                            ////////////////amount write///////////////////////
            writer.newLine();
            writer.write(val3);
            writer.write(fileContent);
            
                            ////////////////Description write//////////
            writer.write(val2);
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
            damount.setText("");
            ddes.setText("");
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
            javax.swing.JOptionPane.showMessageDialog(rootPane,"Error");
        }
        
        ///////////////////////////***************Set value in file****************///////////
        
        
        




        //////////////////////*********SET new amount**********/////////////
        
       
        
        
        
          FileReader file1;
        int phy1 = 0;
        //int current_amount1;
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        update2 ok2=new update2();
        ok2.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        table2 t2=new table2();
        t2.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ddesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ddesKeyPressed
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
            System.out.printf("Total Amount=%d\n", sum);
            System.out.println("--------------------------------------------------------------------------");
            
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ////////////////////////////////***************Write data into file*****************///////////
        
        String Dep_amount=damount.getText();
        String Dep_des=ddes.getText();
        String fileContent =" , "+Dep_amount;
        String val2=" , "+Dep_des;
        String val3=Integer.toString(countp);
        System.out.println(Dep_des+fileContent+val2);
        current_amount=Integer.parseInt(Dep_amount);
        current_amount=current_amount+phy;
        //System.out.println("Hello amount : "+current_amount);
        String str1 = Integer.toString(current_amount);
        String str2="Total_Amount";
    BufferedWriter writer;
    //c9713
        try {
            writer = new BufferedWriter(new FileWriter("File\\O_income.txt",true));
                            ////////////////amount write///////////////////////
            writer.newLine();
            writer.write(val3);
            writer.write(fileContent);
            
                            ////////////////Description write//////////
            writer.write(val2);
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
            damount.setText("");
            ddes.setText("");
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
            javax.swing.JOptionPane.showMessageDialog(rootPane,"Error");
        }
        
        ///////////////////////////***************Set value in file****************///////////
        
        
        




        //////////////////////*********SET new amount**********/////////////
        
       
        
        
        
          FileReader file1;
        int phy1 = 0;
        //int current_amount1;
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
          }
    }//GEN-LAST:event_ddesKeyPressed

    private void damountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_damountKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            ddes.requestFocus();
        }
    }//GEN-LAST:event_damountKeyPressed

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
            java.util.logging.Logger.getLogger(_Dep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_Dep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_Dep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_Dep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new _Dep().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField damount;
    private javax.swing.JTextField ddes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label5;
    // End of variables declaration//GEN-END:variables
}

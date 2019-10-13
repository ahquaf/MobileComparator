/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilecomparator;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.ImageIcon;

/**
 *
 * @author mohnish
 */
public class Compare extends javax.swing.JFrame {

    /**
     * Creates new form Compare
     */
    String mobName1;
    String mobRam1;
    String mobStorage1;
    String mobName2;
    String mobRam2;
    String mobStorage2;
    
    public Compare(String name1, String ram1, String storage1, String name2, String ram2, String storage2) {
      
        initComponents();
        mobName1 = name1;
        mobRam1 = ram1;
        mobStorage1 = storage1;
        mobName2 = name2;
        mobRam2 = ram2;
        mobStorage2 = storage2;
        //System.out.println(mobName1+mobName2+mobRam1+mobRam2+mobStorage1+mobStorage2);
        Display();
    }
    
    public void Display(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/project","root","ahquaf");  
            PreparedStatement stmt=con.prepareStatement(
                    "SELECT images,mobile_info.mobile_name,os,processor,battery,prim_cam,sec_cam,screen_type,RAM,storage,Price FROM mobile_info,image_table where mobile_info.mobile_name = image_table.mobile_name and mobile_info.mobile_name = ? and RAM = ? and storage = ?");
            stmt.setString(1, mobName1);
            stmt.setString(2, mobRam1);
            stmt.setString(3, mobStorage1);
      
            ResultSet rs = stmt.executeQuery();
                     
            if(rs.next()) { 
                
                byte[] img = rs.getBytes("images");
                ImageIcon icon = new ImageIcon(img);
                Image im = icon.getImage();
                Image myImg = im.getScaledInstance(pic1.getWidth(), pic1.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImg = new ImageIcon(myImg);
                pic1.setIcon(newImg);
                String mob_name1 = rs.getString("mobile_name");
                mobilename1.setText(mob_name1);
                String pro1 = rs.getString("processor");
                Processor1.setText(pro1);
                String screen1 = rs.getString("screen_type");
                Screen1.setText(screen1);
                String os_1 = rs.getString("os");
                os1.setText(os_1);
                String sc_1 = rs.getString("sec_cam");
                secondaryc1.setText(sc_1);
                String pc_1 = rs.getString("prim_cam");
                primaryc1.setText(pc_1);
                String bat = rs.getString("battery");
                battery1.setText(bat);
                String panel_1 = rs.getString("RAM");
                panel1.setText(panel_1);
                String storage_1 = rs.getString("storage");
                jLabel24.setText(storage_1);
                String price = String.valueOf(rs.getInt("Price"));
                jLabel10.setText(price);
            
            } //mobile1
            
            stmt=con.prepareStatement("SELECT images,mobile_info.mobile_name,os,processor,battery,prim_cam,sec_cam,screen_type,RAM,storage,Price FROM mobile_info,image_table where mobile_info.mobile_name = image_table.mobile_name and mobile_info.mobile_name = ? and RAM = ? and storage = ?");     
            stmt.setString(1, mobName2);
            stmt.setString(2, mobRam2);
            stmt.setString(3, mobStorage2);
            
            rs = stmt.executeQuery();
            
            if(rs.next()) { 
                byte[] img = rs.getBytes("images");
                ImageIcon icon = new ImageIcon(img);
                Image im = icon.getImage();
                Image myImg = im.getScaledInstance(pic2.getWidth(), pic2.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImg = new ImageIcon(myImg);
                pic2.setIcon(newImg);
                String mob_name2 = rs.getString("mobile_name");
                mobilename2.setText(mob_name2);
                String pro2 = rs.getString("processor");
                processor2.setText(pro2);
                String screen_2 = rs.getString("screen_type");
                screen2.setText(screen_2);
                String os_2 = rs.getString("os");
                os2.setText(os_2);
                String sc_2 = rs.getString("sec_cam");
                secondaryc2.setText(sc_2);
                String pc_2 = rs.getString("prim_cam");
                primaryc2.setText(pc_2);
                String bat2 = rs.getString("battery");
                battery2.setText(bat2);
                String panel_2 = rs.getString("RAM");
                panel2.setText(panel_2); 
                String storage_2 = rs.getString("storage");
                jLabel26.setText(storage_2);
                String price = String.valueOf(rs.getInt("Price"));
                jLabel23.setText(price);
            } //mobile2
        }
        catch(Exception e)
        {
            System.out.println(e);
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

        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pic1 = new javax.swing.JLabel();
        pic2 = new javax.swing.JLabel();
        mobilename1 = new javax.swing.JLabel();
        Processor1 = new javax.swing.JLabel();
        Screen1 = new javax.swing.JLabel();
        os1 = new javax.swing.JLabel();
        primaryc1 = new javax.swing.JLabel();
        secondaryc1 = new javax.swing.JLabel();
        battery1 = new javax.swing.JLabel();
        mobilename2 = new javax.swing.JLabel();
        processor2 = new javax.swing.JLabel();
        screen2 = new javax.swing.JLabel();
        os2 = new javax.swing.JLabel();
        primaryc2 = new javax.swing.JLabel();
        secondaryc2 = new javax.swing.JLabel();
        battery2 = new javax.swing.JLabel();
        panel1 = new javax.swing.JLabel();
        panel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("jLabel14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setMaximumSize(new java.awt.Dimension(50000, 50000));
        jPanel1.setLayout(null);

        pic1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(pic1);
        pic1.setBounds(180, 70, 120, 160);

        pic2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(pic2);
        pic2.setBounds(550, 70, 120, 160);

        mobilename1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(mobilename1);
        mobilename1.setBounds(180, 260, 200, 20);

        Processor1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(Processor1);
        Processor1.setBounds(180, 290, 200, 20);

        Screen1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(Screen1);
        Screen1.setBounds(180, 320, 200, 20);

        os1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(os1);
        os1.setBounds(180, 350, 200, 20);

        primaryc1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(primaryc1);
        primaryc1.setBounds(180, 380, 200, 20);

        secondaryc1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(secondaryc1);
        secondaryc1.setBounds(180, 410, 200, 20);

        battery1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(battery1);
        battery1.setBounds(180, 440, 200, 20);

        mobilename2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(mobilename2);
        mobilename2.setBounds(550, 260, 200, 20);

        processor2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(processor2);
        processor2.setBounds(550, 290, 200, 20);

        screen2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(screen2);
        screen2.setBounds(550, 320, 200, 20);

        os2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(os2);
        os2.setBounds(550, 350, 200, 20);

        primaryc2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(primaryc2);
        primaryc2.setBounds(550, 380, 200, 20);

        secondaryc2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(secondaryc2);
        secondaryc2.setBounds(550, 410, 200, 20);

        battery2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(battery2);
        battery2.setBounds(550, 440, 200, 20);

        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(panel1);
        panel1.setBounds(180, 470, 200, 20);

        panel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(panel2);
        panel2.setBounds(550, 470, 200, 20);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(400, 620, 90, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Mobilename");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 260, 110, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Processor");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 290, 120, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Screen");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 320, 100, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("OS");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 350, 100, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Primary Camera");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 380, 120, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Secondary Camera ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 410, 130, 20);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Battery");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 440, 130, 20);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("RAM");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 470, 130, 20);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Price");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 530, 110, 20);

        jLabel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(180, 530, 200, 20);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Mobilename");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(420, 260, 110, 20);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Processor");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(420, 290, 110, 20);

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("X");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jLabel13);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(780, 0, 50, 40);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Price");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(420, 530, 110, 20);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("RAM");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(420, 470, 110, 20);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Screen");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(420, 320, 110, 20);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("OS");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(420, 350, 100, 20);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Primary Camera");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(420, 380, 120, 20);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Secondary Camera");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(420, 410, 120, 20);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Battery");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(420, 440, 110, 20);

        jLabel23.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel23);
        jLabel23.setBounds(550, 530, 200, 20);

        jButton2.setText("Purchase");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(220, 580, 100, 30);

        jButton3.setText("Purchase");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(590, 580, 100, 30);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Storage");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(40, 500, 130, 20);

        jLabel24.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel24);
        jLabel24.setBounds(180, 500, 200, 20);

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("Storage");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(420, 500, 110, 20);

        jLabel26.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel26);
        jLabel26.setBounds(550, 500, 200, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 930, 670);

        setBounds(0, 0, 825, 671);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new searchPhone().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        int ty = 2;
        new ship(mobName1,mobRam1,mobStorage1,mobName2,mobRam2,mobStorage2,ty).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        int ty = 1;
        new ship(mobName1,mobRam1,mobStorage1,mobName2,mobRam2,mobStorage2, ty).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Compare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       // ResultSet rs;
        //rs = null;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compare("","","","","","").setVisible(true);
            }
            
        });
    }  
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Processor1;
    private javax.swing.JLabel Screen1;
    private javax.swing.JLabel battery1;
    private javax.swing.JLabel battery2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel mobilename1;
    private javax.swing.JLabel mobilename2;
    private javax.swing.JLabel os1;
    private javax.swing.JLabel os2;
    private javax.swing.JLabel panel1;
    private javax.swing.JLabel panel2;
    private javax.swing.JLabel pic1;
    private javax.swing.JLabel pic2;
    private javax.swing.JLabel primaryc1;
    private javax.swing.JLabel primaryc2;
    private javax.swing.JLabel processor2;
    private javax.swing.JLabel screen2;
    private javax.swing.JLabel secondaryc1;
    private javax.swing.JLabel secondaryc2;
    // End of variables declaration//GEN-END:variables
}

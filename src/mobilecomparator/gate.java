/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilecomparator;

import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author mohnish
 */
public class gate extends javax.swing.JFrame {

    /**
     * Creates new form gate
     */
    
    String mobName1;
    String mobRam1;
    String mobStorage1;
    String mobName2;
    String mobRam2;
    String mobStorage2;
    int tty;
    String[] bill_n;
    
    public gate(String mobile1, String ram1, String storage1, String mobile2, String ram2, String storage2,int t,String[] bill) {
        initComponents();
        jPanel3.setBounds(40,70,460,0);
        //to (40,70,460,150)
        jPanel5.setBounds(40,280,460,0);
        //to (40,70,460,90)
        
        mobName1 = mobile1;
        mobRam1 = ram1;
        mobStorage1 = storage1;
        mobName2 = mobile2;
        mobRam2 = ram2;
        mobStorage2 = storage2;
        tty = t;
        bill_n = bill;
        
        if(t == 1)
            displayMob_1();
        else
            displayMob_2();
    }
    
    public void displayMob_1(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","ahquaf");
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
                Image myImg = im.getScaledInstance(mob_pic.getWidth(), mob_pic.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImg = new ImageIcon(myImg);
                mob_pic.setIcon(newImg);
                String mob_name1 = rs.getString("mobile_name");
                mob_name.setText(mob_name1);
                String pro1 = rs.getString("processor");
                mob_pro.setText(pro1);
                String screen1 = rs.getString("screen_type");
                mob_screen.setText(screen1);
                String os_1 = rs.getString("os");
                mob_os.setText(os_1);
                String sc_1 = rs.getString("sec_cam");
                mob_sc.setText(sc_1);
                String pc_1 = rs.getString("prim_cam");
                mob_pc.setText(pc_1);
                String bat = rs.getString("battery");
                mob_battery.setText(bat);
                String panel_1 = rs.getString("RAM");
                mob_panel.setText(panel_1);
                String storage_1 = rs.getString("storage");
                jLabel7.setText(storage_1);
                String price = String.valueOf(rs.getInt("Price"));
                jLabel8.setText(price);
            }
            
            con.close();
        }catch(Exception e){
            
            System.out.println(e);
        }
    }
    
    public void displayMob_2(){
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","ahquaf");
            PreparedStatement stmt=con.prepareStatement(
                    "SELECT images,mobile_info.mobile_name,os,processor,battery,prim_cam,sec_cam,screen_type,RAM,storage,Price FROM mobile_info,image_table where mobile_info.mobile_name = image_table.mobile_name and mobile_info.RAM = image_table.RAM and mobile_info.storage = image_table.storage and mobile_info.mobile_name = ? and mobile_info.RAM = ? and mobile_info.storage = ?");
            stmt.setString(1, mobName2);
            stmt.setString(2, mobRam2);
            stmt.setString(3, mobStorage2);
      
            ResultSet rs = stmt.executeQuery();
                     
            if(rs.next()) { 
                
                byte[] img = rs.getBytes("images");
                ImageIcon icon = new ImageIcon(img);
                Image im = icon.getImage();
                Image myImg = im.getScaledInstance(mob_pic.getWidth(), mob_pic.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImg = new ImageIcon(myImg);
                mob_pic.setIcon(newImg);
                String mob_name1 = rs.getString("mobile_name");
                mob_name.setText(mob_name1);
                String pro1 = rs.getString("processor");
                mob_pro.setText(pro1);
                String screen1 = rs.getString("screen_type");
                mob_screen.setText(screen1);
                String os_1 = rs.getString("os");
                mob_os.setText(os_1);
                String sc_1 = rs.getString("sec_cam");
                mob_sc.setText(sc_1);
                String pc_1 = rs.getString("prim_cam");
                mob_pc.setText(pc_1);
                String bat = rs.getString("battery");
                mob_battery.setText(bat);
                String panel_1 = rs.getString("RAM");
                mob_panel.setText(panel_1);
                String storage_1 = rs.getString("storage");
                jLabel7.setText(storage_1);
                String price = String.valueOf(rs.getInt("Price"));
                jLabel8.setText(price);
            }
            
            con.close();
        }catch(Exception e){
            
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        card_no = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        button1 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        button2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        mob_pic = new javax.swing.JLabel();
        mob_name = new javax.swing.JLabel();
        mob_pro = new javax.swing.JLabel();
        mob_screen = new javax.swing.JLabel();
        mob_os = new javax.swing.JLabel();
        mob_pc = new javax.swing.JLabel();
        mob_sc = new javax.swing.JLabel();
        mob_battery = new javax.swing.JLabel();
        mob_panel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setText("NAME :");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        card_no.setText("CARD NUMBER :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(card_no, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card_no))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(40, 70, 460, 150);

        button1.setBackground(new java.awt.Color(102, 102, 102));
        button1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                button1MouseMoved(evt);
            }
        });
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1);
        button1.setBounds(40, 40, 21, 21);

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(470, 0, 50, 50);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("DEBIT CARD/CREDIT CARD");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 40, 160, 20);

        jLabel6.setText(" UPI ID:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)))
                .addGap(31, 31, 31)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(40, 280, 460, 90);

        button2.setBackground(new java.awt.Color(102, 102, 102));
        button2.setText("jRadioButton2");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel1.add(button2);
        button2.setBounds(40, 250, 20, 20);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("GPAY / PHONE PE");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 250, 160, 20);

        jButton1.setText("BUY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(200, 443, 160, 50);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(330, 0, 580, 620);

        mob_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(mob_pic);
        mob_pic.setBounds(70, 50, 130, 160);

        mob_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(mob_name);
        mob_name.setBounds(70, 230, 160, 20);

        mob_pro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(mob_pro);
        mob_pro.setBounds(70, 270, 160, 20);

        mob_screen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(mob_screen);
        mob_screen.setBounds(70, 310, 160, 20);

        mob_os.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(mob_os);
        mob_os.setBounds(70, 350, 160, 20);

        mob_pc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(mob_pc);
        mob_pc.setBounds(70, 390, 160, 20);

        mob_sc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(mob_sc);
        mob_sc.setBounds(70, 430, 160, 20);

        mob_battery.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(mob_battery);
        mob_battery.setBounds(70, 470, 160, 20);

        mob_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(mob_panel);
        mob_panel.setBounds(70, 510, 160, 20);

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel7);
        jLabel7.setBounds(70, 550, 160, 20);

        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel8);
        jLabel8.setBounds(70, 590, 160, 20);

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(10, 10, 80, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 850, 620);

        setSize(new java.awt.Dimension(852, 623));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
       button2.setSelected(false);
        jPanel5.setBounds(40,280,460,0);
        Thread th = new Thread(){
            public void run(){
                try{
                    for(int x=0;x<=150;x++)
                    {
                        Thread.sleep(0);
                       jPanel3.setBounds(40,70,460,x); 
                    }
                    
                }
                catch(Exception e)
                {
                    System.out.print(e);
                }
            }
        
    };th.start();
    
        
        
    }//GEN-LAST:event_button1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void button1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_button1MouseMoved

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
          
        button1.setSelected(false);
         jPanel3.setBounds(40,70,460,0);
        Thread th1 = new Thread(){
            public void run(){
                try{
                    for(int x=0;x<=90;x++)
                    {
                        Thread.sleep(0);
                       jPanel5.setBounds(40,280,460,x); 
                    }
                    
                }
                catch(Exception e)
                {
                    System.out.print(e);
                }
            }
        
    };th1.start();
    
        
    }//GEN-LAST:event_button2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Compare(mobName1, mobRam1, mobStorage1, mobName2, mobRam2, mobStorage2).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(tty == 1){
            
            try{
                
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","ahquaf");
                PreparedStatement stmt = con.prepareStatement("insert into billing(Name,Phone,Address,Landmark,City,State)values(?, ?, ?, ?, ?, ?)");
                stmt.setString(1, bill_n[0]);
                stmt.setString(2, bill_n[1]);
                stmt.setString(3, bill_n[2]);
                stmt.setString(4, bill_n[3]);
                stmt.setString(5, bill_n[4]);
                stmt.setString(6, bill_n[5]);
                
                stmt.executeUpdate();
                con.close();
                
                this.setVisible(false);
                new TransactionReceipt(mobName1,mobRam1,mobStorage1).setVisible(true);
                
            }catch(Exception e){
                System.out.println(e);
            }
            
        }else{
            
            try{
                
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","ahquaf");
                PreparedStatement stmt = con.prepareStatement("insert into billing(Name,Phone,Address,Landmark,City,State,mobile_name,RAM,storage)values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
                stmt.setString(1, bill_n[0]);
                stmt.setString(2, bill_n[1]);
                stmt.setString(3, bill_n[2]);
                stmt.setString(4, bill_n[3]);
                stmt.setString(5, bill_n[4]);
                stmt.setString(6, bill_n[5]);
                
                if(tty == 1){
                    stmt.setString(7, mobName1);
                    stmt.setString(8, mobRam1);
                    stmt.setString(9, mobStorage1);
                }
                else{
                    stmt.setString(7, mobName2);
                    stmt.setString(8, mobRam2);
                    stmt.setString(9, mobStorage2);
                }
                
                stmt.executeUpdate();
                con.close();
                
                this.setVisible(false);
                new TransactionReceipt(mobName2,mobRam2,mobStorage2).setVisible(true);
            }catch(Exception e){
                System.out.println(e);
            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(gate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gate("","","","","","", 1).setVisible(true);
            }
        });*/
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton button1;
    private javax.swing.JRadioButton button2;
    private javax.swing.JLabel card_no;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel mob_battery;
    private javax.swing.JLabel mob_name;
    private javax.swing.JLabel mob_os;
    private javax.swing.JLabel mob_panel;
    private javax.swing.JLabel mob_pc;
    private javax.swing.JLabel mob_pic;
    private javax.swing.JLabel mob_pro;
    private javax.swing.JLabel mob_sc;
    private javax.swing.JLabel mob_screen;
    // End of variables declaration//GEN-END:variables
}

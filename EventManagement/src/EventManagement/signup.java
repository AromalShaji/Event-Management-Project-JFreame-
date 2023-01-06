/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package EventManagement;
import java.awt.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    public signup() {
        initComponents();
        jPanel1.setBackground(new Color(0,0,0,80));
        jPanel2.setBackground(new Color(0,0,0,100));
        jPanel3.setBackground(new Color(0,0,0,100));
        jPanel6.setBackground(new Color(0,0,0,80));
        this.setSize(1400, 760);
    }
    
    public static int okcancel(String theMessage){
        int result=JOptionPane.showConfirmDialog((Component)null,theMessage,"alert",JOptionPane.OK_CANCEL_OPTION);
        return result;
    }
    
    public static Connection myConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl="jdbc:mysql://localhost:3306/login?"+"user=root&password=root";
            con = DriverManager.getConnection(connectionUrl);
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name_entry = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        submit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        pass_entry = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        event_details1 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        event_details = new javax.swing.JLabel();
        logout_btn = new javax.swing.JLabel();
        org_details = new javax.swing.JLabel();
        sales_details = new javax.swing.JLabel();
        addorg = new javax.swing.JLabel();
        dltorg = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("EVENT MANAGEMENT SYSTEM");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 102));
        jLabel1.setText("ADD NEW ORGANISER");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAME :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD :");

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submit.setBackground(new java.awt.Color(204, 204, 204));
        submit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submit.setText("SUBMIT");
        submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel3.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        reset.setBackground(new java.awt.Color(204, 204, 204));
        reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reset.setText("RESET");
        reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel3.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 82, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EVENT TYPE :");

        event_details1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        event_details1.setMaximumRowCount(2);
        event_details1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MARRIAGE", "BIRTHDAY" }));
        event_details1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                event_details1MouseClicked(evt);
            }
        });
        event_details1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                event_details1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1140, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(381, 381, 381)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(name_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pass_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(event_details1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_entry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass_entry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(event_details1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(46, 46, 46)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 1140, 480));

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        event_details.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        event_details.setForeground(new java.awt.Color(255, 255, 255));
        event_details.setText("BOOKING DETAILS");
        event_details.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        event_details.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        event_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                event_detailsMouseClicked(evt);
            }
        });
        jPanel6.add(event_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 171, 156, -1));

        logout_btn.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        logout_btn.setForeground(new java.awt.Color(255, 255, 255));
        logout_btn.setText("LOGOUT");
        logout_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), null, new java.awt.Color(255, 255, 255)));
        logout_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_btnMouseClicked(evt);
            }
        });
        jPanel6.add(logout_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        org_details.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        org_details.setForeground(new java.awt.Color(255, 255, 255));
        org_details.setText("ORGANISER DETAILS");
        org_details.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        org_details.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        org_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                org_detailsMouseClicked(evt);
            }
        });
        jPanel6.add(org_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 233, -1, -1));

        sales_details.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        sales_details.setForeground(new java.awt.Color(255, 255, 255));
        sales_details.setText("SALES DETAILS");
        sales_details.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        sales_details.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sales_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sales_detailsMouseClicked(evt);
            }
        });
        jPanel6.add(sales_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 299, 156, -1));

        addorg.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        addorg.setForeground(new java.awt.Color(255, 255, 255));
        addorg.setText("ADD ORGANISER");
        addorg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addorg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addorgMouseClicked(evt);
            }
        });
        jPanel6.add(addorg, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 358, 156, -1));

        dltorg.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        dltorg.setForeground(new java.awt.Color(255, 255, 255));
        dltorg.setText("DELETE ORGANISER");
        dltorg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        dltorg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dltorg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dltorgMouseClicked(evt);
            }
        });
        jPanel6.add(dltorg, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 417, 156, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EventManagement/icons8-admin-64.png"))); // NOI18N
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jPanel5.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 240, 50));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EventManagement/icons8-join-80.png"))); // NOI18N
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EventManagement/pexels-polina-kovaleva-5430720.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1410, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1426, 837));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    String uname="",evalue;
    
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

        Connection con = myConnection();
        try{
            String name=name_entry.getText();
            String pass=pass_entry.getText();
            String event_value = event_details1.getSelectedItem().toString();
            PreparedStatement prest,prest2;
            if((name.equals(""))||(pass.equals(""))){
                okcancel("INVALID!");
                con.close();
                new signup().setVisible(true);
                dispose();
            }
            else{
                String sql1 ="SELECT username FROM user_login WHERE username='"+name+"'";
                prest2 = con.prepareStatement(sql1);
                ResultSet rs = prest2.executeQuery(sql1);
                while(rs.next()){
                    uname=rs.getString("username");
                }
                if((uname.equals(name))){
                    okcancel("USER NAME ALREADY EXIST!");
                    con.close();
                    new signup().setVisible(true);
                    dispose();
                }
                else{
                    String sql ="INSERT INTO user_login(username,password,event_details)VALUES('"+name+"','"+pass+"','"+event_value+"');";
                    prest= con.prepareStatement(sql);
                    int count = prest.executeUpdate();
                    if(count>0){
                        int i = okcancel("Account Created");
                        System.out.println("ret:"+i);
                        name_entry.setText("");
                        pass_entry.setText("");
                        con.close();
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        }
        //event details              
        // && (evalue.equals(event_value))
        // TODO add your handling code here:
    }//GEN-LAST:event_submitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed

        // TODO add your handling code here:
        name_entry.setText("");
        pass_entry.setText("");

    }//GEN-LAST:event_resetActionPerformed

    private void event_details1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_event_details1MouseClicked
        // TODO add your handling code here:
//        String value = 
        
    }//GEN-LAST:event_event_details1MouseClicked

    private void event_details1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_event_details1ActionPerformed
        // TODO add your handling code here:
        String event_value = event_details1.getSelectedItem().toString();
        
    }//GEN-LAST:event_event_details1ActionPerformed

    private void event_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_event_detailsMouseClicked
        // TODO add your handling code here:
        dispose();
        event_details e = new event_details();
        e.show();
    }//GEN-LAST:event_event_detailsMouseClicked

    private void logout_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_btnMouseClicked
        // TODO add your handling code here:
        dispose();
        login l=new login();
        l.show();
    }//GEN-LAST:event_logout_btnMouseClicked

    private void org_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_org_detailsMouseClicked
        // TODO add your handling code here:
        dispose();
        admin a= new admin();
        a.show();
    }//GEN-LAST:event_org_detailsMouseClicked

    private void sales_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sales_detailsMouseClicked
        // TODO add your handling code here:
        dispose();
        new sales_details().setVisible(true);
    }//GEN-LAST:event_sales_detailsMouseClicked

    private void addorgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addorgMouseClicked
        // TODO add your handling code here:
        dispose();
        signup s = new signup();
        s.show();
    }//GEN-LAST:event_addorgMouseClicked

    private void dltorgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dltorgMouseClicked
        // TODO add your handling code here:
        dispose();
        org_dlt d = new org_dlt();
        d.show();
    }//GEN-LAST:event_dltorgMouseClicked

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addorg;
    private javax.swing.JLabel dltorg;
    private javax.swing.JLabel event_details;
    private javax.swing.JComboBox<String> event_details1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel logout_btn;
    private javax.swing.JTextField name_entry;
    private javax.swing.JLabel org_details;
    private javax.swing.JTextField pass_entry;
    private javax.swing.JButton reset;
    private javax.swing.JLabel sales_details;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
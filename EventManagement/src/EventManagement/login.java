/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package EventManagement;
import java.awt.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author DELL
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    
    public login() {
        initComponents();
        jPanel1.setBackground(new Color(0,0,0,140));
//        Toolkit tk = Toolkit.getDefaultToolkit();
//        int xsize=(int)tk.getScreenSize().getWidth();
//        int ysize=(int)tk.getScreenSize().getHeight();
//        Insets scnMax = Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
//        int taskBarSize = scnMax.bottom;
        this.setSize(1400, 760);
        
    }

    public static Connection myConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl="jdbc:mysql://localhost:3306/login?"+"user=root&password=root";
            con = DriverManager.getConnection(connectionUrl);
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel5 = new javax.swing.JLabel();
        back_btn = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        name_entry = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pass_entry = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1150, 675));
        getContentPane().setLayout(null);

        back_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        back_btn.setForeground(new java.awt.Color(255, 255, 255));
        back_btn.setText("Back");
        back_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 102, 102), null, null));
        back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_btnMouseClicked(evt);
            }
        });
        getContentPane().add(back_btn);
        back_btn.setBounds(13, 6, 45, 29);

        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name_entry.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        name_entry.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        name_entry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_entryActionPerformed(evt);
            }
        });
        jPanel1.add(name_entry, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 151, 280, 32));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAME ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 113, 60, 20));

        pass_entry.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        pass_entry.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(pass_entry, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 263, 280, 31));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 120, 20));

        submit.setBackground(new java.awt.Color(153, 153, 153));
        submit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submit.setText("LOGIN");
        submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 343, 280, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Myriad Pro", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 48, -1, 53));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 139, 340, 6));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 251, 340, 4));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(910, 160, 370, 410);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("EVENT MANAGEMENT SYSTEM");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0)));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel7MouseMoved(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(150, 320, 516, 56);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EventManagement/pexels-polina-kovaleva-5430720.jpg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-20, -1560, 2260, 3500);

        setSize(new java.awt.Dimension(1415, 777));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static int okcancel(String theMessage){
        int result=JOptionPane.showConfirmDialog((Component)null,theMessage,"alert",JOptionPane.OK_CANCEL_OPTION);
        return result;
    }
    
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

        Connection con = myConnection();
        try{
                String host ="admin";
                String name=name_entry.getText();
                String pass=pass_entry.getText();
                PreparedStatement prest,prest1;
                String sql ="SELECT username , password FROM user_login WHERE username='"+name+"' AND password='"+pass+"'";
                String adminsql ="SELECT aname , apass FROM admin WHERE aname='"+name+"' AND apass='"+pass+"'";
                prest= con.prepareStatement(sql);
                prest1= con.prepareStatement(adminsql);
                ResultSet rs = prest.executeQuery(sql);
                ResultSet rs1 = prest1.executeQuery(adminsql);
                
                if(name.equals("") || pass.equals("")){
                    okcancel("Invalid!");
                }
                else if(rs.next()){
                    int i = okcancel("WELCOME");
                    System.out.println("ret:"+i);
                    String loginname=name_entry.getText();
                    new home(loginname).setVisible(true);
                    dispose();
                }
                else if(name_entry.getText().equals("admin")&& pass_entry.getText().equals("admin")){
                    okcancel("WELCOME TO ADMIN PAGE");
                    admin a = new admin();
                    a.show();
                    dispose();
                }
                else{
                    int j = okcancel("Wrong password or username");
                    System.out.println("ret:"+j);
                    con.close();
                    pass_entry.setText("");
                }
                
                
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_submitActionPerformed

   
    private void back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_btnMouseClicked
        // TODO add your handling code here
        welcome w = new welcome();
        w.show();
        dispose();
    }//GEN-LAST:event_back_btnMouseClicked

    private void name_entryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_entryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_entryActionPerformed

    private void jLabel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseMoved

    }//GEN-LAST:event_jLabel7MouseMoved

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField name_entry;
    private javax.swing.JPasswordField pass_entry;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
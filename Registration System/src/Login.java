/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
*/

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Login extends javax.swing.JFrame {
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        try{
            Connection();
        } catch(SQLException ex){
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
    Connection Connection;
    
    Statement Statement;
    
    
    private static final String DbName = "accountdata";
    private static final String DbDriver = "com.mysql.cj.jdbc.Driver";
    private static final String DbUrl = "jdbc:mysql://localhost:3306/" + DbName;
    private static final String DbUsername = "root";
    private static final String DbPassword = "";
    
    public void Connection() throws SQLException{
        
        try {
            Class.forName(DbDriver);
            Connection = DriverManager.getConnection(DbUrl, DbUsername, DbPassword);
            Statement = Connection.createStatement();
            if (Connection != null) {
                JOptionPane.showMessageDialog(null, "Welcome to Login Page");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LoginButton = new javax.swing.JToggleButton();
        RegisterButton = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        UsernameLoginField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PasswordLoginField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Login Page");

        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Username");

        UsernameLoginField.setText("Type your username");
        UsernameLoginField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameLoginFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameLoginFieldFocusLost(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Password");

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(17, 17, 17))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4)
        );

        PasswordLoginField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordLoginFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordLoginFieldFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PasswordLoginField)
                    .addComponent(UsernameLoginField, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(LoginButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(124, 124, 124))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsernameLoginField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordLoginField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(LoginButton)
                .addGap(18, 18, 18)
                .addComponent(RegisterButton)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        Registration Registration = new Registration();
        Registration.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegisterButtonActionPerformed
    
    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        
        String username = UsernameLoginField.getText();
        String password = PasswordLoginField.getText();
        
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Make sure to fill out both fields");
            return;
        }        
        if(UsernameLoginField.getText().equals("Admin")&&PasswordLoginField.getText().equals("123")){
            JOptionPane.showMessageDialog(null, "Welcome Admin");     
            MenuAdmin Menu = new MenuAdmin();
            Menu.setVisible(true);
            dispose();
        }else{
        
        try {
            String queryAdmin = "SELECT * FROM admintable WHERE Username = ? AND Password = ?";
            String queryLogin = "SELECT * FROM accountable WHERE Username = ? AND Password = ?";
            
            PreparedStatement pst = Connection.prepareStatement(queryAdmin);
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                
                String name = rs.getString("Name");
                MenuAdmin menuAdmin = new MenuAdmin();
                JOptionPane.showMessageDialog(null, "Welcome: " + name);
                menuAdmin.setVisible(true);
                dispose();
                return;
            }
            
            pst = Connection.prepareStatement(queryLogin);
            pst.setString(1, username);
            pst.setString(2, password);
            rs = pst.executeQuery();
            
            if (rs.next()) {
                
                Profile profile = new Profile();
                
                String Name = rs.getString("Name");
                String Username = rs.getString("Username");
                String Password = rs.getString("Password");
                String ContactNumber = rs.getString("ContactNumber");
                String Address = rs.getString("Address");
                
                Profile.NameProfileField.setText(Name);
                Profile.UsernameProfileField.setText(Username);
                Profile.PasswordProfileField.setText(Password);
                Profile.ContactNumberProfileField.setText(ContactNumber);
                Profile.AddressProfileField.setText(Address);
                
                JOptionPane.showMessageDialog(null, "Login successful");
                profile.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Username or password");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        
        
        
        
    }//GEN-LAST:event_LoginButtonActionPerformed
    /** Profile Profile = new Profile();
     * String Name = rs.getString("Name");
     * String Username = rs.getString("Username");
     * String Password = rs.getString("Password");
     * String ContactNumber = rs.getString("ContactNumber");
     * String Address = rs.getString("Address");
     * 
     * Profile.NameProfileField.setText(Name);
     * Profile.UsernameProfileField.setText(Username);
     * Profile.PasswordProfileField.setText(Password);
     * Profile.ContactNumberProfileField.setText(ContactNumber);
     * Profile.AddressProfileField.setText(Address);
     */
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
        int Option = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Warning", JOptionPane.YES_NO_OPTION);
        if (Option == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        
    }//GEN-LAST:event_jLabel4MouseClicked
    
    private void UsernameLoginFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameLoginFieldFocusGained
        if(UsernameLoginField.getText().equals("Type your username")){
            
            UsernameLoginField.setText("");
            UsernameLoginField.setForeground(new Color(0,0,0));
        }
        
    }//GEN-LAST:event_UsernameLoginFieldFocusGained
    
    private void UsernameLoginFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameLoginFieldFocusLost
        if(UsernameLoginField.getText().equals("")){
            
            UsernameLoginField.setText("Type your username");
            UsernameLoginField.setForeground(new Color(70,73,75));
        }
    }//GEN-LAST:event_UsernameLoginFieldFocusLost
    
    private void PasswordLoginFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordLoginFieldFocusGained
        
    }//GEN-LAST:event_PasswordLoginFieldFocusGained
    
    private void PasswordLoginFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordLoginFieldFocusLost
        
    }//GEN-LAST:event_PasswordLoginFieldFocusLost
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton LoginButton;
    private javax.swing.JPasswordField PasswordLoginField;
    private javax.swing.JToggleButton RegisterButton;
    private javax.swing.JTextField UsernameLoginField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

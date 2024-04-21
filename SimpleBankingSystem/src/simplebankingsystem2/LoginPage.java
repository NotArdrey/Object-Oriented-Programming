package simplebankingsystem2;


import java.awt.Color;
import java.util.HashMap;
import javax.swing.JOptionPane;

/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
*/

/**
 *
 * @author rhed
 */

public class LoginPage extends javax.swing.JFrame{
    



    public LoginPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AccountNumber = new javax.swing.JTextField();
        Pin = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        EnterButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Banking System");

        AccountNumber.setText("Enter Account Number");
        AccountNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AccountNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AccountNumberFocusLost(evt);
            }
        });

        Pin.setText("123456789");
        Pin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PinFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PinFocusLost(evt);
            }
        });
        Pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PinActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Account Number");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Enter Pin ");

        EnterButton.setText("Enter");
        EnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(AccountNumber)
                                .addComponent(Pin, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(EnterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(EnterButton)
                .addContainerGap(55, Short.MAX_VALUE))
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
    
    private void EnterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterButtonActionPerformed
        
        try {
            if (AccountNumber.getText().equals("") || Pin.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill out the Username or Password");
            } else if (AccountNumber.getText().equals("123456789") && Pin.getText().equals("1111")) {
                Menu Menu = new Menu();
                Menu.AccountNumber.setText(AccountNumber.getText());
                Menu.AccountNumberBalance.setText(Double.toString(Menu.Instance.accountOne));
                Menu.setVisible(true);
                dispose();
            } else if (AccountNumber.getText().equals("987654321") && Pin.getText().equals("2222")) {
                Menu Menu = new Menu();
                Menu.AccountNumber.setText(AccountNumber.getText()); 
                Menu.AccountNumberBalance.setText(Double.toString(Menu.Instance.accountTwo));
                Menu.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
        }
        
    }//GEN-LAST:event_EnterButtonActionPerformed
    
    private void AccountNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccountNumberFocusGained
        if(AccountNumber.getText().equals("Enter Account Number")){
            
            AccountNumber.setText("");
            AccountNumber.setForeground(new Color(0,0,0));
            
        }
    }//GEN-LAST:event_AccountNumberFocusGained
    
    private void AccountNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccountNumberFocusLost
        if(AccountNumber.getText().equals("")){
             
            AccountNumber.setText("Enter Account Number");
            AccountNumber.setForeground(new Color(70,73,75));
        }
    }//GEN-LAST:event_AccountNumberFocusLost
    
    private void PinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PinActionPerformed
    
    private void PinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PinFocusGained
        if(Pin.getText().equals("123456789")){
            
            Pin.setText("");
            Pin.setForeground(new Color(0,0,0));
            
        }
    }//GEN-LAST:event_PinFocusGained
    
    private void PinFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PinFocusLost
        if(Pin.getText().equals("")){
            
            Pin.setText("123456789");
            Pin.setForeground(new Color(70,73,75));
        }
    }//GEN-LAST:event_PinFocusLost
    
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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField AccountNumber;
    public static javax.swing.JButton EnterButton;
    private javax.swing.JPasswordField Pin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_group_assignment.newpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author darke
 */
public class AdminRegister extends javax.swing.JFrame {

    /**
     * Creates new form AdminRegister
     */
    public AdminRegister() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminPassWord = new javax.swing.JPasswordField();
        AdminRegister = new javax.swing.JLabel();
        ComfirmBut = new javax.swing.JButton();
        AdminEmailText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        AdminUsernameText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AdminEmployID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AdminCPassWord = new javax.swing.JPasswordField();
        ComfirmBut1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AdminRegister.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        AdminRegister.setText("Admin Register");

        ComfirmBut.setText("Confirm Registration");
        ComfirmBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComfirmButActionPerformed(evt);
            }
        });

        AdminEmailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminEmailTextActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Email:");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("Username:");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setText("Employee ID:");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setText("Password:");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setText("Confirm Password:");

        ComfirmBut1.setText("Return");
        ComfirmBut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComfirmBut1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(ComfirmBut1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(754, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(308, 308, 308)
                            .addComponent(ComfirmBut, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(195, 195, 195)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(181, 181, 181)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AdminUsernameText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AdminEmailText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AdminEmployID)
                                    .addComponent(AdminCPassWord)
                                    .addComponent(AdminPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(347, 347, 347)
                            .addComponent(AdminRegister)))
                    .addContainerGap(196, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(562, Short.MAX_VALUE)
                .addComponent(ComfirmBut1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(108, 108, 108)
                            .addComponent(AdminRegister)
                            .addGap(54, 54, 54)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AdminEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AdminUsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addComponent(AdminEmployID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(AdminPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(AdminCPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(309, 309, 309)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                    .addComponent(ComfirmBut, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(108, 108, 108)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComfirmButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComfirmButActionPerformed
        String filename ="adminACC.txt";
        File rfile = new File(filename);
        FileReader fr;
        try {
        fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        String Email = AdminEmailText.getText();


        String line;
        while((line = br.readLine()) !=null){
            String[] values = line.split(",");
            if(Email.equals(values[0])){
                JOptionPane.showMessageDialog(this, "Email already exist try again or cannot be left blank", "Email already exist try again or cannot be left blank", JOptionPane.ERROR_MESSAGE);
                throw new Exception();
            }
        }
        
        
        String email = AdminEmailText.getText();
        String username = AdminUsernameText.getText();
        String employID = AdminEmployID.getText();
        String password = new String(AdminPassWord.getPassword());
        String confirmPassword = new String(AdminCPassWord.getPassword());
        
        if (password.equals("") && email.equals("") && username.equals("") && employID.equals("")&& confirmPassword.equals("")){
            JOptionPane.showMessageDialog(this, "Please Fill in all Criteria", "Please Fill in all Criteria", JOptionPane.ERROR_MESSAGE);
        }else{
        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Password Does not Match", "Password Does not Match", JOptionPane.ERROR_MESSAGE);
            return;
            
        }else{
            
            AdminHome newpage = new AdminHome();
            newpage.setVisible(true);
            dispose();

            File file = new File("adminACC.txt");
            if (!file.exists()) {

            }
            }
            try (FileWriter writer = new FileWriter("adminACC.txt", true)) {
                writer.write(email + "," + username + "," + employID + "," + password + "\n");

                // Show a message dialog to confirm that the registration was successful
                JOptionPane.showMessageDialog(this, "Registration successful.");

                // Clear the text fields and password fields
                AdminEmailText.setText("");
                AdminUsernameText.setText("");
                AdminEmployID.setText("");
                AdminPassWord.setText("");
                AdminCPassWord.setText("");
            }catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error writing to file: " + e.getMessage());
            }
        }
        } catch (IOException ex) {
        Logger.getLogger(AdminAccounts.class.getName()).log(Level.SEVERE, null, ex);
    } catch (Exception e) {
        
    }
    }//GEN-LAST:event_ComfirmButActionPerformed

    private void AdminEmailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminEmailTextActionPerformed

    }//GEN-LAST:event_AdminEmailTextActionPerformed

    private void ComfirmBut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComfirmBut1ActionPerformed
    AdminHome newpage = new AdminHome();
        newpage.setVisible(true);
        dispose();              // TODO add your handling code here:
    }//GEN-LAST:event_ComfirmBut1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField AdminCPassWord;
    private javax.swing.JTextField AdminEmailText;
    private javax.swing.JTextField AdminEmployID;
    private javax.swing.JPasswordField AdminPassWord;
    private javax.swing.JLabel AdminRegister;
    private javax.swing.JTextField AdminUsernameText;
    private javax.swing.JButton ComfirmBut;
    private javax.swing.JButton ComfirmBut1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
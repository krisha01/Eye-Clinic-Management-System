/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Register;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.RegisterRequest.RegisterRequest;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

/**
 *
 * @author Krisha
 */
public class RegisterJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;

    /**
     * Creates new form RegisterJPanel
     */
    public RegisterJPanel(JPanel userProcessContainer, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        populateNetworkCombox();
    }

    private void populateNetworkCombox() {
        networkcombox.removeAllItems();
        for (Network network : ecoSystem.getNetworkList()) {
            networkcombox.addItem(network);
        }
    }

    private void populateEnterpriseComboBox(Network network) {
        enterprisecombox.removeAllItems();
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
       //     if (enterprise instanceof PharmacyEnterprise) {
         //       return;
           // } else {
                enterprisecombox.addItem(enterprise);
            //}
        }
    }

    private void populateOrganizationComboBox(Enterprise enterprise) {
        organizationcombox.removeAllItems();
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            organizationcombox.addItem(org);
        }
    }

    private void populateRoleComboBox(Organization org1) {
        rolecombox.removeAllItems();
        for (Role role : org1.getSupportedRole()) {
            rolecombox.addItem(role);
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

        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        unfield = new javax.swing.JTextField();
        namefield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SubmitBtn = new javax.swing.JButton();
        networkcombox = new javax.swing.JComboBox();
        enterprisecombox = new javax.swing.JComboBox();
        organizationcombox = new javax.swing.JComboBox();
        rolecombox = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        pwdfield = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(97, 212, 195));

        jLabel1.setText("User Name:");

        jLabel2.setText("Password:");

        jLabel3.setText("Name:");

        jLabel4.setText("Please Select your State");

        jLabel5.setText("Please Select your Hospital");

        jLabel6.setText("Please Select your Department");

        jLabel7.setText("Please Select your Role");

        SubmitBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        SubmitBtn.setText("Sign Up");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        networkcombox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkcombox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkcomboxActionPerformed(evt);
            }
        });

        enterprisecombox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterprisecombox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterprisecomboxActionPerformed(evt);
            }
        });

        organizationcombox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationcombox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationcomboxActionPerformed(evt);
            }
        });

        rolecombox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Email:");

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sign Up");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel9)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel9)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(unfield, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(namefield, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(email)
                    .addComponent(pwdfield))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(networkcombox, 0, 177, Short.MAX_VALUE)
                    .addComponent(enterprisecombox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(organizationcombox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rolecombox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(unfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(networkcombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(enterprisecombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pwdfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(organizationcombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rolecombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void networkcomboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkcomboxActionPerformed
        Network network = (Network) networkcombox.getSelectedItem();
        if(network!=null){
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_networkcomboxActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed


        RegisterRequest registerRequest = new RegisterRequest();
        registerRequest.setUsername(unfield.getText());
        registerRequest.setPassword(pwdfield.getText());
        registerRequest.setName(namefield.getText());
        registerRequest.setEmail(email.getText());
        
        registerRequest.setNetwork((Network) networkcombox.getSelectedItem());
        registerRequest.setEnterprise((Enterprise) enterprisecombox.getSelectedItem());
        registerRequest.setOrganization((Organization) organizationcombox.getSelectedItem());
        registerRequest.setRole((Role) rolecombox.getSelectedItem());
        
        if(registerRequest.getRole().toString().equals("Business.Role.DoctorRole")){
            registerRequest.getRegisterdoctor().setName(registerRequest.getName());
        }
        else if(registerRequest.getRole().toString().equals("Business.Role.PatientRole")){
            registerRequest.getRegisterpatient().setPatientName(registerRequest.getName());
            registerRequest.getRegisterpatient().setEmail(registerRequest.getName());
        }
        
        Enterprise en = (Enterprise) enterprisecombox.getSelectedItem();
        
        for(UserAccount ua : en.getUserAccountDirectory().getUserAccountList()){
            if(ua.getRole().toString().equals("Business.Role.AdminRole")){
                ua.getRegisterRequestDirectory().getRegisterRequestList().add(registerRequest);
            }
        }
        
        
      String to = email.getText();
      String from = "yoyashoza@gmail.com";
      final String username = "yoyashoza";
      final String password = "bomdiggy1991";

      String host = "smtp.gmail.com";

      Properties props = new Properties();
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.host", host);
      props.put("mail.smtp.port", "587");

      Session session = Session.getInstance(props,
      new javax.mail.Authenticator() {
         protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(username, password);
         }
      });

      try {
         Message message = new MimeMessage(session);

         message.setFrom(new InternetAddress(from));

         message.setRecipients(Message.RecipientType.TO,
         InternetAddress.parse(to));

         message.setSubject("Registration Email");

         message.setText("This is a registration mail. Congratulations "+registerRequest.getName()+", You've succesfully been registered as a Patient to "+enterprisecombox.getSelectedItem());

         Transport.send(message);

         System.out.println("Sent message successfully....");

      } catch (MessagingException e) {
            throw new RuntimeException(e);
      }
        
        JOptionPane.showMessageDialog(null, "Submitted Successfully");
        
        unfield.setText("");
        pwdfield.setText("");
        namefield.setText("");
        email.setText("");
        

    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void enterprisecomboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterprisecomboxActionPerformed
        // TODO add your handling code here:
        Enterprise enterprise = (Enterprise) enterprisecombox.getSelectedItem();
        if(enterprise != null){
            populateOrganizationComboBox(enterprise);
        }
    }//GEN-LAST:event_enterprisecomboxActionPerformed

    private void organizationcomboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationcomboxActionPerformed
        // TODO add your handling code here:
        Organization org = (Organization) organizationcombox.getSelectedItem();
        if(org!= null){
            populateRoleComboBox(org);
        }
    }//GEN-LAST:event_organizationcomboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox enterprisecombox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField namefield;
    private javax.swing.JComboBox networkcombox;
    private javax.swing.JComboBox organizationcombox;
    private javax.swing.JPasswordField pwdfield;
    private javax.swing.JComboBox rolecombox;
    private javax.swing.JTextField unfield;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.edunova.view;

import hr.edunova.edunova.controller.ObradaOperater;
import hr.edunova.edunova.model.Operater;
import hr.edunova.edunova.util.Pomocno;
import javax.swing.JOptionPane;

/**
 *
 * @author Nino
 */
public class Autorizacija extends javax.swing.JFrame {

    /**
     * Creates new form Autorizacija
     */
    public Autorizacija() {
        initComponents();
    }
<<<<<<< HEAD
                                                 

         
=======
<<<<<<< HEAD
                                                 

         
=======
<<<<<<< HEAD
                                                 

         
=======
<<<<<<< HEAD
                                                 

         
=======
    
    private void btnAutorizirajActionPerformed(java.awt.event.ActionEvent evt) {                                               
       
        ObradaOperater op = new ObradaOperater();
        
        Operater o = op.autoriziraj(txtEmail.getText().trim(), new String(pswLozinka.getPassword()));
        
        
        if(o==null){
            JOptionPane.showMessageDialog(null, "Greška, ponovite");
            return;
        }
        Pomocno.LOGIRAN=o;
       new Izbornik().setVisible(true);
       dispose();
        
    }                                              

    private void btnRegistracijaActionPerformed(java.awt.event.ActionEvent evt) {                                                
        new Registracija().setVisible(true);
    }         
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pswLozinka = new javax.swing.JPasswordField();
        btnAutoriziraj = new javax.swing.JButton();
        btnRegistracija = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("email");

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
        txtEmail.setText("nikolajuzbasic@gmail.com");

        jLabel2.setText("lozinka");

        pswLozinka.setText("n");

        btnAutoriziraj.setText("Autoriziraj");
<<<<<<< HEAD
=======
=======
        jLabel2.setText("lozinka");

        btnAutoriziraj.setText("Autoriziraj");
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
        btnAutoriziraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorizirajActionPerformed(evt);
            }
        });

        btnRegistracija.setText("Registracija");
        btnRegistracija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistracijaActionPerformed(evt);
            }
        });
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======

        btnRegistracija.setText("Registracija");
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(txtEmail)
                            .addComponent(jLabel2)
                            .addComponent(pswLozinka, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAutoriziraj, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(btnRegistracija, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistracija, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(btnAutoriziraj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAutorizirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorizirajActionPerformed
        ObradaOperater op = new ObradaOperater();
        
        Operater o = op.autoriziraj(txtEmail.getText().trim(), new String(pswLozinka.getPassword()));
        
        
        if(o==null){
            JOptionPane.showMessageDialog(null, "Greška, ponovite");
            return;
        }
        Pomocno.LOGIRAN=o;
       new Izbornik().setVisible(true);
       dispose();
    }//GEN-LAST:event_btnAutorizirajActionPerformed

    private void btnRegistracijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistracijaActionPerformed
        new Registracija().setVisible(true);
    }//GEN-LAST:event_btnRegistracijaActionPerformed

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
    }// </editor-fold>//GEN-END:initComponents

>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutoriziraj;
    private javax.swing.JButton btnRegistracija;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField pswLozinka;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}

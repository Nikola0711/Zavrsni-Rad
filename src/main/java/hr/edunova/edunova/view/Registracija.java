/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.edunova.view;

import hr.edunova.edunova.controller.Obrada;
import hr.edunova.edunova.controller.ObradaOperater;
import hr.edunova.edunova.model.Operater;
import hr.edunova.edunova.util.EdunovaException;
import java.util.Arrays;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Nino
 */
public class Registracija extends javax.swing.JFrame {
    
    private final ObradaOperater obrada;

    /**
     * Creates new form Registracija
     */
    public Registracija() {
        initComponents();
        obrada=new ObradaOperater();
    }

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
        jLabel3 = new javax.swing.JLabel();
        pswLozinkaPonovo = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txtIme = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtOib = new javax.swing.JTextField();
        btnRegistriraj = new javax.swing.JButton();

<<<<<<< HEAD
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
=======
<<<<<<< HEAD
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
=======
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113

        jLabel1.setText("email");

        jLabel2.setText("Lozinka");

        jLabel3.setText("Lozinka ponovo");

        jLabel4.setText("Ime");

        jLabel5.setText("Prezime");

        jLabel6.setText("OIB");

        btnRegistriraj.setText("Registriraj");
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
        btnRegistriraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrirajActionPerformed(evt);
            }
        });
<<<<<<< HEAD
=======
=======
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnRegistriraj, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pswLozinka, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pswLozinkaPonovo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIme, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrezime, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOib, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
<<<<<<< HEAD
=======
=======
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(txtEmail)
                        .addComponent(jLabel2)
                        .addComponent(pswLozinka)
                        .addComponent(jLabel3)
                        .addComponent(pswLozinkaPonovo)
                        .addComponent(jLabel4)
                        .addComponent(txtIme)
                        .addComponent(jLabel5)
                        .addComponent(txtPrezime)
                        .addComponent(jLabel6)
                        .addComponent(txtOib, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)))
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswLozinkaPonovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistriraj, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrirajActionPerformed
<<<<<<< HEAD
=======
=======
    }// </editor-fold>//GEN-END:initComponents
private void btnRegistrirajActionPerformed(java.awt.event.ActionEvent evt) {                                               
      
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
        if(!Arrays.equals(pswLozinka.getPassword(), pswLozinkaPonovo.getPassword())){
            JOptionPane.showMessageDialog(null, "Lozinke ne odgovaraju");
            return;
        }
        
        Operater o = new Operater();
        o.setIme(txtIme.getText());
        o.setPrezime(txtPrezime.getText());
        o.setEmail(txtEmail.getText());
        o.setOib(txtOib.getText());
        o.setLozinka(BCrypt.hashpw(new String(pswLozinka.getPassword()), 
                BCrypt.gensalt()));
        obrada.setEntitet(o);
        try {
            obrada.create();
            JOptionPane.showMessageDialog(null, "Uspješno registrirani, prijavite se s novim podacima");
            dispose();
        }catch(EdunovaException e){
            JOptionPane.showMessageDialog(null, e.getPoruka());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
<<<<<<< HEAD
    }//GEN-LAST:event_btnRegistrirajActionPerformed

=======
<<<<<<< HEAD
    }//GEN-LAST:event_btnRegistrirajActionPerformed

=======
      
    }
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistriraj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField pswLozinka;
    private javax.swing.JPasswordField pswLozinkaPonovo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtOib;
    private javax.swing.JTextField txtPrezime;
    // End of variables declaration//GEN-END:variables
}

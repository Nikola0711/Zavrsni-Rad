/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.edunova.view;

import hr.edunova.edunova.controller.Obrada;
import hr.edunova.edunova.controller.ObradaBoksac;
import hr.edunova.edunova.controller.ObradaKlub;
import hr.edunova.edunova.model.Boksac;
import hr.edunova.edunova.model.Klub;
import hr.edunova.edunova.util.EdunovaException;
import hr.edunova.edunova.util.Pomocno;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Nino
 */
public class ViewKlub extends javax.swing.JFrame {

    /**
     * Creates new form ViewKlub
     */
    private final ObradaKlub obrada;
    public ViewKlub() {
        initComponents();
        obrada=new ObradaKlub();
        ucitaj();
        if (obrada.getEntitet() == null) {
            return;
        }
        postaviVrijednosti();
        
        
        
    }
    
    private void ucitaj() {
        DefaultListModel<Klub> m = new DefaultListModel<>();
        obrada.getPodaci().forEach(s -> m.addElement(s));
        
    }
    
    private void ucitajVrijednosti() {
        obrada.getEntitet().setNaziv(txtNazivKluba.getText());
        obrada.getEntitet().setAdresa(txtAdresa.getText());
        obrada.getEntitet().setBrojclanova(Integer.parseInt(txtBrojClanova.getText()));
        obrada.getEntitet().setClanarina((txtClanarina.getText()));
        
        
        
        
        
    }
    
     private void postaviVrijednosti() {
        txtNazivKluba.setText(obrada.getEntitet().getNaziv());
        txtAdresa.setText(obrada.getEntitet().getAdresa());
        txtBrojClanova.setText(Pomocno.getFormatCijelogBroja(obrada.getEntitet().getBrojclanova()));
        txtClanarina.setText(Pomocno.getFormatDecimalniBroj(obrada.getEntitet().getClanarina()));
  
       
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
        txtNazivKluba = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAdresa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtClanarina = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBrojClanova = new javax.swing.JTextField();
        btnPromjeni = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Naziv kluba");

        jLabel2.setText("Adresa");

        jLabel3.setText("Clanarina");

        jLabel4.setText("Broj clanova");

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(txtNazivKluba)
                    .addComponent(jLabel2)
                    .addComponent(txtAdresa)
                    .addComponent(jLabel3)
                    .addComponent(txtClanarina)
                    .addComponent(jLabel4)
                    .addComponent(txtBrojClanova, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(btnPromjeni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNazivKluba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClanarina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBrojClanova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPromjeni, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
     
        ucitajVrijednosti();
        try {
            obrada.update();
            ucitaj();
        } catch (EdunovaException e) {
            JOptionPane.showMessageDialog(null, e.getPoruka());
        }
    }//GEN-LAST:event_btnPromjeniActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtAdresa;
    private javax.swing.JTextField txtBrojClanova;
    private javax.swing.JTextField txtClanarina;
    private javax.swing.JTextField txtNazivKluba;
    // End of variables declaration//GEN-END:variables
}

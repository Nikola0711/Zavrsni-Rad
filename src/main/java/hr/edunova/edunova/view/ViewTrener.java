/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.edunova.view;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
import hr.edunova.edunova.controller.ObradaTrener;
import hr.edunova.edunova.model.Trener;
import hr.edunova.edunova.util.EdunovaException;
import hr.edunova.edunova.util.Pomocno;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
import hr.edunova.edunova.controller.ObradaTrener;
import hr.edunova.edunova.model.Trener;
import hr.edunova.edunova.util.EdunovaException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

<<<<<<< HEAD
=======
=======
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
/**
 *
 * @author Nino
 */
public class ViewTrener extends javax.swing.JFrame {
<<<<<<< HEAD
    
     private final ObradaTrener obrada;
=======
<<<<<<< HEAD
    
     private final ObradaTrener obrada;
=======
<<<<<<< HEAD
    
     private final ObradaTrener obrada;
=======
<<<<<<< HEAD
    
     private final ObradaTrener obrada;
=======
<<<<<<< HEAD
    
     private final ObradaTrener obrada;
=======
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113

    /**
     * Creates new form ViewTrener
     */
    public ViewTrener() {
        initComponents();
<<<<<<< HEAD
=======
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
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
        obrada=new ObradaTrener();
        ucitaj();
    }
    
    private void ucitaj() {
        DefaultListModel<Trener> m = new DefaultListModel<>();
        obrada.getPodaci().forEach(s -> m.addElement(s));
        lstPodaci.setModel(m);
    }
    
    private void ucitajVrijednosti() {
        obrada.getEntitet().setIme(txtIme.getText());
        obrada.getEntitet().setPrezime(txtPrezime.getText());
        obrada.getEntitet().setOib(txtOib.getText());
        obrada.getEntitet().setIban(txtIban.getText());
<<<<<<< HEAD
        
=======
<<<<<<< HEAD
        
=======
<<<<<<< HEAD
        
=======
<<<<<<< HEAD
        
=======
        obrada.getEntitet().setUloga(txtUloga.getText());
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
    }
    
     private void postaviVrijednosti() {
        txtIme.setText(obrada.getEntitet().getIme());
        txtPrezime.setText(obrada.getEntitet().getPrezime());

        txtOib.setText(obrada.getEntitet().getOib());

<<<<<<< HEAD
       

        txtIban.setText(obrada.getEntitet().getIban());
=======
<<<<<<< HEAD
       

        txtIban.setText(obrada.getEntitet().getIban());
=======
<<<<<<< HEAD
       

        txtIban.setText(obrada.getEntitet().getIban());
=======
<<<<<<< HEAD
       

        txtIban.setText(obrada.getEntitet().getIban());
=======
       txtUloga.setText(obrada.getEntitet().getUloga());

        txtIban.setText(obrada.getEntitet().getIban());
=======
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
<<<<<<< HEAD
        lstPodaci = new javax.swing.JList<>();
=======
<<<<<<< HEAD
        lstPodaci = new javax.swing.JList<>();
=======
<<<<<<< HEAD
        lstPodaci = new javax.swing.JList<>();
=======
<<<<<<< HEAD
        lstPodaci = new javax.swing.JList<>();
=======
<<<<<<< HEAD
        lstPodaci = new javax.swing.JList<>();
=======
        jList1 = new javax.swing.JList<>();
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
        jLabel1 = new javax.swing.JLabel();
        txtIme = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtOib = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIban = new javax.swing.JTextField();
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
        btnDodajNovi = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        btnGetIP = new javax.swing.JButton();
        btnGenOib = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
=======
        jLabel5 = new javax.swing.JLabel();
        txtUloga = new javax.swing.JTextField();
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
        btnDodajNovi = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113

        jLabel1.setText("Ime");

        jLabel2.setText("Prezime");

        jLabel3.setText("OIB");

        jLabel4.setText("IBAN");

<<<<<<< HEAD
        btnDodajNovi.setText("Dodaj novi");
=======
<<<<<<< HEAD
        btnDodajNovi.setText("Dodaj novi");
=======
<<<<<<< HEAD
        btnDodajNovi.setText("Dodaj novi");
=======
<<<<<<< HEAD
        btnDodajNovi.setText("Dodaj novi");
=======
        jLabel5.setText("Uloga");

        btnDodajNovi.setText("Dodaj novi");
<<<<<<< HEAD
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
        btnDodajNovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajNoviActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obrisi");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113

        btnGetIP.setText("Get IP");
        btnGetIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetIPActionPerformed(evt);
            }
        });

        btnGenOib.setText("Gen OIB");
        btnGenOib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenOibActionPerformed(evt);
            }
        });
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
=======
=======

        btnPromjeni.setText("Promjeni");

        btnObrisi.setText("Obrisi");
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGetIP, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
<<<<<<< HEAD
=======
                    .addComponent(jLabel5)
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodajNovi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPromjeni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnObrisi))
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtIme, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(txtPrezime, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOib, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIban, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(46, 46, 46)
                        .addComponent(btnGenOib)))
                .addContainerGap(29, Short.MAX_VALUE))
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtIme, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                        .addComponent(txtPrezime, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtOib, javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
                        .addComponent(txtIban, javax.swing.GroupLayout.Alignment.LEADING)))
=======
                        .addComponent(txtIban, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtUloga, javax.swing.GroupLayout.Alignment.LEADING)))
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
                .addContainerGap(99, Short.MAX_VALUE))
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btnGetIP))
=======
<<<<<<< HEAD
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btnGetIP))
=======
<<<<<<< HEAD
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btnGetIP))
=======
                        .addComponent(jLabel2)
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGenOib))
=======
<<<<<<< HEAD
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGenOib))
=======
<<<<<<< HEAD
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGenOib))
=======
                        .addComponent(txtOib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                        .addGap(64, 64, 64)
=======
<<<<<<< HEAD
                        .addGap(64, 64, 64)
=======
<<<<<<< HEAD
                        .addGap(64, 64, 64)
=======
<<<<<<< HEAD
                        .addGap(64, 64, 64)
=======
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUloga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodajNovi)
                            .addComponent(btnPromjeni)
                            .addComponent(btnObrisi))
<<<<<<< HEAD
                        .addGap(0, 1, Short.MAX_VALUE))
=======
<<<<<<< HEAD
                        .addGap(0, 1, Short.MAX_VALUE))
=======
<<<<<<< HEAD
                        .addGap(0, 1, Short.MAX_VALUE))
=======
                        .addGap(0, 13, Short.MAX_VALUE))
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
<<<<<<< HEAD
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

=======
<<<<<<< HEAD
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

=======
<<<<<<< HEAD
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

=======
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
    private void btnDodajNoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajNoviActionPerformed
        try {
            obrada.setEntitet(new Trener());
            ucitajVrijednosti();
            obrada.create();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(null, ex.getPoruka());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnDodajNoviActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        if (obrada.getEntitet() == null) {
            JOptionPane.showMessageDialog(null, "Prvo odaberite stavku");
            return;
        }

        ucitajVrijednosti();
        try {
            obrada.update();
            ucitaj();
        } catch (EdunovaException e) {
            JOptionPane.showMessageDialog(null, e.getPoruka());
        }
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        if (obrada.getEntitet() == null) {
            JOptionPane.showMessageDialog(null, "Prvo odaberite stavku");
            return;
        }
        try {
            obrada.delete();
            ucitaj();
        } catch (EdunovaException e) {
            JOptionPane.showMessageDialog(null, e.getPoruka());
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }
        obrada.setEntitet(lstPodaci.getSelectedValue());
        if (obrada.getEntitet() == null) {
            return;
        }
        postaviVrijednosti();
    }//GEN-LAST:event_lstPodaciValueChanged

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
    private void btnGetIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetIPActionPerformed
        ViewBoksac.Osoba o = Pomocno.getgenIP();
      if(o==null){
          return;
      }
      txtIme.setText(o.getIme());
        txtPrezime.setText(o.getPrezime());
    }//GEN-LAST:event_btnGetIPActionPerformed

    private void btnGenOibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenOibActionPerformed
        txtOib.setText(Pomocno.getGenOIB());
    }//GEN-LAST:event_btnGenOibActionPerformed

    
     public class Osoba{

        private String ime;
        private String prezime;
        
        public Osoba(){
            
        }

        public String getIme() {
            return ime;
        }

        public void setIme(String ime) {
            this.ime = ime;
        }

        public String getPrezime() {
            return prezime;
        }

        public void setPrezime(String prezime) {
            this.prezime = prezime;
        }
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajNovi;
    private javax.swing.JButton btnGenOib;
    private javax.swing.JButton btnGetIP;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
    
<<<<<<< HEAD
=======
=======
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
            java.util.logging.Logger.getLogger(ViewTrener.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTrener.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTrener.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTrener.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTrener().setVisible(true);
            }
        });
    }
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajNovi;
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
<<<<<<< HEAD
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Trener> lstPodaci;
=======
<<<<<<< HEAD
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Trener> lstPodaci;
=======
<<<<<<< HEAD
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Trener> lstPodaci;
=======
<<<<<<< HEAD
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Trener> lstPodaci;
=======
    private javax.swing.JLabel jLabel5;
<<<<<<< HEAD
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Trener> lstPodaci;
=======
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
    private javax.swing.JTextField txtIban;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtOib;
    private javax.swing.JTextField txtPrezime;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
    private javax.swing.JTextField txtUloga;
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.edunova.view;

<<<<<<< HEAD
import hr.edunova.edunova.util.HibernateUtil;
=======
<<<<<<< HEAD
import hr.edunova.edunova.util.HibernateUtil;
=======
<<<<<<< HEAD
import hr.edunova.edunova.util.HibernateUtil;
=======
<<<<<<< HEAD
import hr.edunova.edunova.util.HibernateUtil;
=======
<<<<<<< HEAD
import hr.edunova.edunova.util.HibernateUtil;
=======
>>>>>>> b6aaef2c683705a38b929e3f9521630717b6cd15
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
import hr.edunova.edunova.util.Pomocno;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Nino
 */
public class Izbornik extends javax.swing.JFrame {

    
    public Izbornik() {
        initComponents();
        setTitle(Pomocno.getNazivAplikacije());
        jmAplikacija.setText(Pomocno.getNazivAplikacije());
        
        Vrijeme v = new Vrijeme();
        v.start();
        
    }
    
    private class Vrijeme extends Thread{

        SimpleDateFormat df = new SimpleDateFormat("dd. MM. yyyy. HH:mm:ss");
        
        @Override
        public void run() {
            try {
                lblVrijeme.setText(df.format(new Date()));
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
            run();
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

        lblVrijeme = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAplikacija = new javax.swing.JMenu();
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
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
<<<<<<< HEAD
        jMenuItem5 = new javax.swing.JMenuItem();
=======
<<<<<<< HEAD
        jMenuItem5 = new javax.swing.JMenuItem();
=======
<<<<<<< HEAD
        jMenuItem5 = new javax.swing.JMenuItem();
=======
=======
<<<<<<< HEAD
        jMenuItem1 = new javax.swing.JMenuItem();
=======
>>>>>>> b6aaef2c683705a38b929e3f9521630717b6cd15
        jMenu2 = new javax.swing.JMenu();
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblVrijeme.setText("vrijeme");

        jmAplikacija.setText("Aplikacije");
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06

        jMenuItem1.setText("izlaz");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmAplikacija.add(jMenuItem1);

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
        jMenuBar1.add(jmAplikacija);

        jMenu2.setText("Programi");

        jMenuItem2.setText("Boksac");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Trener");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Kategorija");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
        jMenuItem5.setText("Klub");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
=======
=======
>>>>>>> b6aaef2c683705a38b929e3f9521630717b6cd15
        jMenuBar1.add(jmAplikacija);

        jMenu2.setText("Programi");
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblVrijeme)
                .addGap(0, 365, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 264, Short.MAX_VALUE)
                .addComponent(lblVrijeme))
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
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        HibernateUtil.getSessionFactory().close();
        dispose();
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new ViewBoksac().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       new ViewTrener().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new ViewKategorija().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new ViewKlub().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
=======
=======
>>>>>>> b6aaef2c683705a38b929e3f9521630717b6cd15
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
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
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
<<<<<<< HEAD
    private javax.swing.JMenuItem jMenuItem5;
=======
<<<<<<< HEAD
    private javax.swing.JMenuItem jMenuItem5;
=======
<<<<<<< HEAD
    private javax.swing.JMenuItem jMenuItem5;
=======
=======
<<<<<<< HEAD
    private javax.swing.JMenuItem jMenuItem1;
=======
>>>>>>> b6aaef2c683705a38b929e3f9521630717b6cd15
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
    private javax.swing.JMenu jmAplikacija;
    private javax.swing.JLabel lblVrijeme;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.edunova.view;

<<<<<<< HEAD
import com.github.lgooddatepicker.components.DatePickerSettings;
=======
<<<<<<< HEAD
import com.github.lgooddatepicker.components.DatePickerSettings;
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
import hr.edunova.edunova.controller.ObradaBoksac;
import hr.edunova.edunova.controller.ObradaKategorije;
import hr.edunova.edunova.controller.ObradaTrener;
import hr.edunova.edunova.model.Boksac;
import hr.edunova.edunova.model.Kategorija;
import hr.edunova.edunova.model.Trener;
import hr.edunova.edunova.util.EdunovaException;
import hr.edunova.edunova.util.Pomocno;
import java.awt.event.KeyEvent;
<<<<<<< HEAD
import java.util.Date;
import java.util.Locale;
import javax.swing.ComboBoxModel;
=======
<<<<<<< HEAD
import java.util.Date;
import java.util.Locale;
import javax.swing.ComboBoxModel;
=======
<<<<<<< HEAD
import javax.swing.ComboBoxModel;
=======
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD
=======
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
public class ViewBoksac extends javax.swing.JFrame {
<<<<<<< HEAD
    
    private final ObradaBoksac obrada;
=======
<<<<<<< HEAD
    
    private final ObradaBoksac obrada;
=======
<<<<<<< HEAD
    
    private final ObradaBoksac obrada;
=======
<<<<<<< HEAD
    
    private final ObradaBoksac obrada;
=======
<<<<<<< HEAD
    
    private final ObradaBoksac obrada;
=======
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113

    /**
     * Creates new form ViewBoksac
     */
    public ViewBoksac() {
        initComponents();
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
        obrada=new ObradaBoksac();
        ucitaj();
        ucitajKategorija();
        ucitajTrener();
<<<<<<< HEAD
        DatePickerSettings dps = new DatePickerSettings(new Locale("hr","HR"));
        dps.setFormatForDatesCommonEra("dd.MM.yyyy.");
        dpDatumRodenja.setSettings(dps);
=======
<<<<<<< HEAD
        DatePickerSettings dps = new DatePickerSettings(new Locale("hr","HR"));
        dps.setFormatForDatesCommonEra("dd.MM.yyyy.");
        dpDatumRodenja.setSettings(dps);
=======
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
        obrada=new ObradaBoksac();
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
    }
    
    private void ucitaj() {
        DefaultListModel<Boksac> m = new DefaultListModel<>();
        obrada.getPodaci(txtUvjet.getText().trim()).forEach(s -> m.addElement(s));
        lstPodaci.setModel(m);
    }
    
    private void ucitajVrijednosti() {
        obrada.getEntitet().setIme(txtIme.getText());
        obrada.getEntitet().setPrezime(txtPrezime.getText());
        obrada.getEntitet().setOib(txtOib.getText());
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
        obrada.getEntitet().setKategorija(cmbKategorija.getModel().getElementAt(cmbKategorija.getSelectedIndex()));
        obrada.getEntitet().setTrener(cmbTrener.getModel().getElementAt(cmbTrener.getSelectedIndex()));
        
        if(dpDatumRodenja.getDate()!=null){
            Date d = Pomocno.convertToDateViaInstant(dpDatumRodenja.getDate());
            obrada.getEntitet().setDatumRodenja(d);
        }
        
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
        obrada.getEntitet().setKategorija(cmbKategorija.getModel().getElementAt(cmbKategorija.getSelectedIndex()));
        obrada.getEntitet().setTrener(cmbTrener.getModel().getElementAt(cmbTrener.getSelectedIndex()));
        //dodati kategoriju
=======
        
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
    }
    
     private void postaviVrijednosti() {
        txtIme.setText(obrada.getEntitet().getIme());
        txtPrezime.setText(obrada.getEntitet().getPrezime());
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
        txtOib.setText(obrada.getEntitet().getOib());
        postaviKategorija();
        postaviTrener();
       
        
        if(obrada.getEntitet().getDatumRodenja()==null){
            dpDatumRodenja.setDate(null);
        }else{
            dpDatumRodenja.setDate(Pomocno.convertToLocalDateViaInstant(obrada.getEntitet().getDatumRodenja()));
        }
        
        
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
        txtOib.setText(obrada.getEntitet().getOib());
        postaviKategorija();
        postaviTrener();
        
        //postaviti kategoriju 
=======

        txtOib.setText(obrada.getEntitet().getOib());
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113

       
    }
     
     private void ucitajKategorija() {
         DefaultComboBoxModel<Kategorija> m = new DefaultComboBoxModel<>();
        new ObradaKategorije().getPodaci().forEach(s->m.addElement(s));
        cmbKategorija.setModel(m);


    }
      private void ucitajTrener() {
         DefaultComboBoxModel<Trener> m = new DefaultComboBoxModel<>();
        new ObradaTrener().getPodaci().forEach(s->m.addElement(s));
        cmbTrener.setModel(m);


    }
      
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
      private void postaviKategorija() {
          ComboBoxModel<Kategorija> m = cmbKategorija.getModel();
        for (int i = 0; i < m.getSize(); i++) {
            if (m.getElementAt(i).getSifra().equals(
                    obrada.getEntitet().getKategorija().getSifra())) {
                cmbKategorija.setSelectedIndex(i);
                break;
            }
        }
    }
      
       private void postaviTrener() {
          ComboBoxModel<Trener> m = cmbTrener.getModel();
        for (int i = 0; i < m.getSize(); i++) {
            if (m.getElementAt(i).getSifra().equals(
                    obrada.getEntitet().getTrener().getSifra())) {
                cmbTrener.setSelectedIndex(i);
                break;
            }
        }
    }
      
      
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
      
<<<<<<< HEAD
=======
=======
    }
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

<<<<<<< HEAD
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
=======
<<<<<<< HEAD
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
=======
<<<<<<< HEAD
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
=======
        jScrollPane1 = new javax.swing.JScrollPane();
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
<<<<<<< HEAD
        jLabel5 = new javax.swing.JLabel();
=======
<<<<<<< HEAD
        jLabel5 = new javax.swing.JLabel();
=======
<<<<<<< HEAD
        jLabel5 = new javax.swing.JLabel();
=======
<<<<<<< HEAD
        jLabel5 = new javax.swing.JLabel();
        txtDatumRodenja = new javax.swing.JTextField();
=======
<<<<<<< HEAD
        jLabel5 = new javax.swing.JLabel();
        txtDatumRodenja = new javax.swing.JTextField();
=======
        txtKategorija = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDatumRodenja = new javax.swing.JTextField();
        txtTreneri = new javax.swing.JTextField();
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
        jLabel6 = new javax.swing.JLabel();
        btnGetIP = new javax.swing.JButton();
        btnGenOib = new javax.swing.JButton();
        btnDodajNovi = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
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
        btnTrazi = new javax.swing.JButton();
        txtUvjet = new javax.swing.JTextField();
        cmbKategorija = new javax.swing.JComboBox<>();
        cmbTrener = new javax.swing.JComboBox<>();
<<<<<<< HEAD
        dpDatumRodenja = new com.github.lgooddatepicker.components.DatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
=======
<<<<<<< HEAD
        dpDatumRodenja = new com.github.lgooddatepicker.components.DatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
=======
<<<<<<< HEAD
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
=======

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        txtOib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOibActionPerformed(evt);
            }
        });

        jLabel4.setText("Kategorija");

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
        jLabel5.setText("Datum Rođenja");

        jLabel6.setText("Trener");

        btnGetIP.setText("Get IP");
        btnGetIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetIPActionPerformed(evt);
            }
        });

        btnGenOib.setText("GenOIB");
        btnGenOib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenOibActionPerformed(evt);
            }
        });

        btnDodajNovi.setText("Dodaj novi");
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

        btnTrazi.setText("Trazi");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
        txtUvjet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUvjetActionPerformed(evt);
            }
        });
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
        txtUvjet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUvjetKeyPressed(evt);
            }
        });

        cmbKategorija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKategorijaActionPerformed(evt);
            }
        });

        cmbTrener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTrenerActionPerformed(evt);
            }
        });
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
        txtKategorija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKategorijaActionPerformed(evt);
            }
        });

        jLabel5.setText("Datum Rođenja");

        jLabel6.setText("Treneri");

        btnGetIP.setText("Get IP");

        btnGenOib.setText("GenOIB");

        btnDodajNovi.setText("Dodaj novi");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUvjet)
                        .addGap(18, 18, 18)
                        .addComponent(btnTrazi)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
<<<<<<< HEAD
                                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
<<<<<<< HEAD
                                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
<<<<<<< HEAD
                                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtDatumRodenja, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOib, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDodajNovi)
                                .addGap(26, 26, 26)
                                .addComponent(btnPromjeni)
                                .addGap(26, 26, 26)))
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGenOib)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnObrisi)
                                .addComponent(btnGetIP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbKategorija, 0, 173, Short.MAX_VALUE)
                            .addComponent(cmbTrener, 0, 173, Short.MAX_VALUE)
<<<<<<< HEAD
                            .addComponent(dpDatumRodenja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
=======
<<<<<<< HEAD
                            .addComponent(dpDatumRodenja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
=======
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
=======
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnObrisi)
                                .addComponent(btnGetIP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnGenOib, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbKategorija, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTrener, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
<<<<<<< HEAD
=======
=======
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtKategorija, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDatumRodenja, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTreneri, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOib, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodajNovi)
                        .addGap(26, 26, 26)
                        .addComponent(btnPromjeni)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnObrisi)
                        .addComponent(btnGetIP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGenOib, javax.swing.GroupLayout.Alignment.TRAILING))
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
                .addContainerGap())
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnTrazi)
                    .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
                        .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btnGetIP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGenOib))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
                        .addComponent(cmbKategorija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                        .addComponent(dpDatumRodenja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
<<<<<<< HEAD
                        .addComponent(dpDatumRodenja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addComponent(cmbTrener, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
                        .addComponent(cmbKategorija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
=======
<<<<<<< HEAD
                        .addComponent(cmbKategorija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
=======
                        .addComponent(txtKategorija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDatumRodenja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                        .addComponent(cmbTrener, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
<<<<<<< HEAD
                        .addComponent(cmbTrener, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
                        .addComponent(txtTreneri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPromjeni)
                            .addComponent(btnObrisi)
                            .addComponent(btnDodajNovi)))
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
<<<<<<< HEAD
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
                    .addComponent(jScrollPane1))
                .addContainerGap(13, Short.MAX_VALUE))
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
        );

        pack();
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
    }// </editor-fold>//GEN-END:initComponents

    private void txtOibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOibActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOibActionPerformed

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
    private void cmbKategorijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKategorijaActionPerformed
        
    }//GEN-LAST:event_cmbKategorijaActionPerformed

    private void cmbTrenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTrenerActionPerformed
       
    }//GEN-LAST:event_cmbTrenerActionPerformed

    private void btnDodajNoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajNoviActionPerformed
       try {
            obrada.setEntitet(new Boksac());
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

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        ucitaj();
    }//GEN-LAST:event_btnTraziActionPerformed

    private void txtUvjetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjetKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            ucitaj();
        }
    }//GEN-LAST:event_txtUvjetKeyPressed

    private void btnGetIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetIPActionPerformed
        Osoba o = Pomocno.getgenIP();
      if(o==null){
          return;
      }
      txtIme.setText(o.getIme());
        txtPrezime.setText(o.getPrezime());
    }//GEN-LAST:event_btnGetIPActionPerformed

    private void btnGenOibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenOibActionPerformed
        txtOib.setText(Pomocno.getGenOIB());
    }//GEN-LAST:event_btnGenOibActionPerformed

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
    private void txtUvjetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUvjetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUvjetActionPerformed

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
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
    /**
     * @param args the command line arguments
     */
   
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
    private void txtKategorijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKategorijaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKategorijaActionPerformed

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
            java.util.logging.Logger.getLogger(ViewBoksac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewBoksac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewBoksac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewBoksac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewBoksac().setVisible(true);
            }
        });
    }
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajNovi;
    private javax.swing.JButton btnGenOib;
    private javax.swing.JButton btnGetIP;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
    private javax.swing.JButton btnTrazi;
    private javax.swing.JComboBox<Kategorija> cmbKategorija;
    private javax.swing.JComboBox<Trener> cmbTrener;
    private com.github.lgooddatepicker.components.DatePicker dpDatumRodenja;
    private com.toedter.calendar.JDateChooser jDateChooser2;
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
    private javax.swing.JButton btnTrazi;
    private javax.swing.JComboBox<Kategorija> cmbKategorija;
    private javax.swing.JComboBox<Trener> cmbTrener;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
=======
<<<<<<< HEAD
    private javax.swing.JButton btnTrazi;
    private javax.swing.JComboBox<Kategorija> cmbKategorija;
    private javax.swing.JComboBox<Trener> cmbTrener;
=======
<<<<<<< HEAD
    private javax.swing.JButton btnTrazi;
    private javax.swing.JComboBox<Kategorija> cmbKategorija;
    private javax.swing.JComboBox<Trener> cmbTrener;
=======
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
<<<<<<< HEAD
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Boksac> lstPodaci;
=======
<<<<<<< HEAD
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Boksac> lstPodaci;
=======
<<<<<<< HEAD
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Boksac> lstPodaci;
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Boksac> lstPodaci;
    private javax.swing.JTextField txtDatumRodenja;
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtOib;
    private javax.swing.JTextField txtPrezime;
    private javax.swing.JTextField txtUvjet;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDatumRodenja;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtKategorija;
    private javax.swing.JTextField txtOib;
    private javax.swing.JTextField txtPrezime;
    private javax.swing.JTextField txtTreneri;
>>>>>>> 644a78ad43d18bb645c333b3ae2fffa980f11bf8
>>>>>>> 8bb869f8b92c3a5b32fe77188c0feea924659ee2
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
    // End of variables declaration//GEN-END:variables
}

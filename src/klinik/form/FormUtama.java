/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormUtama.java
 *
 * Created on Feb 20, 2012, 10:26:03 PM
 */
package klinik.form;

import java.awt.AWTException;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import usu.widget.Form;

/**
 *
 * @author fendi
 */
public class FormUtama extends Form {

    /** Creates new form FormUtama */
    private static final long serialVersionUID = 1L;

    public FormUtama() {
        initComponents();
        setMinimumSize(new Dimension(925, 700));
//        this.setResizable(false);
        setLocationRelativeTo(null);
        initActions();
    }

    public void initActions() {
        //MenuUtama
        menuUtama1.addActionListenerPasien(new AksiButton_MenuUtama_Pasien());
        menuUtama1.addActionListenerPeriksa(new AksiButton_MenuUtama_Periksa());
        menuUtama1.addActionListenerPembayaran(new AksiButton_MenuUtama_Pembayaran());
        menuUtama1.addActionListenerObat(new AksiButton_MenuUtama_Obat());
        menuUtama1.addActionListenerDokter(new AksiButton_MenuUtama_Dokter());
        menuUtama1.addActionListenerUser(new AksiButton_MenuUtama_User());
        menuUtama1.addActionListenerLaporan(new AksiButton_MenuUtama_Laporan());
    }

    void showPanel(Component panel, String card) {
        try {
            if (panel.isVisible()) {
                return;
            }
            glasspane.startTransition(panelBacground1);
            ((CardLayout) jPanel1.getLayout()).show(jPanel1, card);
        } catch (AWTException ex) {
            Logger.getLogger(FormUtama.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void setTitleBody(String title) {
        if (title == null) {
            label2.setText("Klinik Beranda");
        } else {
            label2.setText(label2.getText() + " : " + title);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        glasspane = new usu.widget.GlassPane();
        about1 = new klinik.form.About();
        panelBacground1 = new klinik.form.template.PanelBacground();
        panelBacground3 = new klinik.form.template.PanelBacground();
        label1 = new klinik.form.template.Label();
        label2 = new klinik.form.template.Label();
        jPanel1 = new javax.swing.JPanel();
        menuUtama1 = new klinik.form.MenuUtama();
        menuPasien1 = new klinik.form.MenuPasien();
        menuPeriksa1 = new klinik.form.MenuPeriksa();
        panelBacground2 = new klinik.form.template.PanelBacground();
        button1 = new klinik.form.template.Button();
        button2 = new klinik.form.template.Button();
        button3 = new klinik.form.template.Button();

        setGlassPane(glasspane);
        getGlassPane().setVisible(true);
        glasspane.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 6, 6));

        about1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setText("Copyright by Lia");

        javax.swing.GroupLayout panelBacground3Layout = new javax.swing.GroupLayout(panelBacground3);
        panelBacground3.setLayout(panelBacground3Layout);
        panelBacground3Layout.setHorizontalGroup(
            panelBacground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBacground3Layout.createSequentialGroup()
                .addContainerGap(789, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBacground3Layout.setVerticalGroup(
            panelBacground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBacground3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label2.setText("Klinik Beranda");
        label2.setFont(new java.awt.Font("Tahoma", 1, 24));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.CardLayout());
        jPanel1.add(menuUtama1, "BERANDA");
        jPanel1.add(menuPasien1, "PASIEN");
        jPanel1.add(menuPeriksa1, "PERIKSA");

        javax.swing.GroupLayout panelBacground1Layout = new javax.swing.GroupLayout(panelBacground1);
        panelBacground1.setLayout(panelBacground1Layout);
        panelBacground1Layout.setHorizontalGroup(
            panelBacground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBacground3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBacground1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelBacground1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
                .addGap(101, 101, 101))
        );
        panelBacground1Layout.setVerticalGroup(
            panelBacground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBacground1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBacground3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(panelBacground1, java.awt.BorderLayout.CENTER);

        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klinik/form/ico/About.png"))); // NOI18N
        button1.setText("tentang");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klinik/form/ico/exit.png"))); // NOI18N
        button2.setText("logout");

        button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klinik/form/ico/home-ico.png"))); // NOI18N
        button3.setText("beranda");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBacground2Layout = new javax.swing.GroupLayout(panelBacground2);
        panelBacground2.setLayout(panelBacground2Layout);
        panelBacground2Layout.setHorizontalGroup(
            panelBacground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBacground2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 575, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBacground2Layout.setVerticalGroup(
            panelBacground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBacground2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBacground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(panelBacground2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void about1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about1ActionPerformed
        // TODO add your handling code here:
        glasspane.hideComponent();
}//GEN-LAST:event_about1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        glasspane.showComponent(about1);
    }//GEN-LAST:event_button1ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
       
        showPanel(FormUtama.this.menuUtama1, "BERANDA");
        setTitleBody(null);
    }//GEN-LAST:event_button3ActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private klinik.form.About about1;
    private klinik.form.template.Button button1;
    private klinik.form.template.Button button2;
    private klinik.form.template.Button button3;
    usu.widget.GlassPane glasspane;
    private javax.swing.JPanel jPanel1;
    private klinik.form.template.Label label1;
    private klinik.form.template.Label label2;
    private klinik.form.MenuPasien menuPasien1;
    private klinik.form.MenuPeriksa menuPeriksa1;
    private klinik.form.MenuUtama menuUtama1;
    private klinik.form.template.PanelBacground panelBacground1;
    private klinik.form.template.PanelBacground panelBacground2;
    private klinik.form.template.PanelBacground panelBacground3;
    // End of variables declaration//GEN-END:variables

    //start action button menu utama
    class AksiButton_MenuUtama_Pasien implements ActionListener {

        public void actionPerformed(final ActionEvent e) {
            System.out.println("pasien");
            showPanel(FormUtama.this.menuPasien1, "PASIEN");
            setTitleBody("Pasien");
//         setTitleBody("Laporan : Pengembalian");
        }
    }

    class AksiButton_MenuUtama_Periksa implements ActionListener {

        public void actionPerformed(final ActionEvent e) {
            System.out.println("periksa");
             showPanel(FormUtama.this.menuPasien1, "PERIKSA");
            setTitleBody("Periksa");
        }
    }

    class AksiButton_MenuUtama_Pembayaran implements ActionListener {

        public void actionPerformed(final ActionEvent e) {
            System.out.println("pembayaran");
        }
    }

    class AksiButton_MenuUtama_Obat implements ActionListener {

        public void actionPerformed(final ActionEvent e) {
            System.out.println("obat");
        }
    }

    class AksiButton_MenuUtama_Dokter implements ActionListener {

        public void actionPerformed(final ActionEvent e) {
            System.out.println("Dokter");
        }
    }

    class AksiButton_MenuUtama_User implements ActionListener {

        public void actionPerformed(final ActionEvent e) {
            System.out.println("user");
        }
    }

    class AksiButton_MenuUtama_Laporan implements ActionListener {

        public void actionPerformed(final ActionEvent e) {
            System.out.println("laporan");
        }
    }
    //end action button menu utama
}

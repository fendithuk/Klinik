/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MenuUtama.java
 *
 * Created on Feb 20, 2012, 10:47:30 PM
 */
package klinik.form;

import java.awt.event.ActionListener;

/**
 *
 * @author fendi
 */
public class MenuUtama extends javax.swing.JPanel {

    /** Creates new form MenuUtama */
    private static final long serialVersionUID = 1L;

    public MenuUtama() {
        initComponents();
    }

    public void addActionListenerPasien(ActionListener l) {
        buttonPasien.addActionListener(l);
    }

    public void addActionListenerPeriksa(ActionListener l) {
        buttonPeriksa.addActionListener(l);
    }

    public void addActionListenerPembayaran(ActionListener l) {
        buttonPembayaran.addActionListener(l);
    }

    public void addActionListenerObat(ActionListener l) {
        buttonObat.addActionListener(l);
    }

    public void addActionListenerDokter(ActionListener l) {
        buttonDokter.addActionListener(l);
    }

    public void addActionListenerUser(ActionListener l) {
        buttonUser.addActionListener(l);
    }

    public void addActionListenerLaporan(ActionListener l) {
        buttonLaporan.addActionListener(l);
    }

   

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPembayaran = new klinik.form.template.ButtonBig();
        buttonPasien = new klinik.form.template.ButtonBig();
        buttonPeriksa = new klinik.form.template.ButtonBig();
        buttonObat = new klinik.form.template.ButtonBig();
        buttonDokter = new klinik.form.template.ButtonBig();
        buttonUser = new klinik.form.template.ButtonBig();
        buttonLaporan = new klinik.form.template.ButtonBig();

        setOpaque(false);

        buttonPembayaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klinik/form/ico/MedicalBillingIcon copy.png"))); // NOI18N
        buttonPembayaran.setText("Pembayaran");

        buttonPasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klinik/form/ico/patient copy.png"))); // NOI18N
        buttonPasien.setText("Pasien");

        buttonPeriksa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klinik/form/ico/1329636407_stetiscoop.png"))); // NOI18N
        buttonPeriksa.setText("Periksa");

        buttonObat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klinik/form/ico/obat.png"))); // NOI18N
        buttonObat.setText("Obat");

        buttonDokter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klinik/form/ico/dokter.png"))); // NOI18N
        buttonDokter.setText("Dokter");

        buttonUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klinik/form/ico/People.png"))); // NOI18N
        buttonUser.setText("User");

        buttonLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klinik/form/ico/billing.png"))); // NOI18N
        buttonLaporan.setText("Laporan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(buttonPasien, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addGap(55, 55, 55)
                .addComponent(buttonPeriksa, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addGap(53, 53, 53)
                .addComponent(buttonPembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(buttonObat, javax.swing.GroupLayout.PREFERRED_SIZE, 153, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(buttonDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(buttonUser, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(buttonLaporan, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonPasien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPeriksa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private klinik.form.template.ButtonBig buttonDokter;
    private klinik.form.template.ButtonBig buttonLaporan;
    private klinik.form.template.ButtonBig buttonObat;
    private klinik.form.template.ButtonBig buttonPasien;
    private klinik.form.template.ButtonBig buttonPembayaran;
    private klinik.form.template.ButtonBig buttonPeriksa;
    private klinik.form.template.ButtonBig buttonUser;
    // End of variables declaration//GEN-END:variables
}

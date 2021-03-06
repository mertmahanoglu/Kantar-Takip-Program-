/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingokulprojesicifttablolu;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mert
 */
public class FmGiris extends javax.swing.JFrame {

    DefaultTableModel model;
     DbGiris islemler = new DbGiris();
     Clock clock = new Clock();
     

    /**
     * Creates new form FmGiris
     */
    
     public void temizle()
     {
     TbSaat.setText("");
     TbAgirlik.setText("");
     TbKayit.setText("");
     TbMarka.setText("");
     TbSoför.setText("");
     TbTarih.setText("");
     TbPlaka.setText("");
     }
    
      public void aracGoruntule()
    {
        model.setRowCount(0);
        ArrayList<AracBilgileri> araclar = new ArrayList<AracBilgileri>();
        araclar = islemler.GirisAraclariGetir();
        
        if (araclar!=null) {
            for(AracBilgileri item : araclar)
            {
             Object[] eklenecek = {item.getAracnumarasi(),item.getPlaka(),item.getGirisAgirligi(),item.getGirisSaati(),item.getGirisTarihi(),item.getSoför(),item.getKayiteden(),item.getMarka()};
             model.addRow(eklenecek);
            }
        }
        
    } 
    public FmGiris() {
        initComponents();
        clock.Clock(lblSaatTarih);
        model = (DefaultTableModel)tableArac.getModel();
         lblKullanici.setText("Hoşgeldiniz.... "+FmLogin.SendUsername);
        aracGoruntule();
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
        tableArac = new javax.swing.JTable();
        TbSoför = new javax.swing.JTextField();
        btnKayit = new javax.swing.JButton();
        lblPlaka = new javax.swing.JLabel();
        lblAgirlik = new javax.swing.JLabel();
        lblSaat = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTarih = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSoför = new javax.swing.JLabel();
        TbKayit = new javax.swing.JTextField();
        TbPlaka = new javax.swing.JTextField();
        TbMarka = new javax.swing.JTextField();
        TbAgirlik = new javax.swing.JTextField();
        TbTarih = new javax.swing.JTextField();
        TbSaat = new javax.swing.JTextField();
        panel1 = new java.awt.Panel();
        lblKullanici = new javax.swing.JLabel();
        lblSaatTarih = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblEkran = new javax.swing.JLabel();
        lblCikis = new javax.swing.JLabel();
        lblRapor = new javax.swing.JLabel();
        lblSil = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));

        tableArac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Araç Numarası", "Plaka", "Giriş Ağırlığı", "Giriş Saati", "Giriş Tarihi", "Şoför", "Kayıt Eden", "Marka"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableArac.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableArac);

        btnKayit.setBackground(new java.awt.Color(54, 70, 74));
        btnKayit.setForeground(new java.awt.Color(255, 255, 255));
        btnKayit.setText("Kayıt");
        btnKayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKayitActionPerformed(evt);
            }
        });

        lblPlaka.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPlaka.setText("Plaka :");

        lblAgirlik.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAgirlik.setText("Giriş Ağırlığı :");

        lblSaat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSaat.setText("Giriş Saati :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Kayıt Eden :");

        lblTarih.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTarih.setText("Giriş Tarihi :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Marka :");

        lblSoför.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSoför.setText("Şoför :");

        panel1.setBackground(new java.awt.Color(54, 70, 78));
        panel1.setForeground(new java.awt.Color(255, 255, 255));

        lblKullanici.setBackground(new java.awt.Color(54, 70, 78));
        lblKullanici.setForeground(new java.awt.Color(255, 255, 255));
        lblKullanici.setText("Kullanıcı :");

        lblSaatTarih.setForeground(new java.awt.Color(255, 255, 255));
        lblSaatTarih.setText("Saat/Tarih :");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(lblKullanici, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSaatTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKullanici)
                    .addComponent(lblSaatTarih)))
        );

        jPanel3.setBackground(new java.awt.Color(54, 70, 78));

        lblEkran.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblEkran.setForeground(new java.awt.Color(255, 255, 255));
        lblEkran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swingokulprojesicifttablolu/icons8-home-36.png"))); // NOI18N
        lblEkran.setText("Ana Ekrana Dön");
        lblEkran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEkranMouseClicked(evt);
            }
        });

        lblCikis.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblCikis.setForeground(new java.awt.Color(255, 255, 255));
        lblCikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swingokulprojesicifttablolu/icons8-logout-rounded-left-64.png"))); // NOI18N
        lblCikis.setText(" Çıkış");
        lblCikis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCikisMouseClicked(evt);
            }
        });

        lblRapor.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblRapor.setForeground(new java.awt.Color(255, 255, 255));
        lblRapor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swingokulprojesicifttablolu/icons8-business-report-64.png"))); // NOI18N
        lblRapor.setText("Rapor");
        lblRapor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRaporMouseClicked(evt);
            }
        });

        lblSil.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblSil.setForeground(new java.awt.Color(255, 255, 255));
        lblSil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swingokulprojesicifttablolu/icons8-delete-64.png"))); // NOI18N
        lblSil.setText(" Sil");
        lblSil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSilMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRapor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(lblCikis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblEkran, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEkran, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblRapor, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSil, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swingokulprojesicifttablolu/Adsız3.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAgirlik)
                                    .addComponent(lblSaat)
                                    .addComponent(lblPlaka)
                                    .addComponent(lblTarih))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(TbSaat, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TbTarih))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TbAgirlik))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TbPlaka, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(lblSoför))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TbSoför, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                        .addComponent(TbKayit)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(49, 49, 49)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TbMarka)))))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPlaka)
                            .addComponent(TbPlaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAgirlik)
                            .addComponent(TbAgirlik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSaat)
                            .addComponent(TbSaat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTarih)
                            .addComponent(TbTarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSoför)
                            .addComponent(TbSoför, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TbKayit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(TbMarka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKayitActionPerformed

        String plaka = TbPlaka.getText();
        String girisAgirligi = TbAgirlik.getText();
        String girisSaati = TbSaat.getText();
        String girisTarihi = TbTarih.getText();
        String soför = TbSoför.getText();
        String kayiteden = TbKayit.getText();
        String marka = TbMarka.getText();

        islemler.aracEkleGiris(plaka,girisAgirligi,girisSaati,girisTarihi,soför,kayiteden,marka);
        aracGoruntule();
        islemler.aracSayisi++;
      

        JOptionPane.showMessageDialog(this, "Başarıyla Kayıt Edildi!");
        temizle();

    }//GEN-LAST:event_btnKayitActionPerformed

    private void lblEkranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEkranMouseClicked
       FmHome home = new FmHome();
        this.setVisible(false);
        home.setVisible(true);

    }//GEN-LAST:event_lblEkranMouseClicked

    private void lblCikisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCikisMouseClicked
        FmCikis cikis = new FmCikis();
        this.setVisible(false);
        cikis.setVisible(true);
    }//GEN-LAST:event_lblCikisMouseClicked

    private void lblRaporMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRaporMouseClicked
        FmSorgu sorgu = new FmSorgu();
        this.setVisible(false);
        sorgu.setVisible(true);
    }//GEN-LAST:event_lblRaporMouseClicked

    private void lblSilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSilMouseClicked
        int selectedRow =  tableArac.getSelectedRow();

        if (selectedRow==-1) {

            if (model.getRowCount()==0) {

                JOptionPane.showMessageDialog(this, "Tablo Şu Anda Boş!");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Lütfen Silinecek Bir Araç Seçin!!");
            }

        }
        else
        {
            int id = (int)model.getValueAt(selectedRow, 0);

            islemler.aracSil(id);
            aracGoruntule();
            JOptionPane.showMessageDialog(this, "Başarıyla Silindi!");

        }
    }//GEN-LAST:event_lblSilMouseClicked

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
            java.util.logging.Logger.getLogger(FmGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmGiris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TbAgirlik;
    private javax.swing.JTextField TbKayit;
    private javax.swing.JTextField TbMarka;
    private javax.swing.JTextField TbPlaka;
    private javax.swing.JTextField TbSaat;
    private javax.swing.JTextField TbSoför;
    private javax.swing.JTextField TbTarih;
    private javax.swing.JButton btnKayit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgirlik;
    private javax.swing.JLabel lblCikis;
    private javax.swing.JLabel lblEkran;
    private javax.swing.JLabel lblKullanici;
    private javax.swing.JLabel lblPlaka;
    private javax.swing.JLabel lblRapor;
    private javax.swing.JLabel lblSaat;
    private javax.swing.JLabel lblSaatTarih;
    private javax.swing.JLabel lblSil;
    private javax.swing.JLabel lblSoför;
    private javax.swing.JLabel lblTarih;
    private java.awt.Panel panel1;
    private javax.swing.JTable tableArac;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingokulprojesicifttablolu;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Mert
 */
public class FmSorgu extends javax.swing.JFrame {
     DefaultTableModel model;
   DbGiris islemler = new DbGiris();
   Clock clock = new Clock();

    /**
     * Creates new form FmSorgu
     */
   
    public void dinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tableArac.setRowSorter(tr);

        tr.setRowFilter(RowFilter.regexFilter(ara));

    }
    
      public void aracGoruntule()
    {
        model.setRowCount(0);
        ArrayList<CikisAracBilgileri> araclar = new ArrayList<CikisAracBilgileri>();
        araclar = islemler.CikisAraclariGetir();
        
        if (araclar!=null) {
            for(CikisAracBilgileri item : araclar)
            {
             Object[] eklenecek = {item.getAracnumarasi(),item.getPlaka(),item.getGirisAgirligi(),item.getGirisSaati(),item.getGirisTarihi(),item.getSoför(),item.getCikisAgirligi(),item.getCikisSaati(),item.getCikisTarihi(),item.getKayiteden(),item.getMarka()};
             model.addRow(eklenecek);
            }
        }
        
    }
    public FmSorgu() {
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

        jLabel1 = new javax.swing.JLabel();
        sorgulamaTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableArac = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblKullanici = new javax.swing.JLabel();
        lblSaatTarih = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblEkran = new javax.swing.JLabel();
        lblCikis = new javax.swing.JLabel();
        lblGiris = new javax.swing.JLabel();
        lblSil = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Sorgulamak İstediğiniz Bilgiyi Girin :");

        sorgulamaTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sorgulamaTFKeyReleased(evt);
            }
        });

        tableArac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Araç Numarası", "Plaka", "Giriş Ağırlığı", "Giriş Saati", "Giriş Tarihi", "Şoför", "Çıkış Ağırlığı", "Çıkış Saati", "Çıkış Tarihi", "Kayıt Eden", "Marka"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableArac.getTableHeader().setReorderingAllowed(false);
        tableArac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAracMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableArac);

        jPanel1.setBackground(new java.awt.Color(54, 70, 78));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblKullanici.setForeground(new java.awt.Color(255, 255, 255));
        lblKullanici.setText("Kullanıcı :");

        lblSaatTarih.setForeground(new java.awt.Color(255, 255, 255));
        lblSaatTarih.setText("Saat/Tarih :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblKullanici, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSaatTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKullanici)
                    .addComponent(lblSaatTarih)))
        );

        jPanel3.setBackground(new java.awt.Color(54, 70, 78));

        lblEkran.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEkran.setForeground(new java.awt.Color(255, 255, 255));
        lblEkran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swingokulprojesicifttablolu/icons8-home-36.png"))); // NOI18N
        lblEkran.setText("   Ana Ekrana Dön");
        lblEkran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEkranMouseClicked(evt);
            }
        });

        lblCikis.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblCikis.setForeground(new java.awt.Color(255, 255, 255));
        lblCikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swingokulprojesicifttablolu/icons8-logout-rounded-left-64.png"))); // NOI18N
        lblCikis.setText("Çıkış");
        lblCikis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCikisMouseClicked(evt);
            }
        });

        lblGiris.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblGiris.setForeground(new java.awt.Color(255, 255, 255));
        lblGiris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swingokulprojesicifttablolu/icons8-enter-64.png"))); // NOI18N
        lblGiris.setText("Giriş");
        lblGiris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGirisMouseClicked(evt);
            }
        });

        lblSil.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblSil.setForeground(new java.awt.Color(255, 255, 255));
        lblSil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swingokulprojesicifttablolu/icons8-delete-64.png"))); // NOI18N
        lblSil.setText("Sil");
        lblSil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSilMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEkran, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
            .addComponent(lblCikis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblGiris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblSil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEkran, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sorgulamaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1048, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(sorgulamaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 517, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sorgulamaTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sorgulamaTFKeyReleased

        String ara = sorgulamaTF.getText();
        dinamikAra(ara);
    }//GEN-LAST:event_sorgulamaTFKeyReleased

    private void tableAracMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAracMouseClicked

       

    }//GEN-LAST:event_tableAracMouseClicked

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

    private void lblGirisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGirisMouseClicked
       FmGiris giris = new FmGiris();
        this.setVisible(false);
        giris.setVisible(true);
    }//GEN-LAST:event_lblGirisMouseClicked

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
            java.util.logging.Logger.getLogger(FmSorgu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmSorgu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmSorgu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmSorgu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmSorgu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCikis;
    private javax.swing.JLabel lblEkran;
    private javax.swing.JLabel lblGiris;
    private javax.swing.JLabel lblKullanici;
    private javax.swing.JLabel lblSaatTarih;
    private javax.swing.JLabel lblSil;
    private javax.swing.JTextField sorgulamaTF;
    private javax.swing.JTable tableArac;
    // End of variables declaration//GEN-END:variables
}

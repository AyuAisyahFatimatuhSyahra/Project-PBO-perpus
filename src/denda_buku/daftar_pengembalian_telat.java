/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package denda_buku;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import pendaftaran_buku.Daftar_buku_option;
import sistem_informasi_perpustakaan.connection.db_connection;

/**
 *
 * @author asus
 */
public class daftar_pengembalian_telat extends javax.swing.JFrame {

    /**
     * Creates new form notif
     */
    public daftar_pengembalian_telat() {
        initComponents();
        tampil_notif();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNotifikasi = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jButtonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 40, 40));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Daftar Peminjaman");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 240, -1));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Belum Dikembalikan (Terlambat)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 370, -1));

        jTableNotifikasi.setBackground(new java.awt.Color(148, 61, 21));
        jTableNotifikasi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTableNotifikasi.setForeground(new java.awt.Color(255, 255, 255));
        jTableNotifikasi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableNotifikasi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 390, 190));

        jPanel1.setBackground(new java.awt.Color(148,61,21,70));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(102, 0, 102), new java.awt.Color(0, 0, 255), new java.awt.Color(102, 0, 102)));
        jPanel1.setForeground(new java.awt.Color(163, 9, 9));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 410, 330));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bu.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tampil_notif(){ //method untuk menampilkan joption pengembalian yang telat
        
        String nama = null;
        int id_peminjaman = 0;
        String tgl = null;
        
        DefaultTableModel tb = new DefaultTableModel();
        tb.addColumn("Member");
        tb.addColumn("Id Peminjaman");
        tb.addColumn("Deadline");
        jTableNotifikasi.setModel(tb);
        
        Connection conn = db_connection.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        String sql;
        
        sql ="SELECT tb_member.nama,tb_peminjaman.id, tb_peminjaman.tgl_kembali FROM tb_peminjaman INNER JOIN tb_member ON tb_peminjaman.member_id = tb_member.id WHERE (SELECT COUNT(tb_detail_peminjaman.id) FROM tb_detail_peminjaman WHERE tb_detail_peminjaman.peminjaman_id = tb_peminjaman.id) != (SELECT COUNT(tb_detail_pengembalian.id) FROM tb_detail_pengembalian INNER JOIN tb_pengembalian ON tb_detail_pengembalian.pengembalian_id = tb_pengembalian.id WHERE tb_pengembalian.peminjaman_id = tb_peminjaman.id);";
        
        Date tanggal = new Date();
        SimpleDateFormat dateNow = new SimpleDateFormat("yyy-MM-dd");//menentukan format tanggal (tahun-bulan-hari)
        String nowDate = dateNow.format(tanggal);// menyimpan tanggal sekarang ke dalam variabel yg bertipe string
        

        LocalDate tgl_kembali;
        LocalDate tgl_sekarang;
        
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                nama = rs.getString(1);
                id_peminjaman=rs.getInt(2);
                tgl= rs.getString(3);
                tgl_kembali = LocalDate.parse(tgl, DateTimeFormatter.ISO_DATE);
                tgl_sekarang = LocalDate.parse(nowDate, DateTimeFormatter.ISO_DATE);
                if (tgl_sekarang.isAfter(tgl_kembali)) {
                    tb.addRow(new Object[]{
                        nama,id_peminjaman,tgl
                    });
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(daftar_denda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Daftar_buku_option daftar_buku_option = new Daftar_buku_option();
        daftar_buku_option.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

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
            java.util.logging.Logger.getLogger(daftar_pengembalian_telat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(daftar_pengembalian_telat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(daftar_pengembalian_telat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(daftar_pengembalian_telat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new daftar_pengembalian_telat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableNotifikasi;
    // End of variables declaration//GEN-END:variables
}

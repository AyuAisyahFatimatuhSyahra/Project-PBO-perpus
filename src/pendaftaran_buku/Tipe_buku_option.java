/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftaran_buku;

import java.awt.Cursor;
import pencarian_buku.Pencarian_buku_option;
import pencarian_buku.Searching;

/**
 *
 * @author Daniel
 */
public class Tipe_buku_option extends javax.swing.JFrame {
    int from;//0 daftar_buku_option(daftar buku),1 search,2 daftar_buku_option(edit buku)
    int mode;//mode pencarian kalau misalnya dibuka dari search(0 search by title, 1 search by author, 2 search by publisher) 4 dari daftar buku option
    /**
     * Creates new form Tipe_buku_option
     */
    public Tipe_buku_option(int from,int mode) {
        this.from = from;
        this.mode = mode;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    public Tipe_buku_option() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_buku = new javax.swing.JLabel();
        btn_journal = new javax.swing.JLabel();
        btn_majalah = new javax.swing.JLabel();
        btn_back = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_buku.setFont(new java.awt.Font("NSimSun", 1, 24)); // NOI18N
        btn_buku.setForeground(new java.awt.Color(255, 255, 255));
        btn_buku.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_buku.setText("Buku");
        btn_buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_bukuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_bukuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_bukuMouseExited(evt);
            }
        });
        getContentPane().add(btn_buku, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 100, 30));

        btn_journal.setFont(new java.awt.Font("NSimSun", 1, 24)); // NOI18N
        btn_journal.setForeground(new java.awt.Color(255, 255, 255));
        btn_journal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_journal.setText("Journal");
        btn_journal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_journalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_journalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_journalMouseExited(evt);
            }
        });
        getContentPane().add(btn_journal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 100, 30));

        btn_majalah.setFont(new java.awt.Font("NSimSun", 1, 24)); // NOI18N
        btn_majalah.setForeground(new java.awt.Color(255, 255, 255));
        btn_majalah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_majalah.setText("Majalah");
        btn_majalah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_majalahMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_majalahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_majalahMouseExited(evt);
            }
        });
        getContentPane().add(btn_majalah, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 100, 30));

        btn_back.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/backyellow50x50.png"))); // NOI18N
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_backMouseExited(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, 50));

        jPanel1.setBackground(new java.awt.Color(148,61,21,70));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(102, 0, 102), new java.awt.Color(0, 0, 255), new java.awt.Color(102, 0, 102)));
        jPanel1.setForeground(new java.awt.Color(163, 9, 9));

        jLabel4.setFont(new java.awt.Font("Algerian", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pilih Tipe Buku");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 290, 290));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bu.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_bukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bukuMouseClicked
        this.dispose();
        if(from == 0){
            Daftar_buku daftar_buku = new Daftar_buku();
            daftar_buku.setVisible(true);
        }
        else if(from == 1){
            Searching searching = new Searching(mode, false,1);
            searching.setVisible(true);
        }
        else if(from == 2){
            Searching searching = new Searching(0, true, 1);
            searching.setVisible(true);
        }

    }//GEN-LAST:event_btn_bukuMouseClicked

    private void btn_journalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_journalMouseClicked
        this.dispose();
        if(from == 0){
            Daftar_journal daftar_journal = new Daftar_journal();
            daftar_journal.setVisible(true);
        }
        else if(from == 1){
            Searching searching = new Searching(mode, false,2);
            searching.setVisible(true);
        }
        else if(from == 2){
            Searching searching = new Searching(0, true, 2);
            searching.setVisible(true);
        }
    }//GEN-LAST:event_btn_journalMouseClicked

    private void btn_majalahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_majalahMouseClicked
        this.dispose();
        if(from == 0){
            Daftar_majalah daftar_majalah = new Daftar_majalah();
            daftar_majalah.setVisible(true);
        }
        else if(from == 1){
            Searching searching = new Searching(mode, false,3);
            searching.setVisible(true);
        }
        else if(from == 2){
            Searching searching = new Searching(0, true, 3);
            searching.setVisible(true);
        }
    }//GEN-LAST:event_btn_majalahMouseClicked

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        this.dispose();
        if(from == 0 || from == 2){
            Daftar_buku_option daftar_buku_option = new Daftar_buku_option();
            daftar_buku_option.setVisible(true); 
        }
        else if(from == 1){
            Pencarian_buku_option pencarian_buku_option = new Pencarian_buku_option();
            pencarian_buku_option.setVisible(true);
        }
    }//GEN-LAST:event_btn_backMouseClicked

    private void btn_bukuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bukuMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_bukuMouseEntered

    private void btn_journalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_journalMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_journalMouseEntered

    private void btn_majalahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_majalahMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_majalahMouseEntered

    private void btn_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_backMouseEntered

    private void btn_bukuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bukuMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btn_bukuMouseExited

    private void btn_journalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_journalMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btn_journalMouseExited

    private void btn_majalahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_majalahMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btn_majalahMouseExited

    private void btn_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseExited
       setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btn_backMouseExited

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
            java.util.logging.Logger.getLogger(Tipe_buku_option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tipe_buku_option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tipe_buku_option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tipe_buku_option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tipe_buku_option().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_back;
    private javax.swing.JLabel btn_buku;
    private javax.swing.JLabel btn_journal;
    private javax.swing.JLabel btn_majalah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

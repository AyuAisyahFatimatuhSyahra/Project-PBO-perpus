/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package peminjaman_pengembalian_buku;

import java.awt.Cursor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import login_admin.login_admin;
import pencarian_buku.Searching;
import pendaftaran_buku.Daftar_buku_option;
import sistem_informasi_perpustakaan.connection.db_connection;


/**
 *
 * @author asus
 */
public class peminjaman_buku extends javax.swing.JFrame {
    public boolean isSearchingOpen = false;
    public int idBuku1 = 0;
    public int idBuku2 = 0;
    public int idBuku3 = 0;
    /**
     * Creates new form peminjaman_buku
     */
    public peminjaman_buku() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        textbox_id = new javax.swing.JTextField();
        validasi_id = new javax.swing.JLabel();
        btn_pinjam = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textbox_buku1 = new javax.swing.JTextField();
        textbox_buku2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_add_buku1 = new javax.swing.JLabel();
        btn_add_buku2 = new javax.swing.JLabel();
        textbox_buku3 = new javax.swing.JTextField();
        btn_add_buku3 = new javax.swing.JLabel();
        validasi_buku = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBack.setBackground(new java.awt.Color(153, 153, 153));
        jButtonBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jButtonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 40, 40));

        jLabel3.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Member");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 20));

        textbox_id.setBackground(new java.awt.Color(148, 61, 21));
        textbox_id.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        textbox_id.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(textbox_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 200, -1));

        validasi_id.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        validasi_id.setForeground(new java.awt.Color(255, 255, 0));
        validasi_id.setText("validasi_id");
        validasi_id.setVisible(false);
        getContentPane().add(validasi_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 290, -1));

        btn_pinjam.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        btn_pinjam.setForeground(new java.awt.Color(51, 51, 51));
        btn_pinjam.setText("Pinjam");
        btn_pinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pinjamMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_pinjamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_pinjamMouseExited(evt);
            }
        });
        getContentPane().add(btn_pinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Buku 1");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        textbox_buku1.setEditable(false);
        textbox_buku1.setBackground(new java.awt.Color(148, 61, 21));
        textbox_buku1.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        textbox_buku1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(textbox_buku1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 200, -1));

        textbox_buku2.setEditable(false);
        textbox_buku2.setBackground(new java.awt.Color(148, 61, 21));
        textbox_buku2.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        textbox_buku2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(textbox_buku2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 200, -1));

        jLabel5.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Buku 2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Buku 3");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        btn_add_buku1.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        btn_add_buku1.setForeground(new java.awt.Color(255, 255, 255));
        btn_add_buku1.setText("Add Buku");
        btn_add_buku1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_add_buku1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_add_buku1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_add_buku1MouseExited(evt);
            }
        });
        getContentPane().add(btn_add_buku1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        btn_add_buku2.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        btn_add_buku2.setForeground(new java.awt.Color(255, 255, 255));
        btn_add_buku2.setText("Add Buku");
        btn_add_buku2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_add_buku2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_add_buku2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_add_buku2MouseExited(evt);
            }
        });
        getContentPane().add(btn_add_buku2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        textbox_buku3.setEditable(false);
        textbox_buku3.setBackground(new java.awt.Color(148, 61, 21));
        textbox_buku3.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        textbox_buku3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(textbox_buku3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 200, -1));

        btn_add_buku3.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        btn_add_buku3.setForeground(new java.awt.Color(255, 255, 255));
        btn_add_buku3.setText("Add Buku");
        btn_add_buku3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_add_buku3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_add_buku3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_add_buku3MouseExited(evt);
            }
        });
        getContentPane().add(btn_add_buku3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        validasi_buku.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        validasi_buku.setForeground(new java.awt.Color(255, 255, 0));
        validasi_buku.setText("Validasi Buku");
        validasi_buku.setVisible(false);
        getContentPane().add(validasi_buku, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, 20));

        jPanel1.setBackground(new java.awt.Color(148,61,21,70));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(102, 0, 102), new java.awt.Color(0, 0, 255), new java.awt.Color(102, 0, 102)));
        jPanel1.setForeground(new java.awt.Color(163, 9, 9));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Peminjaman Buku");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 420, 310));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bu.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Daftar_buku_option daftar_buku_option = new Daftar_buku_option();
        daftar_buku_option.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void btn_add_buku1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_buku1MouseClicked
        if(!isSearchingOpen){
            isSearchingOpen = true;
            Searching searching = new Searching(this,true,1);
            searching.setVisible(true);
        }
    }//GEN-LAST:event_btn_add_buku1MouseClicked

    private void btn_add_buku2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_buku2MouseClicked
        if(!isSearchingOpen){
            isSearchingOpen = true;
            Searching searching = new Searching(this,true,2);
            searching.setVisible(true);
        }
    }//GEN-LAST:event_btn_add_buku2MouseClicked

    private void btn_add_buku3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_buku3MouseClicked
        if(!isSearchingOpen){
            isSearchingOpen = true;
            Searching searching = new Searching(this,true,3);
            searching.setVisible(true);
        }
    }//GEN-LAST:event_btn_add_buku3MouseClicked

    private void btn_pinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pinjamMouseClicked
        boolean idIsValid = idValidation();
        boolean bukuIsValid = bookValidation();
        
        if(idIsValid){
            validasi_id.setVisible(false);
        }
        if(!bukuIsValid){
            if(idBuku1 == 0 && idBuku2 == 0 && idBuku3 == 0){
                validasi_buku.setText("Buku minimal ada 1");
            }
            else{
                validasi_buku.setText("Buku tidak boleh sama");
            }
            validasi_buku.setVisible(true);
        }
        if(idIsValid == true && bukuIsValid == true){
            validasi_id.setVisible(false);
            validasi_buku.setVisible(false);
            insertDataPeminjaman();
            JOptionPane.showConfirmDialog(this,"Data Peminjaman Berhasil Dimasukan !","",JOptionPane.DEFAULT_OPTION);
            this.dispose();
            Daftar_buku_option daftar_buku_option = new Daftar_buku_option();
            daftar_buku_option.setVisible(true);
        }
    }//GEN-LAST:event_btn_pinjamMouseClicked

    private void btn_add_buku1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_buku1MouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_add_buku1MouseEntered

    private void btn_add_buku2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_buku2MouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_add_buku2MouseEntered

    private void btn_add_buku3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_buku3MouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_add_buku3MouseEntered

    private void btn_pinjamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pinjamMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_pinjamMouseEntered

    private void btn_add_buku1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_buku1MouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btn_add_buku1MouseExited

    private void btn_add_buku2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_buku2MouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btn_add_buku2MouseExited

    private void btn_add_buku3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_buku3MouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btn_add_buku3MouseExited

    private void btn_pinjamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pinjamMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btn_pinjamMouseExited
    private boolean idValidation(){
        if(textbox_id.getText().equals("")){
            validasi_id.setText("ID Tidak boleh kosong");
            validasi_id.setVisible(true);
            return false;
        }
        else{
            Connection conn = db_connection.getConnection();
            PreparedStatement ps = null;
            ResultSet rs = null;
            int id = 0;
            String sql = "SELECT COUNT(tb_member.id) FROM tb_member WHERE id = ?;";
            int result = 0;
            try{
                id = Integer.parseInt(textbox_id.getText());
                ps = conn.prepareStatement(sql);
                ps.setInt(1,id);
                rs = ps.executeQuery();
                if(rs.next()){
                    result = rs.getInt(1);
                }
            }
            catch(NumberFormatException exception){
                validasi_id.setText("ID tidak valid");
                validasi_id.setVisible(true);
                return false;
            }
            catch (SQLException ex) {
                Logger.getLogger(peminjaman_buku.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally{
                if(rs != null){
                    try {
                        rs.close();
                    } catch (SQLException e) {
                    }
                }
                if(ps != null){
                    try {
                        ps.close();
                    } catch (SQLException e) {
                    }
                }
                if(conn != null){
                    try {
                        conn.close();
                    } catch (SQLException e) {
                    }
                }
            }
            if(result == 0){
                validasi_id.setText("ID tidak valid");
                validasi_id.setVisible(true);
                return false;
            }
            else{
                int member_result = 0;
                try {
                    conn = db_connection.getConnection();
                    sql = "SELECT COUNT(tb_detail_peminjaman.id) FROM tb_detail_peminjaman INNER JOIN tb_peminjaman ON tb_detail_peminjaman.peminjaman_id = tb_peminjaman.id WHERE tb_detail_peminjaman.status_buku = 'dipinjam' AND tb_peminjaman.member_id = ?;";
                    ps = conn.prepareStatement(sql);
                    ps.setInt(1,id);
                    rs = ps.executeQuery();
                    if(rs.next()){
                        member_result = rs.getInt(1);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(peminjaman_buku.class.getName()).log(Level.SEVERE, null, ex);
                }
                finally{
                    if(rs != null){
                        try {
                            rs.close();
                        } catch (SQLException e) {
                        }
                    }
                    if(ps != null){
                        try {
                            ps.close();
                        } catch (SQLException e) {
                        }
                    }
                    if(conn != null){
                        try {
                            conn.close();
                        } catch (SQLException e) {
                        }
                    }
                }
                if(member_result > 0){
                    validasi_id.setText("Pengembalian sebelumnya belum tuntas");
                    validasi_id.setVisible(true);
                    return false;
                }
                return true;
            }
        }
    }
    private boolean bookValidation(){
        Connection conn = db_connection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql;
        /*if(!textbox_buku1.getText().equals("")){
            try {
                sql = "SELECT id FROM tb_buku WHERE judul = ?;";
                ps = conn.prepareStatement(sql);
                ps.setString(1,textbox_buku1.getText());
                rs = ps.executeQuery();
                if(rs.next()){
                    idBuku1 = rs.getInt("id");
                }
            } catch (SQLException ex) {
                Logger.getLogger(peminjaman_buku.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(!textbox_buku2.getText().equals("")){
            try {
                sql = "SELECT id FROM tb_buku WHERE judul = ?;";
                ps = conn.prepareStatement(sql);
                ps.setString(1,textbox_buku2.getText());
                rs = ps.executeQuery();
                if(rs.next()){
                    idBuku2 = rs.getInt("id");
                }
            } catch (SQLException ex) {
                Logger.getLogger(peminjaman_buku.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(!textbox_buku3.getText().equals("")){
            try {
                sql = "SELECT id FROM tb_buku WHERE judul = ?;";
                ps = conn.prepareStatement(sql);
                ps.setString(1,textbox_buku3.getText());
                rs = ps.executeQuery();
                if(rs.next()){
                    idBuku3 = rs.getInt("id");
                }
            } catch (SQLException ex) {
                Logger.getLogger(peminjaman_buku.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
        if(((idBuku1 != idBuku2)&&(idBuku1 != 0 && idBuku2 != 0)) || 
           ((idBuku1 != idBuku3)&&(idBuku1 != 0 && idBuku3 != 0)) || 
           ((idBuku2 != idBuku3)&&(idBuku2 != 0 && idBuku3 != 0))){
            if((idBuku1 != idBuku2)&&(idBuku1 == idBuku3)||(idBuku2 == idBuku3)){
                return false;
            }
            else if((idBuku1 != idBuku3)&&(idBuku1 == idBuku2)){
                return false;
            }
            return true;
        }
        else if(idBuku1 != 0 && (idBuku2 == 0 && idBuku3 == 0)){
            return true;
        }
        else if(idBuku2 != 0 && (idBuku1 == 0 && idBuku3 == 0)){
            return true;
        }
        else if(idBuku3 != 0 && (idBuku1 == 0 && idBuku2 == 0)){
            return true;
        }
        else{
            return false;
        }
    }
    private void insertDataPeminjaman(){
        ArrayList<Integer> buku_id = new ArrayList<Integer>();
        int id_pegawai = login_admin.id_pegawai_logged_in;
        int id_member = Integer.parseInt(textbox_id.getText());
        int id_peminjaman = 0;
        Connection conn = db_connection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "INSERT INTO tb_peminjaman (pegawai_id,member_id,tgl_pinjam,tgl_kembali) VALUES (?,?,CURDATE(),DATE_ADD(CURDATE(),INTERVAL 7 DAY));";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1,id_pegawai);
            ps.setInt(2,id_member);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(peminjaman_buku.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(rs != null){
                try {
                    rs.close();}
                catch (SQLException e) {
                }
            }
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                }
            }
        }
        if(idBuku1 != 0){
            buku_id.add(idBuku1);
        }
        if(idBuku2 != 0){
            buku_id.add(idBuku2);
        }
        if(idBuku3 != 0){
            buku_id.add(idBuku3);
        }
        conn = db_connection.getConnection();
        sql = "SELECT tb_peminjaman.id FROM tb_peminjaman WHERE tb_peminjaman.pegawai_id = ? AND tb_peminjaman.member_id = ? ORDER BY tb_peminjaman.id DESC LIMIT 1;";
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1,id_pegawai);
            ps.setInt(2,id_member);
            rs = ps.executeQuery();
            if(rs.next()){
                id_peminjaman = rs.getInt(1);
            }
        }
        catch(SQLException ex){
            Logger.getLogger(peminjaman_buku.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(rs != null){
                try {
                    rs.close();}
                catch (SQLException e) {
                }
            }
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                }
            }
        }
        conn = db_connection.getConnection();
        sql = "INSERT INTO tb_detail_peminjaman (buku_id,peminjaman_id,status_buku) VALUES (?,?,'dipinjam');";
        try {
            //dilakukan perulangan for each untuk memasukan semua data tag yang ada di array list ke database
            for(int id_buku : buku_id){
                ps = conn.prepareStatement(sql);
                ps.setInt(1,id_buku);
                ps.setInt(2,id_peminjaman);
                ps.executeUpdate();
            }
        } catch (Exception e) {
        }
        finally{
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                }
            }
        }
    }
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
            java.util.logging.Logger.getLogger(peminjaman_buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(peminjaman_buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(peminjaman_buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(peminjaman_buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new peminjaman_buku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_add_buku1;
    private javax.swing.JLabel btn_add_buku2;
    private javax.swing.JLabel btn_add_buku3;
    private javax.swing.JLabel btn_pinjam;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField textbox_buku1;
    public javax.swing.JTextField textbox_buku2;
    public javax.swing.JTextField textbox_buku3;
    private javax.swing.JTextField textbox_id;
    private javax.swing.JLabel validasi_buku;
    private javax.swing.JLabel validasi_id;
    // End of variables declaration//GEN-END:variables
}

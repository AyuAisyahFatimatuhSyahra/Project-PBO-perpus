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
import javax.swing.JOptionPane;
import peminjaman_pengembalian_buku.pengembalian_buku;
import pendaftaran_buku.Daftar_buku_option;
import sistem_informasi_perpustakaan.connection.db_connection;

/**
 *
 * @author asus
 */
public class denda_buku extends javax.swing.JFrame {
    private int id_pengembalian1;//untuk nyimpan id_pengembalian yang ada di tb_detail_pengembalian
    private int id_pengembalian2;
    private int id_pengembalian3;
    private int jml_buku_telat=1; //untuk iterasi, berapa buku yang telat
    private int terlambat = 0;//untuk pengecekan terlambat atau tidak
    private int id_pengembalian;
    /**
     * Creates new form denda_buku
     */
    public denda_buku() {
        initComponents();
    }
    
    
    public denda_buku(int id_pengembalian){ //parameter ini untuk nerima id_pengembalian yang dikirim dari jframe pengembalian_buku. nnti nya dipake untuk SELECT data sesuai parameternya
        this.id_pengembalian=id_pengembalian;
        initComponents();
        int indeks=1;
        Connection conn = db_connection.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        String sql;
        String volume = "";
        String edisi = "";
        
        sql ="select tb_detail_pengembalian.`id`, judul, volume, edisi from tb_detail_pengembalian\n" +
                "inner join tb_buku on tb_detail_pengembalian.`buku_id`=tb_buku.`id`\n" +
                "where tb_detail_pengembalian.`pengembalian_id`=" + id_pengembalian +";";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                if(indeks==1){
                    volume = rs.getString(3);
                    edisi = rs.getString(4);
                    if(volume == null && edisi != null){
                        jTextFieldBuku1.setText(rs.getString(2) +" edisi "+edisi);
                    }
                    else if(volume != null && edisi == null){
                        jTextFieldBuku1.setText(rs.getString(2) + " vol."+volume);
                    }
                    else if(volume == null && edisi == null){
                        jTextFieldBuku1.setText(rs.getString(2));
                    }
                    else{
                        jTextFieldBuku1.setText(rs.getString(2) + " vol."+volume+" edisi "+edisi);
                    }
                    //jTextFieldBuku1.setText(rs.getString(2));
                    this.id_pengembalian1=rs.getInt(1);
                }                
                if(indeks==2){
                    volume = rs.getString(3);
                    edisi = rs.getString(4);
                    if(volume == null && edisi != null){
                        jTextFieldBuku2.setText(rs.getString(2) +" edisi "+edisi);
                    }
                    else if(volume != null && edisi == null){
                        jTextFieldBuku2.setText(rs.getString(2) + " vol."+volume);
                    }
                    else if(volume == null && edisi == null){
                        jTextFieldBuku2.setText(rs.getString(2));
                    }
                    else{
                        jTextFieldBuku2.setText(rs.getString(2) + " vol."+volume+" edisi "+edisi);
                    }
                    //jTextFieldBuku2.setText(rs.getString(2));
                    this.id_pengembalian2=rs.getInt(1);
                    jml_buku_telat++;
                }
                if(indeks==3){
                    volume = rs.getString(3);
                    edisi = rs.getString(4);
                    if(volume == null && edisi != null){
                        jTextFieldBuku3.setText(rs.getString(2) +" edisi "+edisi);
                    }
                    else if(volume != null && edisi == null){
                        jTextFieldBuku3.setText(rs.getString(2) + " vol."+volume);
                    }
                    else if(volume == null && edisi == null){
                        jTextFieldBuku3.setText(rs.getString(2));
                    }
                    else{
                        jTextFieldBuku3.setText(rs.getString(2) + " vol."+volume+" edisi "+edisi);
                    }
                    //jTextFieldBuku3.setText(rs.getString(2));
                    this.id_pengembalian3=rs.getInt(1);
                    jml_buku_telat++;
                }
                indeks++;
            }
            if (jTextFieldBuku2.getText().equals("")) {
                jTextFieldKetDenda2.setEditable(false);
                jRadioButtonBuku2Hilang.setEnabled(false);
                jRadioButtonBuku2Rusak.setEnabled(false);
                jRadioButtonBuku2RusakBerat.setEnabled(false);
                jRadioButtonBuku2None.setEnabled(false);
            }
            if (jTextFieldBuku3.getText().equals("")) {
                jTextFieldKetDenda3.setEditable(false);
                jRadioButtonBuku3Hilang.setEnabled(false);
                jRadioButtonBuku3Rusak.setEnabled(false);
                jRadioButtonBuku3RusakBerat.setEnabled(false);
                jRadioButtonBuku3None.setEnabled(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(denda_buku.class.getName()).log(Level.SEVERE, null, ex);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextFieldBuku3 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextFieldBuku1 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextFieldBuku2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaRincianDenda = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jRadioButtonBuku1Rusak = new javax.swing.JRadioButton();
        jRadioButtonBuku1Hilang = new javax.swing.JRadioButton();
        jRadioButtonBuku2Rusak = new javax.swing.JRadioButton();
        jRadioButtonBuku2Hilang = new javax.swing.JRadioButton();
        jRadioButtonBuku3Rusak = new javax.swing.JRadioButton();
        jRadioButtonBuku3Hilang = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextFieldKetDenda1 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextFieldKetDenda2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextFieldKetDenda3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButtonRincianDenda = new javax.swing.JButton();
        jButtonSimpanDenda = new javax.swing.JButton();
        jRadioButtonBuku1None = new javax.swing.JRadioButton();
        jRadioButtonBuku2None = new javax.swing.JRadioButton();
        jRadioButtonBuku3None = new javax.swing.JRadioButton();
        jButtonBack = new javax.swing.JButton();
        jRadioButtonBuku1RusakBerat = new javax.swing.JRadioButton();
        jRadioButtonBuku3RusakBerat = new javax.swing.JRadioButton();
        jRadioButtonBuku2RusakBerat = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.E_RESIZE_CURSOR));

        jTextFieldBuku3.setEditable(false);
        jTextFieldBuku3.setBackground(new java.awt.Color(148, 61, 21));
        jTextFieldBuku3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldBuku3.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldBuku3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextFieldBuku3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuku3ActionPerformed(evt);
            }
        });
        jScrollPane3.setViewportView(jTextFieldBuku3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 180, 50));

        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane4.setCursor(new java.awt.Cursor(java.awt.Cursor.E_RESIZE_CURSOR));

        jTextFieldBuku1.setEditable(false);
        jTextFieldBuku1.setBackground(new java.awt.Color(148, 61, 21));
        jTextFieldBuku1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldBuku1.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldBuku1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextFieldBuku1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuku1ActionPerformed(evt);
            }
        });
        jScrollPane4.setViewportView(jTextFieldBuku1);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 180, 50));

        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane5.setCursor(new java.awt.Cursor(java.awt.Cursor.E_RESIZE_CURSOR));

        jTextFieldBuku2.setEditable(false);
        jTextFieldBuku2.setBackground(new java.awt.Color(148, 61, 21));
        jTextFieldBuku2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldBuku2.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldBuku2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextFieldBuku2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuku2ActionPerformed(evt);
            }
        });
        jScrollPane5.setViewportView(jTextFieldBuku2);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 180, 50));

        jLabel1.setFont(new java.awt.Font("Harrington", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Denda Buku");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 280, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Rincian Denda");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 90, 14));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Keterangan Denda Buku 1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 170, -1));

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextAreaRincianDenda.setEditable(false);
        jTextAreaRincianDenda.setBackground(new java.awt.Color(148, 61, 21));
        jTextAreaRincianDenda.setColumns(20);
        jTextAreaRincianDenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextAreaRincianDenda.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaRincianDenda.setRows(5);
        jTextAreaRincianDenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTextAreaRincianDenda);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 290, 140));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Buku 3");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 50, 14));

        buttonGroup1.add(jRadioButtonBuku1Rusak);
        jRadioButtonBuku1Rusak.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButtonBuku1Rusak.setText("Rusak Ringan");
        jRadioButtonBuku1Rusak.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonBuku1Rusak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBuku1RusakActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonBuku1Rusak, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        buttonGroup1.add(jRadioButtonBuku1Hilang);
        jRadioButtonBuku1Hilang.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButtonBuku1Hilang.setText("Hilang");
        jRadioButtonBuku1Hilang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jRadioButtonBuku1Hilang, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 70, -1));

        buttonGroup2.add(jRadioButtonBuku2Rusak);
        jRadioButtonBuku2Rusak.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonBuku2Rusak.setText("Rusak Ringan");
        jRadioButtonBuku2Rusak.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jRadioButtonBuku2Rusak, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 110, -1));

        buttonGroup2.add(jRadioButtonBuku2Hilang);
        jRadioButtonBuku2Hilang.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonBuku2Hilang.setText("Hilang");
        jRadioButtonBuku2Hilang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jRadioButtonBuku2Hilang, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 70, -1));

        buttonGroup3.add(jRadioButtonBuku3Rusak);
        jRadioButtonBuku3Rusak.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButtonBuku3Rusak.setText("Rusak Ringan");
        jRadioButtonBuku3Rusak.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jRadioButtonBuku3Rusak, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 110, -1));

        buttonGroup3.add(jRadioButtonBuku3Hilang);
        jRadioButtonBuku3Hilang.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButtonBuku3Hilang.setText("Hilang");
        jRadioButtonBuku3Hilang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jRadioButtonBuku3Hilang, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 70, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Buku 2");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 50, 14));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Buku 1");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 50, -1));

        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane6.setCursor(new java.awt.Cursor(java.awt.Cursor.E_RESIZE_CURSOR));

        jTextFieldKetDenda1.setBackground(new java.awt.Color(148, 61, 21));
        jTextFieldKetDenda1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldKetDenda1.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldKetDenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldKetDenda1ActionPerformed(evt);
            }
        });
        jScrollPane6.setViewportView(jTextFieldKetDenda1);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 180, 50));

        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane7.setCursor(new java.awt.Cursor(java.awt.Cursor.E_RESIZE_CURSOR));

        jTextFieldKetDenda2.setBackground(new java.awt.Color(148, 61, 21));
        jTextFieldKetDenda2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldKetDenda2.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldKetDenda2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldKetDenda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldKetDenda2ActionPerformed(evt);
            }
        });
        jScrollPane7.setViewportView(jTextFieldKetDenda2);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 180, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Keterangan Denda Buku 2");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 180, -1));

        jScrollPane8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane8.setCursor(new java.awt.Cursor(java.awt.Cursor.E_RESIZE_CURSOR));

        jTextFieldKetDenda3.setBackground(new java.awt.Color(148, 61, 21));
        jTextFieldKetDenda3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldKetDenda3.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldKetDenda3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldKetDenda3ActionPerformed(evt);
            }
        });
        jScrollPane8.setViewportView(jTextFieldKetDenda3);

        getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 180, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Keterangan Denda Buku 3");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 180, -1));

        jButtonRincianDenda.setBackground(new java.awt.Color(51, 51, 51));
        jButtonRincianDenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonRincianDenda.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRincianDenda.setText("Rincian Denda");
        jButtonRincianDenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRincianDenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRincianDendaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRincianDenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, -1, -1));

        jButtonSimpanDenda.setBackground(new java.awt.Color(51, 51, 51));
        jButtonSimpanDenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSimpanDenda.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSimpanDenda.setText("Simpan");
        jButtonSimpanDenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSimpanDenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanDendaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSimpanDenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, -1, -1));

        buttonGroup1.add(jRadioButtonBuku1None);
        jRadioButtonBuku1None.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButtonBuku1None.setSelected(true);
        jRadioButtonBuku1None.setText("None");
        jRadioButtonBuku1None.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jRadioButtonBuku1None, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        buttonGroup2.add(jRadioButtonBuku2None);
        jRadioButtonBuku2None.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonBuku2None.setSelected(true);
        jRadioButtonBuku2None.setText("None");
        jRadioButtonBuku2None.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jRadioButtonBuku2None, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, -1, -1));

        buttonGroup3.add(jRadioButtonBuku3None);
        jRadioButtonBuku3None.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButtonBuku3None.setSelected(true);
        jRadioButtonBuku3None.setText("None");
        jRadioButtonBuku3None.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jRadioButtonBuku3None, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 60, -1));

        jButtonBack.setBackground(new java.awt.Color(153, 153, 153));
        jButtonBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jButtonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 40, 40));

        buttonGroup1.add(jRadioButtonBuku1RusakBerat);
        jRadioButtonBuku1RusakBerat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButtonBuku1RusakBerat.setText("Rusak Berat");
        jRadioButtonBuku1RusakBerat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonBuku1RusakBerat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBuku1RusakBeratActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonBuku1RusakBerat, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 100, -1));

        buttonGroup3.add(jRadioButtonBuku3RusakBerat);
        jRadioButtonBuku3RusakBerat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButtonBuku3RusakBerat.setText("Rusak Berat");
        jRadioButtonBuku3RusakBerat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jRadioButtonBuku3RusakBerat, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 100, -1));

        buttonGroup2.add(jRadioButtonBuku2RusakBerat);
        jRadioButtonBuku2RusakBerat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonBuku2RusakBerat.setText("Rusak Berat");
        jRadioButtonBuku2RusakBerat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jRadioButtonBuku2RusakBerat, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 100, -1));

        jPanel1.setBackground(new java.awt.Color(148,61,21,70));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(102, 0, 102), new java.awt.Color(0, 0, 255), new java.awt.Color(102, 0, 102)));
        jPanel1.setForeground(new java.awt.Color(163, 9, 9));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 640, 480));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pu.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBuku3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuku3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuku3ActionPerformed

    private void jTextFieldBuku1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuku1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuku1ActionPerformed

    private void jTextFieldBuku2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuku2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuku2ActionPerformed

    private void jTextFieldKetDenda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldKetDenda1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldKetDenda1ActionPerformed

    private void jTextFieldKetDenda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldKetDenda2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldKetDenda2ActionPerformed

    private void jTextFieldKetDenda3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldKetDenda3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldKetDenda3ActionPerformed

    private void jButtonRincianDendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRincianDendaActionPerformed
        // TODO add your handling code here:
        
        String jenis_denda1 = "";
        String jenis_denda2 = "";
        String jenis_denda3 = "";
        String tgl = null;
        int telat = 0;
        int bayar_denda =0;

        Connection conn = db_connection.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        String sql;
        
        sql ="SELECT tb_peminjaman.`tgl_kembali` FROM tb_pengembalian\n" +
                "INNER JOIN tb_peminjaman ON tb_pengembalian.`peminjaman_id`=tb_peminjaman.`id`\n" +
                "WHERE tb_pengembalian.`id`=" + id_pengembalian + ";";

        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                tgl = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(denda_buku.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Date tanggal = new Date();
        SimpleDateFormat dateNow = new SimpleDateFormat("yyy-MM-dd");//menentukan format tanggal (tahun-bulan-hari)
        String nowDate = dateNow.format(tanggal);// menyimpan tanggal sekarang ke dalam variabel yg bertipe string
        

        LocalDate tgl_kembali = LocalDate.parse(tgl, DateTimeFormatter.ISO_DATE);
        LocalDate tgl_sekarang = LocalDate.parse(nowDate, DateTimeFormatter.ISO_DATE);
        
        if (tgl_sekarang.isAfter(tgl_kembali)) {
            telat =5000;
            bayar_denda += 5000 * jml_buku_telat;
            this.terlambat = 1;
        }

        if (jRadioButtonBuku1Rusak.isSelected()) {
            jenis_denda1="Rusak Ringan Rp. 15.000";
            bayar_denda += 15000;
        }
        if (jRadioButtonBuku1RusakBerat.isSelected()) {
            jenis_denda1="Rusak Berat Rp. 50.000";
            bayar_denda += 50000;
        }
        if (jRadioButtonBuku1Hilang.isSelected()) {
            jenis_denda1="Hilang    Rp. 50.000";
            bayar_denda += 50000;
        }
        
        if (jRadioButtonBuku2Rusak.isSelected()) {
            jenis_denda2="Rusak Ringan Rp. 15.000";
            bayar_denda += 15000;
        }
        if (jRadioButtonBuku2RusakBerat.isSelected()) {
            jenis_denda2="Rusak Berat Rp. 50.000";
            bayar_denda += 50000;
        }
        if (jRadioButtonBuku2Hilang.isSelected()) {
            jenis_denda2="Hilang    Rp. 50.000";
            bayar_denda += 50000;
        }
        
        if (jRadioButtonBuku3Rusak.isSelected()) {
            jenis_denda3="Rusak Ringan Rp. 15.000";
            bayar_denda += 15000;
        }
        if (jRadioButtonBuku3RusakBerat.isSelected()) {
            jenis_denda3="Rusak Berat Rp. 50.000";
            bayar_denda += 50000;
        }
        if (jRadioButtonBuku3Hilang.isSelected()) {
            jenis_denda3="Hilang    Rp. 50.000";
            bayar_denda += 50000;
        }
        
        telat *= jml_buku_telat;
        if(telat!=0){
            jTextAreaRincianDenda.setText(
            "Buku 1 : " +
            jTextFieldBuku1.getText() + 
            "\nJenis Denda : " + jenis_denda1 +
            "\nKeterangan Denda : " + jTextFieldKetDenda1.getText() +
            "\n\nBuku 2 : " +
            jTextFieldBuku2.getText() + 
            "\nJenis Denda : " + jenis_denda2 +
            "\nKeterangan Denda : " + jTextFieldKetDenda2.getText() +            
            "\n\nBuku 3 : " +
            jTextFieldBuku3.getText() + 
            "\nJenis Denda : " + jenis_denda3 +
            "\nKeterangan Denda : " + jTextFieldKetDenda3.getText() +
            "\n\nDeadline Kembali : " + tgl_kembali +
            "\nTanggal Dikembalikan : " + tgl_sekarang +
            "\nTerlambat : " + telat +
            "\n\nTotal Denda : Rp. " + bayar_denda //+

            );
        } else {
            jTextAreaRincianDenda.setText(
            "Buku 1 : " +
            jTextFieldBuku1.getText() + 
            "\nJenis Denda : " + jenis_denda1 +
            "\nKeterangan Denda : " + jTextFieldKetDenda1.getText() +
            "\n\nBuku 2 : " +
            jTextFieldBuku2.getText() + 
            "\nJenis Denda : " + jenis_denda2 +
            "\nKeterangan Denda : " + jTextFieldKetDenda2.getText() +            
            "\n\nBuku 3 : " +
            jTextFieldBuku3.getText() + 
            "\nJenis Denda : " + jenis_denda3 +
            "\nKeterangan Denda : " + jTextFieldKetDenda3.getText() +
            "\n\nTotal Denda : Rp. " + bayar_denda
            );
        }
    }//GEN-LAST:event_jButtonRincianDendaActionPerformed

    private void jButtonSimpanDendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanDendaActionPerformed
        // TODO add your handling code here:
        String ketBuku1 = jTextFieldKetDenda1.getText();
        String ketBuku2 = jTextFieldKetDenda2.getText();
        String ketBuku3 = jTextFieldKetDenda3.getText();
        int id_jenis_denda1 = 0;
        int id_jenis_denda2 = 0;
        int id_jenis_denda3 = 0;
        int id_buku1 = 0;
        int id_buku2 = 0;
        int id_buku3 = 0;
        int indeks=1;
        //idBuku();
        Connection conn = db_connection.getConnection();
        PreparedStatement ps = null;
        String sql ="INSERT INTO tb_denda (keterangan_denda,jenis_denda_id,detail_pengembalian_id) VALUES (?,?,?);";

        if (jRadioButtonBuku1Rusak.isSelected()) {
            id_jenis_denda1 = 2;
        } else if(jRadioButtonBuku1RusakBerat.isSelected()){
            id_jenis_denda1 = 5;
        } else if(jRadioButtonBuku1Hilang.isSelected()){
            id_jenis_denda1 = 3;
        } else {
            id_jenis_denda1 = 4;
        }
        
        if (jRadioButtonBuku2Rusak.isSelected()) {
            id_jenis_denda2 = 2;
        } else if(jRadioButtonBuku2RusakBerat.isSelected()){
            id_jenis_denda2 = 5;
        } else if (jRadioButtonBuku2Hilang.isSelected()) {
            id_jenis_denda2 = 3;
        } else{
            id_jenis_denda2 = 4;
        }

        if (jRadioButtonBuku3Rusak.isSelected()) {
            id_jenis_denda3 = 2;
        } else if(jRadioButtonBuku3RusakBerat.isSelected()){
            id_jenis_denda3 = 5;
        } else if (jRadioButtonBuku3Hilang.isSelected()) {
            id_jenis_denda3 = 3;
        } else {
            id_jenis_denda3 = 4;            
        }

        try {
            if(id_jenis_denda1 != 4 && id_jenis_denda1 != 0){
                ps = conn.prepareStatement(sql);
                ps.setString(1,ketBuku1);
                ps.setInt(2,id_jenis_denda1);
                ps.setInt(3,id_pengembalian1);
                ps.executeUpdate();
                if(id_jenis_denda1 == 5 || id_jenis_denda1 == 3){
                    hilang_rusak_berat(id_pengembalian1);
                }
            }            
            if (this.terlambat==1) {
                ps = conn.prepareStatement(sql);
                ps.setString(1,"Telat");
                ps.setInt(2,1);
                ps.setInt(3,id_pengembalian1);
                ps.executeUpdate();
            }
                    
            if (!jTextFieldBuku2.getText().isEmpty()) {
                if(id_jenis_denda2 != 4 && id_jenis_denda2 != 0){
                ps.setString(1,ketBuku2);
                ps.setInt(2,id_jenis_denda2);
                ps.setInt(3,id_pengembalian2);
                ps.executeUpdate();
                if(id_jenis_denda2 == 5 || id_jenis_denda2 == 3){
                    hilang_rusak_berat(id_pengembalian2);
                }
                }
                
                if (terlambat==1) {
                    ps = conn.prepareStatement(sql);
                    ps.setString(1,"Telat");
                    ps.setInt(2,1);
                    ps.setInt(3,id_pengembalian2);
                    ps.executeUpdate();
                }    
            }
            
            if (!jTextFieldBuku3.getText().isEmpty()) {
                if(id_jenis_denda3 != 4 && id_jenis_denda3 != 0)
                ps.setString(1,ketBuku3);
                ps.setInt(2,id_jenis_denda3);
                ps.setInt(3,id_pengembalian3);
                ps.executeUpdate();
                if(id_jenis_denda1 == 5 || id_jenis_denda1 == 3){
                    hilang_rusak_berat(id_pengembalian3);
                }
                if (terlambat==1) {
                    ps = conn.prepareStatement(sql);
                    ps.setString(1,"Telat");
                    ps.setInt(2,1);
                    ps.setInt(3,id_pengembalian3);
                    ps.executeUpdate();
                }
            }
            
            JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan");
        } catch (SQLException ex) {
            Logger.getLogger(denda_buku.class.getName()).log(Level.SEVERE, null, ex);
        } 

        this.dispose();
        Daftar_buku_option daftar_buku_option = new Daftar_buku_option();
        daftar_buku_option.setVisible(true);
        
    }//GEN-LAST:event_jButtonSimpanDendaActionPerformed
private void hilang_rusak_berat(int id_detail_pengembalian){
    Connection conn = db_connection.getConnection();
            PreparedStatement ps = null;
            ResultSet rs = null;
            String sql = null;
            int id_buku = 0;
            int jumlah = 0;
            sql = "SELECT tb_buku.id, tb_buku.jumlah FROM tb_detail_pengembalian INNER JOIN tb_buku ON tb_detail_pengembalian.buku_id = tb_buku.id WHERE tb_detail_pengembalian.id = ?;";            
    try {
            System.out.println("Select berhasil");
            ps = conn.prepareStatement(sql);
            ps.setInt(1,id_detail_pengembalian);
            rs = ps.executeQuery();
            if(rs.next()){
                id_buku = rs.getInt(1);
                System.out.println("Id buku yang dimin : "+ id_buku);
                jumlah = rs.getInt(2) - 1;
                System.out.println("Jumlah setelah di min: "+jumlah);
            }   
    } catch (SQLException ex) {
            Logger.getLogger(denda_buku.class.getName()).log(Level.SEVERE, null, ex);
        }
    sql = "UPDATE tb_buku SET jumlah = ? WHERE id = ?;";
    try {
        System.out.println("Minus berhasil");
        ps = conn.prepareStatement(sql);
        ps.setInt(1,jumlah);
        ps.setInt(2,id_buku);
        ps.executeUpdate();
    } catch (SQLException e) {
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
//    private void idBuku(){
//        int id_buku1;
//        int id_buku2;
//        int id_buku3;
//        Connection conn1 = db_connection.getConnection();
//        PreparedStatement ps1 = null;
//        ResultSet rs1 = null;
//        String sql = "SELECT buku_id FROM tb_detail_pengembalian WHERE pengembalian_id=?;";
//        
//        try {
//            ps1 = conn1.prepareStatement(sql);
//            ps1.setInt(1,id_pengembalian1);
//            //ps1.executeUpdate();
//            rs1 = ps1.executeQuery();
//            System.out.println("hhkjkjjkjh" + id_pengembalian1);
//            while(rs1.next()){
//                id_buku1 = rs1.getInt(1);
//                System.out.println(" Bom =" +id_buku1);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(pengembalian_buku.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        finally{
//            if(rs1 != null){
//                try {
//                    rs1.close();
//                } catch (SQLException e) {
//                }
//            }
//            if(ps1 != null){
//                try {
//                    ps1.close();
//                } catch (SQLException e) {
//                }
//            }
//            if(conn1 != null){
//                try {
//                    conn1.close();
//                } catch (SQLException e) {
//                }
//            }
//        }
//        
//    }
    
    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        pengembalian_buku pengembalian_bk = new pengembalian_buku();
        pengembalian_bk.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jRadioButtonBuku1RusakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBuku1RusakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonBuku1RusakActionPerformed

    private void jRadioButtonBuku1RusakBeratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBuku1RusakBeratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonBuku1RusakBeratActionPerformed

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
            java.util.logging.Logger.getLogger(denda_buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(denda_buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(denda_buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(denda_buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new denda_buku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonRincianDenda;
    private javax.swing.JButton jButtonSimpanDenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonBuku1Hilang;
    private javax.swing.JRadioButton jRadioButtonBuku1None;
    private javax.swing.JRadioButton jRadioButtonBuku1Rusak;
    private javax.swing.JRadioButton jRadioButtonBuku1RusakBerat;
    private javax.swing.JRadioButton jRadioButtonBuku2Hilang;
    private javax.swing.JRadioButton jRadioButtonBuku2None;
    private javax.swing.JRadioButton jRadioButtonBuku2Rusak;
    private javax.swing.JRadioButton jRadioButtonBuku2RusakBerat;
    private javax.swing.JRadioButton jRadioButtonBuku3Hilang;
    private javax.swing.JRadioButton jRadioButtonBuku3None;
    private javax.swing.JRadioButton jRadioButtonBuku3Rusak;
    private javax.swing.JRadioButton jRadioButtonBuku3RusakBerat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea jTextAreaRincianDenda;
    private javax.swing.JTextField jTextFieldBuku1;
    private javax.swing.JTextField jTextFieldBuku2;
    private javax.swing.JTextField jTextFieldBuku3;
    private javax.swing.JTextField jTextFieldKetDenda1;
    private javax.swing.JTextField jTextFieldKetDenda2;
    private javax.swing.JTextField jTextFieldKetDenda3;
    // End of variables declaration//GEN-END:variables
}

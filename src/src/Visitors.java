package src;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.awt.print.PrinterException;
import java.sql.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Visitors extends javax.swing.JFrame {

    public Visitors() {
        initComponents();
        Insert();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        updialog = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        tfname1 = new javax.swing.JTextField();
        tfname2 = new javax.swing.JTextField();
        tfage = new javax.swing.JTextField();
        tfadd = new javax.swing.JTextField();
        tfphone = new javax.swing.JTextField();
        tfdate = new javax.swing.JTextField();
        tfemail = new javax.swing.JTextField();
        cbgender = new javax.swing.JComboBox<>();
        btnupdate1 = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        vname1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        vage = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        vemail = new javax.swing.JTextField();
        vadd = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        vsex = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        vphone = new javax.swing.JTextField();
        vname2 = new javax.swing.JTextField();
        pbutton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        listlable = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        vsum = new javax.swing.JTextArea();
        btnclear = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        vdate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnt = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        vsearch = new javax.swing.JLabel();
        tfsearch = new javax.swing.JTextField();
        tfhome = new javax.swing.JLabel();
        cbsearch = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        updialog.setTitle("update");
        updialog.setModal(true);
        updialog.setSize(new java.awt.Dimension(490, 280));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("E-mail : ");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("gender ");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("Age ");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel25.setText("Address ");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("Visit Date :");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Phone");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("First Name   ");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Last Name  ");

        tfname1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tfname2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tfage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tfadd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tfadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfaddActionPerformed(evt);
            }
        });

        tfphone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tfdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tfemail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        cbgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female" }));
        cbgender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnupdate1.setText("Update");
        btnupdate1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnupdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdate1ActionPerformed(evt);
            }
        });

        btnclose.setText("CLOSE");
        btnclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfname1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(0, 46, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(btnupdate1)
                                        .addGap(34, 34, 34)
                                        .addComponent(btnclose))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfname2)
                            .addComponent(tfage))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addComponent(jLabel22))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfdate, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(tfemail)
                            .addComponent(tfadd, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfphone)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(tfname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(tfdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(tfname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(cbgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnupdate1)
                            .addComponent(btnclose))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(tfphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Update Visitor's info");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        javax.swing.GroupLayout updialogLayout = new javax.swing.GroupLayout(updialog.getContentPane());
        updialog.getContentPane().setLayout(updialogLayout);
        updialogLayout.setHorizontalGroup(
            updialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        updialogLayout.setVerticalGroup(
            updialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updialogLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Lastname");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 49, 60, 20));

        vname1.setBackground(new java.awt.Color(255, 204, 204));
        vname1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel3.add(vname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 29, 160, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Firstname");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, 60, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gender");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 135, 60, 20));

        vage.setBackground(new java.awt.Color(255, 204, 204));
        vage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel3.add(vage, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 109, 160, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Age");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 89, 60, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("E-mail address");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 55, -1, 20));

        vemail.setBackground(new java.awt.Color(255, 204, 204));
        vemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel3.add(vemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 75, 160, 20));

        vadd.setBackground(new java.awt.Color(255, 204, 204));
        vadd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel3.add(vadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 35, 160, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Address");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 15, 60, 20));

        vsex.setBackground(new java.awt.Color(0, 0, 51));
        vsex.setForeground(new java.awt.Color(255, 255, 255));
        vsex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        vsex.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(vsex, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 161, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Phone #");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 95, -1, 20));

        vphone.setBackground(new java.awt.Color(255, 204, 204));
        vphone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel3.add(vphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 115, 160, 20));

        vname2.setBackground(new java.awt.Color(255, 204, 204));
        vname2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel3.add(vname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 69, 160, 20));

        pbutton.setBackground(new java.awt.Color(204, 204, 204));
        pbutton.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        pbutton.setText("print");
        pbutton.setActionCommand("");
        pbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pbuttonMouseClicked(evt);
            }
        });
        jPanel3.add(pbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 193, -1, -1));

        table1.setBackground(new java.awt.Color(204, 204, 204));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "FirstName", "Lastname", "Age", "GENDER", "ADDRESS", " EMAIL", "PHONE", "DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 247, 836, 123));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        listlable.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        listlable.setForeground(new java.awt.Color(255, 255, 255));
        listlable.setText("Visitors  List");
        listlable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listlable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listlableMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listlable)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(listlable))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 224, 836, -1));

        vsum.setColumns(20);
        vsum.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        vsum.setRows(5);
        vsum.setToolTipText("visitor's Sammury");
        vsum.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane3.setViewportView(vsum);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 11, 431, 176));

        btnclear.setBackground(new java.awt.Color(204, 204, 204));
        btnclear.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        btnclear.setText("CLEAR");
        btnclear.setActionCommand("");
        btnclear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel3.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 194, -1, -1));

        btnupdate.setBackground(new java.awt.Color(204, 204, 204));
        btnupdate.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        btnupdate.setText("UPDATE");
        btnupdate.setActionCommand("");
        btnupdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnupdateMouseClicked(evt);
            }
        });
        jPanel3.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 194, -1, -1));

        btnadd.setBackground(new java.awt.Color(204, 204, 204));
        btnadd.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        btnadd.setText("ADD");
        btnadd.setActionCommand("");
        btnadd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnaddMouseClicked(evt);
            }
        });
        jPanel3.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 194, -1, -1));

        btndelete.setBackground(new java.awt.Color(204, 204, 204));
        btndelete.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        btndelete.setText("DELETE");
        btndelete.setActionCommand("");
        btndelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 194, -1, -1));

        vdate.setBackground(new java.awt.Color(255, 204, 204));
        vdate.setToolTipText("yyyy-mm-dd");
        vdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel3.add(vdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 164, 160, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Date Of Visit");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 135, -1, 20));

        btnt.setBackground(new java.awt.Color(204, 204, 204));
        btnt.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        btnt.setText("Issue Ticket");
        btnt.setActionCommand("");
        btnt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntMouseClicked(evt);
            }
        });
        jPanel3.add(btnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 195, -1, 23));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visimg.jpg"))); // NOI18N
        jPanel3.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 370));

        jPanel7.setBackground(new java.awt.Color(0, 0, 51));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Add Visitors");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        vsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8_search_20px.png"))); // NOI18N
        vsearch.setText(" ");
        vsearch.setToolTipText("search...");
        vsearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vsearchMouseClicked(evt);
            }
        });
        jPanel7.add(vsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 6, -1, -1));

        tfsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfsearchMouseClicked(evt);
            }
        });
        jPanel7.add(tfsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 3, 139, -1));

        tfhome.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        tfhome.setForeground(new java.awt.Color(255, 255, 255));
        tfhome.setText("HOME");
        tfhome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tfhome.setFocusTraversalPolicyProvider(true);
        tfhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfhomeMouseClicked(evt);
            }
        });
        jPanel7.add(tfhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 11, 41, -1));

        cbsearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "search by :", "ID", "Name", "Gender" }));
        cbsearch.setToolTipText("choose the key to searc");
        cbsearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(cbsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 3, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pbuttonMouseClicked
        if (vsum.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Empty File!");
        } else {
            try {
                java.util.Date date = new java.util.Date();

                vsum.setText(vsum.getText() + "*********************************************************************\n" + "\nGenerated On : " + date.toString());
                vsum.print();

            } catch (PrinterException e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_pbuttonMouseClicked

    private void vsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vsearchMouseClicked
        int id = 0;
        String fname = "";
        String lname = "";
        int age = 0;
        String gender = "";
        String address = "";
        String email = "";
        String phone = "";
        String date = "";
        try {
            String key = tfsearch.getText();
            Connection conn = (Connection) DBconnection.connectDB();
            PreparedStatement st = (PreparedStatement) conn.prepareStatement(
                    "SELECT * FROM visitors WHERE id=? or first_name=? or last_name=? or age=?  or gender=? or address=? or email=? or phone =? or date=?");
            st.setString(1, key);
            st.setString(2, key);
            st.setString(3, key);
            st.setString(4, key);
            st.setString(5, key);
            st.setString(6, key);
            st.setString(7, key);
            st.setString(8, key);
            st.setString(9, key);

            ResultSet rs = st.executeQuery();
            clearTable();
            for (int i = 0; i < 10; i++) {
                if (rs.next()) {
                    id = rs.getInt(1);
                    fname = rs.getString(2);
                    lname = rs.getString(3);
                    age = rs.getInt(4);
                    gender = rs.getString(5);
                    address = rs.getString(6);
                    email = rs.getString(7);
                    phone = rs.getString(8);
                    date = rs.getString(9);

                    table1.setValueAt(id, i, 0);
                    table1.setValueAt(fname, i, 1);
                    table1.setValueAt(lname, i, 2);
                    table1.setValueAt(age, i, 3);
                    table1.setValueAt(gender, i, 4);
                    table1.setValueAt(address, i, 5);
                    table1.setValueAt(email, i, 6);
                    table1.setValueAt(phone, i, 7);
                    table1.setValueAt(date, i, 8);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Visitors.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_vsearchMouseClicked

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed

        vsum.setText("");
        vname1.setText("");
        vname2.setText("");
        vage.setText("");
        vadd.setText("");
        vphone.setText("");
        vemail.setText("");
        vdate.setText("");
        int y = table1.getSelectedRow();
        if (table1.isRowSelected(y)) {
            table1.removeRowSelectionInterval(y, 0);
        }

    }//GEN-LAST:event_btnclearActionPerformed

    private void btnupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupdateMouseClicked

        int key = table1.getSelectedRow();

        if (table1.isRowSelected(key)) {

            int x = Integer.parseInt(table1.getValueAt(key, 0).toString());
            tfname1.setText(table1.getValueAt(key, 1).toString());
            tfname2.setText(table1.getValueAt(key, 2).toString());
            tfage.setText(table1.getValueAt(key, 3).toString());
            //tfgender.setText(table1.getValueAt(key, 1).toString());
            tfadd.setText(table1.getValueAt(key, 5).toString());
            tfemail.setText(table1.getValueAt(key, 6).toString());
            tfphone.setText(table1.getValueAt(key, 7).toString());
            tfdate.setText(table1.getValueAt(key, 8).toString());

            updialog.setLocationRelativeTo(null);
            updialog.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(this, "select row to be updated first.", "select!!", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_btnupdateMouseClicked

    private void btnaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaddMouseClicked

        if (vname1.getText().isEmpty() || vname2.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "fill name on field.", "error.", JOptionPane.ERROR_MESSAGE);

        } else if (vage.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter age.", "error.", JOptionPane.ERROR_MESSAGE);

        } else if (vadd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter address", "error.", JOptionPane.ERROR_MESSAGE);

        } else if (vemail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Email.", "error.", JOptionPane.ERROR_MESSAGE);

        } else if (vphone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter phone number.", "error.", JOptionPane.ERROR_MESSAGE);

        } else if (vdate.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter visit Date.", "error.", JOptionPane.ERROR_MESSAGE);

        } else {

            String fname = vname1.getText();
            String lname = vname2.getText();
            int age = Integer.parseInt(vage.getText());
            String gender = vsex.getSelectedItem().toString();
            String address = vadd.getText();
            String email = vemail.getText();
            String phone = vphone.getText();
            String date = vdate.getText();

            insertVtable(fname, lname, age, gender, address, email, phone, date);
        }


    }//GEN-LAST:event_btnaddMouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed

        String y = JOptionPane.showInputDialog(this, "ID of visitor to be deleted.", "Enter ID", JOptionPane.INFORMATION_MESSAGE);
        if (!y.isEmpty()) {
            deleteVisitor(y);
        } else {
            System.out.println("delete canceled");
        }


    }//GEN-LAST:event_btndeleteActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        int key = table1.getSelectedRow();
        String id = table1.getValueAt(key, 0).toString();
        String name = table1.getValueAt(key, 1).toString() + " " + table1.getValueAt(key, 1).toString();
        String age = table1.getValueAt(key, 3).toString();
        String gender = table1.getValueAt(key, 4).toString();
        String add = table1.getValueAt(key, 5).toString();
        String email = table1.getValueAt(key, 6).toString();
        String phone = table1.getValueAt(key, 7).toString();
        String date = table1.getValueAt(key, 8).toString();
        vsum.setBackground(Color.LIGHT_GRAY);
        vsum.setText("*********************************MMM**********************************\n"
                + "**************************VISITOR INFORMATION***********************\n"
                + "NAME  ......................................: " + name + "\n"
                + "ID ..............................................: " + id + " \n"
                + "AGE ...........................................: " + age + " \n"
                + "GENDER ...................................:" + gender + "\n"
                + "ADDERESS ...............................: " + add + "\n"
                + "E-MAIL .....................................: " + email + "\n"
                + "PHONE ......................................: " + phone + "\n"
                + "DATE .........................................:" + date + "\n"
                + "\n"
                + "*********************************************************************\n"
                + "\n"
                + "");
    }//GEN-LAST:event_table1MouseClicked

    private void btntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntMouseClicked
        int key = table1.getSelectedRow();
        if (table1.isRowSelected(key)) {
            java.util.Date date = new java.util.Date();

            Random r = new Random();
            vsum.setText("                                       ::::::::::::VISIT TECKET:::::::::::\n"
                    + "_____________________________________________________________________\n"
                    + "DATE: " + date + "\n"
                    + "______________________________________________________________________\n"
                    + "VISITOR NAME  : " + table1.getValueAt(key, 1) + " " + table1.getValueAt(key, 2) + "\n"
                    + "EMAIL                  : " + table1.getValueAt(key, 6) + "\n"
                    + "PHONE#               : " + table1.getValueAt(key, 7) + "\n"
                    + "TECKET NO.        : " + r.nextInt(1000) + "\n"
                    + "PAYMENT            : " + "5 ETB" + "\n"
                    + "-----------------------------------------------------------------------");
            try {
                vsum.print();
            } catch (PrinterException ex) {
                Logger.getLogger(Visitors.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "select visitor!", "error!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btntMouseClicked

    private void tfsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfsearchMouseClicked
        tfsearch.setText("");
    }//GEN-LAST:event_tfsearchMouseClicked

    private void tfhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfhomeMouseClicked
        Dashboard b = new Dashboard();
        dispose();
        b.setTitle("HOME");
        b.setLocationRelativeTo(null);
        b.setVisible(true);
    }//GEN-LAST:event_tfhomeMouseClicked

    private void listlableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listlableMouseClicked
        int t = JOptionPane.showConfirmDialog(this, "do you want to print visitors list?", "confirm", JOptionPane.YES_NO_OPTION);
        if (t == JOptionPane.YES_OPTION) {
            try {
                table1.print();
            } catch (PrinterException ex) {
                Logger.getLogger(Visitors.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_listlableMouseClicked

    private void tfaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfaddActionPerformed

    private void btnupdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdate1ActionPerformed
        int key = table1.getSelectedRow();
        int x = Integer.parseInt(table1.getValueAt(key, 0).toString());
        String fname = tfname1.getText();
        String lname = tfname2.getText();
        int age = Integer.parseInt(tfage.getText());
        String gender = (String) cbgender.getSelectedItem();
        String add = tfadd.getText();
        String email = tfemail.getText();
        String phone = tfphone.getText();
        String date = tfdate.getText();

        updateVisitor(x, fname, lname, age, gender, add, email, phone, date);
        clearTable();
        Insert();


    }//GEN-LAST:event_btnupdate1ActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        updialog.setVisible(false);
    }//GEN-LAST:event_btncloseActionPerformed

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        Insert();
    }//GEN-LAST:event_jLabel20MouseClicked

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
            java.util.logging.Logger.getLogger(Visitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visitors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnt;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton btnupdate1;
    private javax.swing.JComboBox<String> cbgender;
    private javax.swing.JComboBox<String> cbsearch;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel listlable;
    private javax.swing.JButton pbutton;
    private javax.swing.JTable table1;
    private javax.swing.JTextField tfadd;
    private javax.swing.JTextField tfage;
    private javax.swing.JTextField tfdate;
    private javax.swing.JTextField tfemail;
    private javax.swing.JLabel tfhome;
    private javax.swing.JTextField tfname1;
    private javax.swing.JTextField tfname2;
    private javax.swing.JTextField tfphone;
    private javax.swing.JTextField tfsearch;
    private javax.swing.JDialog updialog;
    private javax.swing.JTextField vadd;
    private javax.swing.JTextField vage;
    private javax.swing.JTextField vdate;
    private javax.swing.JTextField vemail;
    private javax.swing.JTextField vname1;
    private javax.swing.JTextField vname2;
    private javax.swing.JTextField vphone;
    private javax.swing.JLabel vsearch;
    private javax.swing.JComboBox<String> vsex;
    private javax.swing.JTextArea vsum;
    // End of variables declaration//GEN-END:variables

    private void insertVtable(String fname, String lname, int age, String gender, String address, String email, String phone, String date) {
        try {
            Connection connect = (Connection) DBconnection.connectDB();
            PreparedStatement st = (PreparedStatement) connect.prepareStatement("INSERT INTO visitors VALUES (?,?,?,?,?,?,?,?,?)");
            st.setInt(1, 0);
            st.setString(2, fname);
            st.setString(3, lname);
            st.setInt(4, age);
            st.setString(5, gender);
            st.setString(6, address);
            st.setString(7, email);
            st.setString(8, phone);
            st.setString(9, date);
            int x = st.executeUpdate();
            JOptionPane.showMessageDialog(this, "Visitors added successfully");
            vname1.setText("");
            vname2.setText("");
            vage.setText("");
            vadd.setText("");
            vphone.setText("");
            vemail.setText("");
            vdate.setText("");
            connect.close();
            Insert();
        } catch (SQLException ex) {
            Logger.getLogger(Visitors.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void Insert() {
        int id = 0;
        String fname = "";
        String lname = "";
        int age = 0;
        String gender = "";
        String address = "";
        String email = "";
        String phone = "";
        String date = "";
        try {
            Connection conn = (Connection) DBconnection.connectDB();
            PreparedStatement add = (PreparedStatement) conn.prepareStatement("SELECT * FROM visitors");
            ResultSet rs = add.executeQuery();
//            table1.setModel(DbUtils.resultSetToTableModel(rs));
            int no_row = table1.getRowCount();
            for (int i = 0; i < no_row; i++) {
                if (rs.next()) {
                    id = rs.getInt(1);
                    fname = rs.getString(2);
                    lname = rs.getString(3);
                    age = rs.getInt(4);
                    gender = rs.getString(5);
                    address = rs.getString(6);
                    email = rs.getString(7);
                    phone = rs.getString(8);
                    date = rs.getString(9);

                    table1.setValueAt(id, i, 0);
                    table1.setValueAt(fname, i, 1);
                    table1.setValueAt(lname, i, 2);
                    table1.setValueAt(age, i, 3);
                    table1.setValueAt(gender, i, 4);
                    table1.setValueAt(address, i, 5);
                    table1.setValueAt(email, i, 6);
                    table1.setValueAt(phone, i, 7);
                    table1.setValueAt(date, i, 8);
                }
            }
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(Visitors.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void deleteVisitor(String y) {
        int b = JOptionPane.showConfirmDialog(this, "confirm?", "", JOptionPane.YES_NO_OPTION);
        if (b == JOptionPane.YES_OPTION) {
            try {
                Connection conn = (Connection) DBconnection.connectDB();
                PreparedStatement delete = (PreparedStatement) conn.prepareStatement("DELETE FROM visitors WHERE id=?");
                delete.setInt(1, Integer.parseInt(y));
                int x = delete.executeUpdate();
                conn.close();
                clearTable();
                Insert();
            } catch (SQLException ex) {
                Logger.getLogger(Visitors.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private void clearTable() {
        int no = table1.getRowCount();
        for (int i = 0; i < no; i++) {
            table1.setValueAt(null, i, 0);
            table1.setValueAt(null, i, 1);
            table1.setValueAt(null, i, 2);
            table1.setValueAt(null, i, 3);
            table1.setValueAt(null, i, 4);
            table1.setValueAt(null, i, 5);
            table1.setValueAt(null, i, 6);
            table1.setValueAt(null, i, 7);
            table1.setValueAt(null, i, 8);
        }
    }

    private void updateVisitor(int id, String fname, String lname, int age, String gender, String address, String email, String phone, String date) {
        try {
            Connection conn = (Connection) DBconnection.connectDB();
            PreparedStatement update = (PreparedStatement) conn.prepareStatement("UPDATE visitors SET first_name=?,last_name=?,age=?,gender=?,address=?,email=?,phone=?,date=? WHERE id=? ");

            update.setString(1, fname);
            update.setString(2, lname);
            update.setInt(3, age);
            update.setString(4, gender);
            update.setString(5, address);
            update.setString(6, email);
            update.setString(7, phone);
            update.setString(8, date);
            update.setInt(9, id);
            int x = update.executeUpdate();
            JOptionPane.showMessageDialog(this, "visitor updated ");
            updialog.setVisible(false);
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(Visitors.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

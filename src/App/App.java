/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package App;

import com.database.DataBase;
import com.reference.Product;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class App extends javax.swing.JFrame {
    
    ArrayList<Product> listProduct = new ArrayList<>();
    
    public void clear() {
        in_nama.setText("");
        in_harga.setText("");
        in_stok.setText("");
        in_nama.requestFocus();
    }
    
    public void insertData() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int row = jTable1.getRowCount();
        model.addRow(new Object[] {
            row += 1,
            in_nama.getText(),
            in_harga.getText(),
            in_stok.getText()
        });
    }
    
    private void deleteData() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowSelected = jTable1.getSelectedRow();
        
        if (rowSelected >= 0) {
            int confirm = JOptionPane.showConfirmDialog(this, "Hapus?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                model.removeRow(rowSelected);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Tidak ada baris yang dipilih", "Pilih baris", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void updateTotal(String in_harga, String in_stok) {
        try {
           int intHarga = Integer.parseInt(in_harga);
           int intJumlah = Integer.parseInt(in_stok);
           in_total.setText(String.format("Rp. %d", intHarga * intJumlah));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public App() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        in_nama = new javax.swing.JTextField();
        in_harga = new javax.swing.JTextField();
        in_stok = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        in_total = new javax.swing.JTextField();
        in_kembali = new javax.swing.JTextField();
        in_tunai = new javax.swing.JTextField();
        btn_hitung = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 37, 8));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 188, 135));
        jLabel1.setText("NAD-STORE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(376, 376, 376)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 39, 5));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setText("Harga");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setText("Stok");

        in_nama.setBackground(new java.awt.Color(0, 39, 0));
        in_nama.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        in_nama.setForeground(new java.awt.Color(204, 204, 204));
        in_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_namaActionPerformed(evt);
            }
        });

        in_harga.setBackground(new java.awt.Color(0, 39, 12));
        in_harga.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        in_harga.setForeground(new java.awt.Color(204, 204, 204));
        in_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_hargaActionPerformed(evt);
            }
        });

        in_stok.setBackground(new java.awt.Color(0, 39, 12));
        in_stok.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        in_stok.setForeground(new java.awt.Color(204, 204, 204));
        in_stok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_stokActionPerformed(evt);
            }
        });

        btn_tambah.setBackground(new java.awt.Color(0, 143, 83));
        btn_tambah.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_tambah.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambah.setText("Tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_edit.setBackground(new java.awt.Color(204, 188, 135));
        btn_edit.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(0, 0, 0));
        btn_delete.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_clear.setBackground(new java.awt.Color(204, 0, 23));
        btn_clear.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tunai");

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kembali");

        in_total.setEditable(false);
        in_total.setBackground(new java.awt.Color(0, 39, 0));
        in_total.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        in_total.setForeground(new java.awt.Color(255, 255, 255));
        in_total.setText("Rp.");
        in_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_totalActionPerformed(evt);
            }
        });

        in_kembali.setEditable(false);
        in_kembali.setBackground(new java.awt.Color(0, 39, 0));
        in_kembali.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        in_kembali.setForeground(new java.awt.Color(255, 255, 255));
        in_kembali.setText("Rp.");
        in_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_kembaliActionPerformed(evt);
            }
        });

        in_tunai.setBackground(new java.awt.Color(0, 39, 0));
        in_tunai.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        in_tunai.setForeground(new java.awt.Color(255, 255, 255));
        in_tunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_tunaiActionPerformed(evt);
            }
        });

        btn_hitung.setBackground(new java.awt.Color(0, 143, 83));
        btn_hitung.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_hitung.setForeground(new java.awt.Color(255, 255, 255));
        btn_hitung.setText("Hitung");
        btn_hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hitungActionPerformed(evt);
            }
        });

        btn_simpan.setBackground(new java.awt.Color(0, 143, 83));
        btn_simpan.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_simpan.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(in_total, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                            .addComponent(in_tunai)
                            .addComponent(in_kembali)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_hitung)
                        .addGap(28, 28, 28)
                        .addComponent(btn_simpan)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(in_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(in_tunai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(in_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_hitung)
                    .addComponent(btn_simpan))
                .addGap(16, 16, 16))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama", "Harga", "Stok"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(in_harga, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                            .addComponent(in_stok)
                            .addComponent(in_nama)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_tambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(in_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(in_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(in_stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_tambah)
                            .addComponent(btn_edit)
                            .addComponent(btn_delete)
                            .addComponent(btn_clear))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void in_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_namaActionPerformed
      
    }//GEN-LAST:event_in_namaActionPerformed

    private void in_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_hargaActionPerformed
        
    }//GEN-LAST:event_in_hargaActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed

        if (in_nama.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nama barang belum di input");
        } else if (in_harga.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Harga barang belum di input");
        } else if(in_stok.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Stok barang belum di input");
        } else {
            insertData();
            listProduct.add(new Product(in_nama.getText(), Integer.parseInt(in_harga.getText()),Integer.parseInt(in_stok.getText())));
            clear();
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        clear();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        DataBase.deleteDB();
        DataBase.insertDB(listProduct);
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hitungActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowSelected = jTable1.getSelectedRow();
        
        try {
            String valueHarga = model.getValueAt(rowSelected, 2).toString();
            String valueJumlah = model.getValueAt(rowSelected, 3).toString();
            int intHarga = Integer.parseInt(valueHarga);
            int intJumlah = Integer.parseInt(valueJumlah);
            int intTunai = Integer.parseInt(in_tunai.getText());
            if (intTunai >= intHarga * intJumlah) {
                in_kembali.setText(String.format("Rp. %d", intTunai -  intHarga * intJumlah));
            } else {
                int confirm = JOptionPane.showConfirmDialog(this, "Uang anda tidak cukup", "Konfirmasi pembelian", JOptionPane.YES_NO_OPTION);

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_hitungActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowSelect = jTable1.getSelectedRow();
        if (rowSelect >= 0) {
            if (btn_edit.getText() == "Edit") {
            btn_tambah.setEnabled(false);
            btn_delete.setEnabled(false);
            btn_edit.setText("Update");
            btn_hitung.setEnabled(false);
            btn_simpan.setEnabled(false);
            in_nama.setText(model.getValueAt(rowSelect, 1).toString());
            in_harga.setText(model.getValueAt(rowSelect, 2).toString());
            in_stok.setText(model.getValueAt(rowSelect, 3).toString());
            
            } else {
            btn_tambah.setEnabled(true);
            btn_delete.setEnabled(true);
            btn_edit.setText("Edit");
            btn_hitung.setEnabled(true);
            btn_simpan.setEnabled(true);
            model.setValueAt(in_nama.getText(), rowSelect, 1);
            model.setValueAt(in_harga.getText(), rowSelect, 2);
            model.setValueAt(in_stok.getText(), rowSelect, 3);
            for (int i = 0; i<listProduct.size();i++) {
                listProduct.set(rowSelect, new Product(in_nama.getText(), Integer.parseInt(in_harga.getText()),Integer.parseInt(in_stok.getText())));
            }
            clear();
            }   
        
        } else {
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin diubah", "Pilih baris", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_editActionPerformed

   private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowSelected = jTable1.getSelectedRow();
        
        String valueHarga = model.getValueAt(rowSelected, 2).toString();
        String valueJumlah = model.getValueAt(rowSelected, 3).toString();
        updateTotal(valueHarga, valueJumlah);
    }                                    
   
    
    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int rowSelected = jTable1.getSelectedRow();
        deleteData();
        listProduct.remove(rowSelected);
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void in_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_totalActionPerformed
  
    }//GEN-LAST:event_in_totalActionPerformed

    private void in_stokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_stokActionPerformed
    }//GEN-LAST:event_in_stokActionPerformed

    private void in_tunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_tunaiActionPerformed
    }//GEN-LAST:event_in_tunaiActionPerformed

    private void in_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_kembaliActionPerformed
    }//GEN-LAST:event_in_kembaliActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hitung;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JTextField in_harga;
    private javax.swing.JTextField in_kembali;
    private javax.swing.JTextField in_nama;
    private javax.swing.JTextField in_stok;
    private javax.swing.JTextField in_total;
    private javax.swing.JTextField in_tunai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

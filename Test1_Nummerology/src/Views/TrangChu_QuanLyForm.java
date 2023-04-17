/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import DomainModels.QuanLy;
import DomainModels.TaiKhoan;
import Service.impl.QuanLy_Service_impl;
import Service.impl.TK_Service_impl;
import Services.QuanLyService;
import Services.TKService;
import View_Model.QuanLyViewModel;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class TrangChu_QuanLyForm extends javax.swing.JInternalFrame {

    List<QuanLyViewModel> ListQuanLy;
    QuanLyService quanLySer = new QuanLy_Service_impl();
    DefaultTableModel dtm;

    void showDataTable(List<QuanLyViewModel> lst) {
        dtm.setRowCount(0);
        for (QuanLyViewModel x : lst) {
            dtm.addRow(x.toDataRow());
        }
    }

    public TrangChu_QuanLyForm() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        dtm = (DefaultTableModel) tbQuanLy.getModel();
        ListQuanLy = quanLySer.getALL();
        showDataTable(ListQuanLy);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbQuanLy = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNgay = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTK = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtThang = new javax.swing.JTextField();
        txtNam = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnCreat = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtMK = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbQuanLy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Ma", "Ten", "Ngay", "Thang", "Nam", "TK", "MK"
            }
        ));
        tbQuanLy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbQuanLyMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbQuanLy);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(51, 204, 0));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel1.setText("Tên");

        txtNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayActionPerformed(evt);
            }
        });

        jLabel2.setText("BirthDay");

        txtTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTKActionPerformed(evt);
            }
        });

        jLabel3.setText("Tài khoản");

        jLabel4.setText("Mật khẩu");

        txtThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThangActionPerformed(evt);
            }
        });

        txtNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamActionPerformed(evt);
            }
        });

        jLabel5.setText("Email:");

        btnCreat.setText("Thêm");
        btnCreat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jButton3.setText("Xuất");

        jLabel7.setText("dd/");

        jLabel8.setText("mm/");

        jLabel9.setText("yy/");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCreat)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreat)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(jButton3))
                .addGap(72, 72, 72))
        );

        jLabel6.setText("Search:");

        jTextField8.setText("Name");

        jButton4.setText("Tìm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayActionPerformed

    private void txtTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTKActionPerformed

    private void txtThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtThangActionPerformed

    private void txtNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamActionPerformed


    private void btnCreatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatActionPerformed
        StringBuilder sb = new StringBuilder();
        TKService tkSer = new TK_Service_impl();
        if (txtEmail.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Mã'");
        } else if (txtName.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Tên'");
        } else if (txtNgay.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Ngày'");
        } else if (txtThang.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Tháng'");
        } else if (txtNam.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Nam'");
        } else if (txtTK.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Tài khoản'");
        } else if (txtMK.getPassword().equals("")) {
            sb.append("Bạn chưa nhập 'Mật khẩu'");
        }

        if (sb.length() > 0) {
            JOptionPane.showConfirmDialog(this, sb.toString(), "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String ma = txtEmail.getText();
        String ten = txtName.getText();
        String ngay = txtNgay.getText();
        int ngayInt = Integer.parseInt(ngay);
        String thang = txtThang.getText();
        int thangInt = Integer.parseInt(thang);
        String nam = txtNam.getText();
        int namInt = Integer.parseInt(nam);
        String taikhoan = txtTK.getText();
        String mk = new String(txtMK.getPassword());

        TaiKhoan tk = new TaiKhoan();
        QuanLy quanLy = new QuanLy();

        tk.setTK(taikhoan);
        tk.setMK(mk);
        tkSer.creat(tk);

        quanLy.setMaQL(ma);
        quanLy.setTenQL(ten);
        quanLy.setNgay(ngayInt);
        quanLy.setThang(thangInt);
        quanLy.setNam(namInt);
        quanLy.setFTK(taikhoan);

        //thêm dữ liệu vào danh sách
        quanLySer.creat(quanLy);
        ListQuanLy = quanLySer.getALL();
        showDataTable(ListQuanLy);

        JOptionPane.showConfirmDialog(this, "Đã thêm thành công");
        txtEmail.setText("");
        txtName.setText("");
        txtNgay.setText("");
        txtThang.setText("");
        txtNam.setText("");
        txtTK.setText("");
        txtMK.setText("");

    }//GEN-LAST:event_btnCreatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        StringBuilder sb = new StringBuilder();
        int count = 0;
        if (txtEmail.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Mã'");
        } else if (txtName.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Tên'");
        }

        if (sb.length() > 0) {
            JOptionPane.showConfirmDialog(this, sb.toString(), "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        for (QuanLyViewModel quanLy : ListQuanLy) {

            if (quanLy.getMaQL().equals(txtEmail.getText())) {
                int choice = JOptionPane.showConfirmDialog(this, "Bạnn có muốn xóa không?", "Xác nhận.", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_NO_OPTION) {
                    quanLySer.delete(quanLy.getMaQL());
                    ListQuanLy = quanLySer.getALL();
                    showDataTable(ListQuanLy);
                    JOptionPane.showConfirmDialog(this, "Đã xóa thành công");
                    return;
                }
                count++;

            }
        }
        if (count == 0) {
            JOptionPane.showConfirmDialog(this, "Không tìm thấy");

        }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        StringBuilder sb = new StringBuilder();
        TKService tkSer = new TK_Service_impl();
        QuanLy quanly = new QuanLy();
        if (txtEmail.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Mã'");
        } else if (txtName.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Tên'");
        } else if (txtNgay.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Ngày'");
        } else if (txtThang.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Tháng'");
        } else if (txtNam.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Nam'");
        } else if (txtTK.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Tài khoản'");
        } else if (txtMK.getPassword().equals("")) {
            sb.append("Bạn chưa nhập 'Mật khẩu'");
        }

        if (sb.length() > 0) {
            JOptionPane.showConfirmDialog(this, sb.toString(), "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String ma = txtEmail.getText();
        String ten = txtName.getText();
        String ngay = txtNgay.getText();
        int ngayInt = Integer.parseInt(ngay);
        String thang = txtThang.getText();
        int thangInt = Integer.parseInt(thang);
        String nam = txtNam.getText();
        int namInt = Integer.parseInt(nam);
        String taikhoan = txtTK.getText();
        String mk = new String(txtMK.getPassword());

        TaiKhoan tk = new TaiKhoan();
        QuanLy quanLy = new QuanLy();

        tk.setTK(taikhoan);
        tk.setMK(mk);
        tkSer.creat(tk);
        quanLy.setMaQL(ma);
        quanLy.setTenQL(ten);
        quanLy.setNgay(ngayInt);
        quanLy.setThang(thangInt);
        quanLy.setNam(namInt);
        quanLy.setFTK(taikhoan);
        //thêm dữ liệu vào danh sách
        quanLySer.update(quanLy, ma);
        ListQuanLy = quanLySer.getALL();
        showDataTable(ListQuanLy);

    }//GEN-LAST:event_btnSuaActionPerformed

    private void tbQuanLyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbQuanLyMouseClicked

        int selected = tbQuanLy.getSelectedRow();
        if (selected >= 0) {
            String Name = (String) tbQuanLy.getValueAt(selected, 2);
            for (QuanLyViewModel quanLy : ListQuanLy) {
                if (quanLy.getTenQL().equals(Name)) {

                    txtEmail.setText(quanLy.getMaQL());
                    txtName.setText(quanLy.getTenQL());
                    txtNgay.setText(quanLy.getNgay() + "");
                    txtThang.setText(quanLy.getThang() + "");
                    txtNam.setText(quanLy.getNam() + "");
                    txtTK.setText(quanLy.getTK());
                    txtMK.setText(quanLy.getMK());

                }
            }
        }
    }//GEN-LAST:event_tbQuanLyMouseClicked

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
            java.util.logging.Logger.getLogger(TrangChu_QuanLyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu_QuanLyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu_QuanLyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu_QuanLyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu_QuanLyForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreat;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTable tbQuanLy;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtMK;
    private javax.swing.JTextField txtNam;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNgay;
    private javax.swing.JTextField txtTK;
    private javax.swing.JTextField txtThang;
    // End of variables declaration//GEN-END:variables
}

package Form;

import Connect.Ketnoi;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class KhachHang extends javax.swing.JFrame {

    /**
     * Creates new form KhachHang
     */
    int index;
    Ketnoi k = new Ketnoi();
    DefaultTableModel model = new DefaultTableModel();
    private static String driver;
    private static String dburl;
    private static String user;
    private static String pass;
    static{
        try {
            BufferedReader out = new BufferedReader(new FileReader("change.txt"));
            driver = out.readLine();
            dburl = out.readLine();
            user = out.readLine();
            pass = out.readLine(); 
            Class.forName(driver);
        } catch (Exception e) {
        }
    }
    Connection cn; 

    public KhachHang() {
        try {
            initComponents();
            setTitle("Khách Hàng");
            setLocationRelativeTo(null);
            k.connect();
            cn = DriverManager.getConnection(dburl,user,pass);
        } catch (SQLException ex) {
            Logger.getLogger(KhachHang.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        btnTien = new javax.swing.JButton();
        btnLui = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtMaKhachHang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTenKhachHang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnTaoMoi = new javax.swing.JButton();
        btnMoFile = new javax.swing.JButton();
        btnDong = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtTimKiem.setBackground(new java.awt.Color(231, 231, 231));
        txtTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtTimKiem.setText("Nhập mã nhân viên để tìm kiếm");
        txtTimKiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(231, 231, 231), 8));
        txtTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTimKiemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtTimKiemMouseEntered(evt);
            }
        });

        btnTimKiem.setBackground(new java.awt.Color(22, 123, 255));
        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setText("Tìm kiếm\n");
        btnTimKiem.setBorderPainted(false);
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnTien.setBackground(new java.awt.Color(22, 123, 255));
        btnTien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTien.setForeground(new java.awt.Color(255, 255, 255));
        btnTien.setText(">>");
        btnTien.setBorderPainted(false);
        btnTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTienActionPerformed(evt);
            }
        });

        btnLui.setBackground(new java.awt.Color(22, 123, 255));
        btnLui.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLui.setForeground(new java.awt.Color(255, 255, 255));
        btnLui.setText("<<");
        btnLui.setBorderPainted(false);
        btnLui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuiActionPerformed(evt);
            }
        });

        tblKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Họ Tên", "Địa chỉ", "Email", "Số điên thoại"
            }
        ));
        tblKhachHang.setSelectionBackground(new java.awt.Color(22, 123, 255));
        tblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhachHang);
        if (tblKhachHang.getColumnModel().getColumnCount() > 0) {
            tblKhachHang.getColumnModel().getColumn(0).setMinWidth(70);
            tblKhachHang.getColumnModel().getColumn(0).setPreferredWidth(70);
            tblKhachHang.getColumnModel().getColumn(0).setMaxWidth(70);
            tblKhachHang.getColumnModel().getColumn(1).setMinWidth(140);
            tblKhachHang.getColumnModel().getColumn(1).setPreferredWidth(140);
            tblKhachHang.getColumnModel().getColumn(1).setMaxWidth(140);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Mã khách hàng");

        txtMaKhachHang.setBackground(new java.awt.Color(231, 231, 231));
        txtMaKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaKhachHang.setForeground(new java.awt.Color(102, 102, 102));
        txtMaKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(231, 231, 231), 4));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Tên Khách Hàng");

        txtTenKhachHang.setBackground(new java.awt.Color(231, 231, 231));
        txtTenKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTenKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(231, 231, 231), 4));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Địa chỉ");

        txtDiaChi.setBackground(new java.awt.Color(231, 231, 231));
        txtDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDiaChi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(231, 231, 231), 4));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Email");

        txtEmail.setBackground(new java.awt.Color(231, 231, 231));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(231, 231, 231), 4));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Số điện thoại");

        txtSDT.setBackground(new java.awt.Color(231, 231, 231));
        txtSDT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSDT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(231, 231, 231), 4));

        btnThem.setBackground(new java.awt.Color(46, 213, 115));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.setBorderPainted(false);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnTaoMoi.setBackground(new java.awt.Color(22, 123, 255));
        btnTaoMoi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTaoMoi.setForeground(new java.awt.Color(255, 255, 255));
        btnTaoMoi.setText("Tạo mới");
        btnTaoMoi.setBorderPainted(false);
        btnTaoMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoMoiActionPerformed(evt);
            }
        });

        btnMoFile.setBackground(new java.awt.Color(255, 165, 2));
        btnMoFile.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMoFile.setForeground(new java.awt.Color(255, 255, 255));
        btnMoFile.setText("Mở File");
        btnMoFile.setBorderPainted(false);
        btnMoFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoFileActionPerformed(evt);
            }
        });

        btnDong.setBackground(new java.awt.Color(47, 53, 66));
        btnDong.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDong.setForeground(new java.awt.Color(255, 255, 255));
        btnDong.setText("Đóng");
        btnDong.setBorderPainted(false);
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 71, 87));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xoá");
        btnXoa.setBorderPainted(false);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(255, 51, 255));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa");
        btnSua.setBorderPainted(false);
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnFirst.setBackground(new java.awt.Color(22, 123, 255));
        btnFirst.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFirst.setForeground(new java.awt.Color(255, 255, 255));
        btnFirst.setText("|<");
        btnFirst.setBorderPainted(false);
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnLast.setBackground(new java.awt.Color(22, 123, 255));
        btnLast.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLast.setForeground(new java.awt.Color(255, 255, 255));
        btnLast.setText(">|");
        btnLast.setBorderPainted(false);
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTaoMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnMoFile, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFirst)
                        .addGap(30, 30, 30)
                        .addComponent(btnLui)
                        .addGap(35, 35, 35)
                        .addComponent(btnTien)
                        .addGap(28, 28, 28)
                        .addComponent(btnLast)))
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnFirst, btnLast, btnLui, btnTien});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(btnTien, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(btnLui, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTimKiem))
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnMoFile)
                    .addComponent(btnXoa)
                    .addComponent(btnTaoMoi)
                    .addComponent(btnSua)
                    .addComponent(btnDong))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnFirst, btnLast, btnLui, btnTien});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        // Đóng form
        try {
            int hoi = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn thoát không ?", "Thoát", JOptionPane.YES_NO_OPTION);
            if (hoi != JOptionPane.YES_OPTION) {
                return;
            } else {
            }
            Menu mn = new Menu();
            mn.setVisible(true);
            this.setVisible(false);
        } catch (HeadlessException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnDongActionPerformed

    private void btnTaoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoiActionPerformed
        try {
            clearForm();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Lỗi làm mới");
        }
    }//GEN-LAST:event_btnTaoMoiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không ?");
            if (hoi != JOptionPane.YES_OPTION) {
                return;
            } else {
            }
            String sql = "delete from khhang where MAkh = ?";
            PreparedStatement st = k.cn.prepareStatement(sql);
            st.setString(1, txtMaKhachHang.getText());
            st.executeUpdate();
            loadDataToTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "lỗi xóa");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        if (tblKhachHang.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Trong bảng chưa có dữ liệu");
            return;
        } else {
            index = tblKhachHang.getRowCount();
            for (int i = 0; i < index; i++) {
                if (tblKhachHang.getValueAt(i, 0).toString().equalsIgnoreCase(txtTimKiem.getText())) {
                    showDetail(i);
                    JOptionPane.showMessageDialog(this, "Bạn đã tìm được khách hàng : " + tblKhachHang.getValueAt(i, 1).toString());
                    break;
                } 
            }
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void tblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMouseClicked
        try {
            index = tblKhachHang.getSelectedRow();
            showDetail(index);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblKhachHangMouseClicked

    private void txtTimKiemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimKiemMouseEntered
    }//GEN-LAST:event_txtTimKiemMouseEntered

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
            if (!checkNull()) {
                return;
            }
            try {
                Integer.parseInt(txtSDT.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Số điện thoại phải là số");
                return;
            }
            if (!checkDup()) {
                return;
            }
            String sql = "insert into khhang values(?,?,?,?,?)";
            PreparedStatement st = k.cn.prepareStatement(sql);
            st.setString(1, txtMaKhachHang.getText());
            st.setString(2, txtTenKhachHang.getText());
            st.setString(3, txtDiaChi.getText());
            st.setString(4, txtEmail.getText());
            st.setString(5, txtSDT.getText());
            st.executeUpdate();
            loadDataToTable();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Lỗi thêm");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnLuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuiActionPerformed
        try {
            if (index >= 0) {
                index--;
                showDetail(index);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnLuiActionPerformed

    private void btnTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTienActionPerformed
        try {
            if (index <= tblKhachHang.getRowCount() - 1) {
                index++;
                showDetail(index);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnTienActionPerformed

    private void btnMoFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoFileActionPerformed
        if ("Quangdzqua".equalsIgnoreCase(JOptionPane.showInputDialog("Mời nhập mã công ty để mở dữ liệu"))) {
            loadDataToTable();
            index = 0;
            showDetail(index);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn đã nhập sai");
        }
    }//GEN-LAST:event_btnMoFileActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try {
            if (!checkNull()) {
                return;
            }
            try {
                Integer.parseInt(txtSDT.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Số điện thoại phải là số");
                return;
            }  
            String sql = "update khhang set tenkh = ?, diachi = ?,email =?, dienthoai = ? where makh = ?";
            PreparedStatement st = k.cn.prepareStatement(sql);
            st.setString(1, txtTenKhachHang.getText());
            st.setString(2, txtDiaChi.getText());
            st.setString(3, txtEmail.getText());
            st.setString(4, txtSDT.getText());
            st.setString(5, txtMaKhachHang.getText());
            if (tblKhachHang.getValueAt(index, 0).toString().equalsIgnoreCase(txtMaKhachHang.getText())) {
                st.executeUpdate();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Mã khách hàng phải giống trong bảng");
            }
            loadDataToTable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Lỗi sửa");
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void txtTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimKiemMouseClicked
        txtTimKiem.setText("");
    }//GEN-LAST:event_txtTimKiemMouseClicked

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        try {
            index = 0;
            showDetail(index);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
         try {
            index = tblKhachHang.getRowCount() - 1;
            showDetail(index);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnLastActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnLui;
    private javax.swing.JButton btnMoFile;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaoMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTien;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKhachHang;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private void clearForm() {
        txtMaKhachHang.setText("");
        txtTenKhachHang.setText("");
        txtDiaChi.setText("");
        txtSDT.setText("");
        txtEmail.setText("");
    }

    private void loadDataToTable() {
        try {
            model = (DefaultTableModel) tblKhachHang.getModel();
            model.setRowCount(0);
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM KHHANG");
            while (rs.next()) {
                Vector row = new Vector();
                row.add(rs.getString(1));
                row.add(rs.getString(2));
                row.add(rs.getString(3));
                row.add(rs.getString(4));
                row.add(rs.getString(5));
                model.addRow(row);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi add data");
        }
    }

    private void showDetail(int index) {
        txtMaKhachHang.setText(tblKhachHang.getValueAt(index, 0).toString());
        txtTenKhachHang.setText(tblKhachHang.getValueAt(index, 1).toString());
        txtDiaChi.setText(tblKhachHang.getValueAt(index, 2).toString());
        txtEmail.setText(tblKhachHang.getValueAt(index, 3).toString());
        txtSDT.setText(tblKhachHang.getValueAt(index, 4).toString());
        tblKhachHang.setRowSelectionInterval(index, index);
    }

    private boolean checkNull() {
        if (txtMaKhachHang.getText().isEmpty()) {
            txtMaKhachHang.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Mã khách hàng trống");
            return false;
        } else if (txtTenKhachHang.getText().isEmpty()) {
            txtTenKhachHang.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Tên khách hàng trống");
            return false;
        } else if (txtDiaChi.getText().isEmpty()) {
            txtDiaChi.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Địa chỉ trống");
            return false;
        } else if (txtEmail.getText().isEmpty()) {
            txtTenKhachHang.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Email trống");
            return false;
        } else if (txtSDT.getText().isEmpty()) {
            txtSDT.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Số điện thoại trống");
            return false;
        } else if ((txtEmail.getText().endsWith(".com")|| txtEmail.getText().endsWith(".COM") || txtEmail.getText().endsWith(".Com")|| txtEmail.getText().endsWith(".COm")|| txtEmail.getText().endsWith(".cOM")|| txtEmail.getText().endsWith(".coM")) == false ) {
            txtEmail.requestFocus();
            JOptionPane.showMessageDialog(this, "Email phải kết thúc bằng đuôi \".com\"");
            return false;
        }else {
            return true;
        }
    }

    private boolean checkDup() {
        if (tblKhachHang.getValueAt(index, 0).toString().equalsIgnoreCase(txtMaKhachHang.getText())) {
            txtMaKhachHang.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Mã khách hàng đã tồn tại");
            return false;
        } else {
            return true;
        }
    }
}

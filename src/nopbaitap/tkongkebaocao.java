/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nopbaitap;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author huynx
 */
public class tkongkebaocao extends javax.swing.JFrame {

    final String header[] = {"MA BAO CAO", "TEN BAO CAO", "MA HOA DON", "THOI GIAN", "DOANH THU"};
    final DefaultTableModel tb = new DefaultTableModel(header, 0);
    connect cn = new connect();
    Connection conn;

    /**
     * Creates new form quanlisanpham
     */
    public tkongkebaocao() {
        initComponents();
        loadbang();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtma = new javax.swing.JTextField();
        txtten = new javax.swing.JTextField();
        txtmahd = new javax.swing.JTextField();
        txttg = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtdt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        qlsp = new javax.swing.JTable();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        ud = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ma Bao Cao");

        jLabel2.setText("Ten Bao Cao");

        jLabel3.setText("Ma hoa don");

        jLabel4.setText("Thoi gian");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("THONG KE BAO CAO");

        jLabel6.setText("Doanh thu");

        qlsp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ma San Pham", "Tên San Pham", "So Luong", "Gia", "Mo Ta"
            }
        ));
        qlsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qlspMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(qlsp);

        btnthem.setText("Them");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setText("Sua");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setText("Xoa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        ud.setText("TRO VE");
        ud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                udActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtdt, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txttg, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(btnthem))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnsua)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnxoa)))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ud)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtmahd, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(252, 252, 252)
                                .addComponent(jLabel5)))
                        .addContainerGap(274, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmahd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txttg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem)
                    .addComponent(btnsua)
                    .addComponent(btnxoa)
                    .addComponent(ud))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void udActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_udActionPerformed
        // TODO add your handling code here:
          this.dispose();
              chonchucnang chon = new chonchucnang();
              chon.setVisible(true);
    }//GEN-LAST:event_udActionPerformed
//code them
    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        conn = cn.getConnection();
        try {
            if (txtma.getText().equals("") || txtten.getText().equals("")
                    || txtmahd.getText().equals("") || txttg.getText().equals("") || txtdt.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "chua nhap du du lieu");
            } else {
                StringBuffer sb = new StringBuffer();
                String sql_check_pk = "Select MaBC from Baocao where MaBC='" + txtma.getText() + "'";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql_check_pk);
                if (rs.next()) {
                    sb.append("San pham da ton tai");
                }
                if (sb.length() > 0) {
                    JOptionPane.showMessageDialog(this, sb.toString());

                } else {
                    String sql = "Insert into Baocao values('" + txtma.getText() + "','" + txtmahd.getText() + "'," + "'" + txtten.getText() + "','" + txttg.getText() + "','" + txtdt.getText() + "')";
                    st = conn.createStatement();
                    //  st.executeUpdate(sql);
                    int kq = st.executeUpdate(sql);
                    if (kq > 0) {
                        JOptionPane.showMessageDialog(this, "them moi thanh cong");
                        // loadbang();
                        xoatrang();
                    }
                }
                rs.close();
                st.close();
            }
            conn.close();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnthemActionPerformed
    private void xoatrang() {
        txtma.setText("");
        txtten.setText("");
        txtmahd.setText("");
        txttg.setText("");
        txtdt.setText("");
        // txtma.setEnabled(true);
        loadbang();
    }
    private void qlspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qlspMouseClicked
        // TODO add your handling code here:
        int x = qlsp.getSelectedRow();
        if (x >= 0) {
            txtma.setText(qlsp.getValueAt(x, 0) + "");
            txtten.setText(qlsp.getValueAt(x, 1) + "");
            txtmahd.setText(qlsp.getValueAt(x, 2) + "");
            txttg.setText(qlsp.getValueAt(x, 3) + "");
            txtdt.setText(qlsp.getValueAt(x, 4) + "");
           // txtma.setEnabled(false);
        }
    }//GEN-LAST:event_qlspMouseClicked
// fix cai nay code sua
    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        conn = cn.getConnection();
        try {
            if (txtten.getText().equals("")
                    || txtmahd.getText().equals("") || txttg.getText().equals("") || txtdt.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "chua nhap du du lieu");
            }
            {
                Statement st = conn.createStatement();
                String sql = "Update Baocao set TenBC ='" + txtten.getText() + "',Thoigian='"+txttg.getText()+"',Mahoadon='"+txtmahd.getText()+"',Doanhthu='"+txtdt.getText()+"' where MaBC='" + txtma.getText() + "' ";
                st = conn.createStatement();
                //  st.executeUpdate(sql);
                int kq = st.executeUpdate(sql);
                if (kq > 0) {
                    JOptionPane.showMessageDialog(this, "sua thanh cong");
                    // loadbang();
                    xoatrang();
                }
                else {
                JOptionPane.showMessageDialog(this, "sua that bai !!");
                }
                st.close();
            }

            conn.close();

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnsuaActionPerformed
//code xoa
    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        conn = cn.getConnection();
        try {
            String sql = "delete Baocao where MaBC ='" + txtma.getText() + "'";
            Statement st = conn.createStatement();
            int thongb = JOptionPane.showConfirmDialog(this, "xoa nha", "thong bao", JOptionPane.YES_NO_OPTION);
            if (thongb == JOptionPane.YES_OPTION) {
                st.executeUpdate(sql);
                xoatrang();
                JOptionPane.showMessageDialog(this, "xoa thanh cong");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnxoaActionPerformed
    //load bang

    public void loadbang() {
        try {
            conn = cn.getConnection();
            int number;
            Vector row;
            String sql = "select * from Baocao";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData metadata = rs.getMetaData();
            number = metadata.getColumnCount();
            tb.setRowCount(0);
            while (rs.next()) {
                row = new Vector();
                int i;
                for (i = 1; i <= number; i++) {
                    row.addElement(rs.getString(i));
                }
                tb.addRow(row);
                qlsp.setModel(tb);
            }
            st.close();
            rs.close();
            conn.close();
        } catch (Exception e) {

        }
        //  ddaayd chu len text
        qlsp.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (qlsp.getSelectedRow() >= 0) {
                    txtma.setText(qlsp.getValueAt(qlsp.getSelectedRow(), 0) + "");
                    txtten.setText(qlsp.getValueAt(qlsp.getSelectedRow(), 1) + "");
                    txtmahd.setText(qlsp.getValueAt(qlsp.getSelectedRow(), 2) + "");
                    txttg.setText(qlsp.getValueAt(qlsp.getSelectedRow(), 3) + "");
                    txtdt.setText(qlsp.getValueAt(qlsp.getSelectedRow(), 4) + "");
                }
            }
        });

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
            java.util.logging.Logger.getLogger(tkongkebaocao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tkongkebaocao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tkongkebaocao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tkongkebaocao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tkongkebaocao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable qlsp;
    private javax.swing.JTextField txtdt;
    private javax.swing.JTextField txtma;
    private javax.swing.JTextField txtmahd;
    private javax.swing.JTextField txtten;
    private javax.swing.JTextField txttg;
    private javax.swing.JButton ud;
    // End of variables declaration//GEN-END:variables
}

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
public class quanlinhanvien extends javax.swing.JFrame {

    final String header[] = {"MANV", "TENV", "GIOI TINH", "DIA CHI", "SDT", "CHUC VU", "NGAY SINH", };
    final DefaultTableModel tb = new DefaultTableModel(header, 0);
    connect cn = new connect();
    Connection conn;

    /**
     * Creates new form quanlinhanvien
     */
    public quanlinhanvien() {
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

        jLabel1 = new javax.swing.JLabel();
        txtma = new javax.swing.JTextField();
        txtten = new javax.swing.JTextField();
        txtns = new javax.swing.JTextField();
        txtdc = new javax.swing.JTextField();
        txtgt = new javax.swing.JTextField();
        txtnvl = new javax.swing.JTextField();
        txtcccd = new javax.swing.JTextField();
        them = new javax.swing.JButton();
        sua = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        qlsp = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("QUAN LY NHAN VIEN");

        them.setText("ADD");
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });

        sua.setText("FIX");
        sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaActionPerformed(evt);
            }
        });

        xoa.setText("DELETE");
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        qlsp.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(qlsp);

        jLabel2.setText("MA NV");

        jLabel3.setText("TEN NV");

        jLabel4.setText("GIOI TINH");

        jLabel5.setText("DIA C");

        jLabel7.setText("NGAY SINH");

        jLabel8.setText("SDT");

        jLabel9.setText("CHUC VU");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtns, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtdc, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtgt, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcccd, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnvl, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(them)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sua)
                        .addGap(18, 18, 18)
                        .addComponent(xoa)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtgt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnvl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcccd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(them)
                        .addComponent(sua)
                        .addComponent(xoa)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
       conn = cn.getConnection();
        try {
            if (txtma.getText().equals("") || txtten.getText().equals("")
                    || txtnvl.getText().equals("") || txtdc.getText().equals("") 
                    || txtns.getText().equals("") || txtcccd.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "chua nhap du du lieu");
            } else {
                StringBuffer sb = new StringBuffer();
                String sql_check_pk = "Select MANV from quanlinhanvien where MANV='" + txtma.getText() + "'";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql_check_pk);
                if (rs.next()) {
                    sb.append("nhan vien da ton tai");
                }
                if (sb.length() > 0) {
                    JOptionPane.showMessageDialog(this, sb.toString());

                } else {
                    String sql = "Insert into quanlinhanvien values('" + txtma.getText() + "','" + txtten.getText() + "',"
                            + "" + "'" + txtns.getText() + "','" + txtdc.getText() + "',"
                            + "'" + txtgt.getText() + "','" + txtnvl.getText() + "','" + txtcccd.getText() + "')";
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

        
        /*
        conn = cn.getConnection();
        try {
            if (txtma.getText().equals("") || txtten.getText().equals("")
                    || txtns.getText().equals("") || txtdc.getText().equals("") || txtgt.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "chua nhap du du lieu");
            } else {
                StringBuffer sb = new StringBuffer();
                String sql_check_pk = "Select masp from quanlisanpham where masp='" + txtma.getText() + "'";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql_check_pk);
                if (rs.next()) {
                    sb.append("San pham da ton tai");
                }
                if (sb.length() > 0) {
                    JOptionPane.showMessageDialog(this, sb.toString());

                } else {
                    String sql = "Insert into quanlisanpham values('" + txtma.getText() + "','" + txtten.getText() + "'," + "'" + txtgia.getText() + "','" + txtsoluong.getText() + "','" + txtmota.getText() + "')";
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
        */
    }//GEN-LAST:event_themActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        // TODO add your handling code here:
             conn = cn.getConnection();
        try {
            String sql = "delete quanlinhanvien where MANV ='" + txtma.getText() + "'";
            Statement st = conn.createStatement();
            int thongb = JOptionPane.showConfirmDialog(this, "xoa nha", "thong bao", JOptionPane.YES_NO_OPTION);
            if (thongb == JOptionPane.YES_OPTION) {
                st.executeUpdate(sql);
                xoatrang();
                JOptionPane.showMessageDialog(this, "xoa thanh cong");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_xoaActionPerformed

    private void suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaActionPerformed
        // TODO add your handling code here:
        conn = cn.getConnection();
        try {
              if (txtma.getText().equals("") || txtten.getText().equals("")
                    || txtnvl.getText().equals("") || txtdc.getText().equals("") 
                    || txtns.getText().equals("") || txtcccd.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "chua nhap du du lieu");
            }
            {
                Statement st = conn.createStatement();
                String sql = "Update quanlinhanvien set TENNV ='" + txtten.getText() + "',Gioitinh='"+txtns.getText()+"',Diachi='"+txtdc.getText()+"',SDT='"+txtgt.getText()+"',Chucvu='"+txtnvl.getText()+"',Ngaysinh='"+txtcccd.getText()+"'where MANV='" + txtma.getText() + "' ";
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
    }//GEN-LAST:event_suaActionPerformed

    private void xoatrang() {
        txtma.setText("");
        txtten.setText("");
        txtdc.setText("");
        txtns.setText("");
        
        txtgt.setText("");
        txtnvl.setText("");
        txtcccd.setText("");
        
        // txtma.setEnabled(true);
        loadbang();
    }

    public void loadbang() {
        try {
            conn = cn.getConnection();
            int number;
            Vector row;
            String sql = "select * from quanlinhanvien";
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
                    txtns.setText(qlsp.getValueAt(qlsp.getSelectedRow(), 2) + "");
                    txtdc.setText(qlsp.getValueAt(qlsp.getSelectedRow(), 3) + "");
                    txtgt.setText(qlsp.getValueAt(qlsp.getSelectedRow(), 4) + "");
                    txtnvl.setText(qlsp.getValueAt(qlsp.getSelectedRow(), 5) + "");
                    txtcccd.setText(qlsp.getValueAt(qlsp.getSelectedRow(), 6) + "");
                    

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
            java.util.logging.Logger.getLogger(quanlinhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quanlinhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quanlinhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quanlinhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quanlinhanvien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable qlsp;
    private javax.swing.JButton sua;
    private javax.swing.JButton them;
    private javax.swing.JTextField txtcccd;
    private javax.swing.JTextField txtdc;
    private javax.swing.JTextField txtgt;
    private javax.swing.JTextField txtma;
    private javax.swing.JTextField txtns;
    private javax.swing.JTextField txtnvl;
    private javax.swing.JTextField txtten;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables
}

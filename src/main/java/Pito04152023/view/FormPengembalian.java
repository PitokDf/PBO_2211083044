/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pito04152023.view;

import javax.swing.JTable;

import Pito04152023.controller.*;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class FormPengembalian extends javax.swing.JFrame {

    /**
     * Creates new form FormPengembalian
     */
    PengembalianKontrol kontrol;

    public FormPengembalian() {
        initComponents();
        kontrol = new PengembalianKontrol(this);
        kontrol.cls();
        kontrol.isiCombo();
        kontrol.tampilData();
    }

    public javax.swing.JComboBox getCboAnggota() {
        return cboAnggota;
    }

    public javax.swing.JComboBox getCboBuku() {
        return cboBuku;
    }
    public javax.swing.JTextField getTxtTglpinjam(){
        return txtTglpinjam;
    }
    public javax.swing.JTextField getTxtTglKembali(){
        return txtTglkembali;
    }
    public JTable getTxtTblPengembalian(){
        return tblPengembalian;
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPengembalian = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cboAnggota = new javax.swing.JComboBox<>();
        cboBuku = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTglpinjam = new javax.swing.JTextField();
        txtTglkembali = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tblPengembalian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nobp", "Nama", "Kode Buku", "Tgl Pinjam", "Tgl Kembali", "Terlambat", "Denda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPengembalian);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 190, 453, 275);

        jButton1.setText("Insert");
        getContentPane().add(jButton1);
        jButton1.setBounds(12, 146, 73, 25);

        jLabel1.setText("Anggota");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 12, 63, 24);

        cboAnggota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboAnggota);
        cboAnggota.setBounds(108, 12, 289, 24);

        cboBuku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboBuku);
        cboBuku.setBounds(108, 42, 289, 24);

        jLabel2.setText("Buku");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(12, 47, 47, 25);

        jLabel3.setText("Tgl Pinjam");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(12, 78, 63, 25);

        jLabel4.setText("Tgl Kembali");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(12, 115, 78, 25);
        getContentPane().add(txtTglpinjam);
        txtTglpinjam.setBounds(108, 78, 289, 25);
        getContentPane().add(txtTglkembali);
        txtTglkembali.setBounds(108, 115, 289, 25);

        jButton2.setText("Update");
        getContentPane().add(jButton2);
        jButton2.setBounds(108, 146, 73, 25);

        jButton3.setText("Delete");
        getContentPane().add(jButton3);
        jButton3.setBounds(218, 146, 73, 25);

        jButton4.setText("Cancel");
        getContentPane().add(jButton4);
        jButton4.setBounds(324, 146, 73, 25);

        setSize(new java.awt.Dimension(494, 510));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboAnggota;
    private javax.swing.JComboBox<String> cboBuku;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPengembalian;
    private javax.swing.JTextField txtTglkembali;
    private javax.swing.JTextField txtTglpinjam;
    // End of variables declaration//GEN-END:variables
}

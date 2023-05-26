

public class Forma extends javax.swing.JFrame {

    public Forma() {
        initComponents();
        cboStatusNikah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboStatusNikahActionPerformed(evt);
            }
        });
        
        // Teks bantuan untuk JTextField
        txtJumlahAnak.setText("Teks Bantuan");
        txtJumlahAnak.setForeground(java.awt.Color.GRAY);
        
        // Menambahkan listener untuk JTextField
        txtJumlahAnak.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtJumlahAnakFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJumlahAnakFocusLost(evt);
            }
        });
    }
    
    private void cboStatusNikahActionPerformed(java.awt.event.ActionEvent evt) {
        String selectedValue = cboStatusNikah.getSelectedItem().toString();
        
        if (selectedValue.equals("Menikah")) {
            txtJumlahAnak.setEnabled(false); // Membuat JTextField tidak bisa diisi
            txtJumlahAnak.setText(""); // Menghapus isi teks jika ada
        } else {
            txtJumlahAnak.setEnabled(true); // Mengaktifkan kembali JTextField
        }
    }
    
    private void txtJumlahAnakFocusGained(java.awt.event.FocusEvent evt) {
        if (txtJumlahAnak.getText().equals("Teks Bantuan")) {
            txtJumlahAnak.setText("");
            txtJumlahAnak.setForeground(java.awt.Color.BLACK);
        }
    }
    
    private void txtJumlahAnakFocusLost(java.awt.event.FocusEvent evt) {
        if (txtJumlahAnak.getText().equals("")) {
            txtJumlahAnak.setText("Teks Bantuan");
            txtJumlahAnak.setForeground(java.awt.Color.GRAY);
        }
    }

    private void initComponents() {

        cboStatusNikah = new javax.swing.JComboBox<>();
        txtJumlahAnak = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cboStatusNikah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Belum Menikah", "Menikah" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(cboStatusNikah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtJumlahAnak, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboStatusNikah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJumlahAnak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(235, Short.MAX_VALUE))
        );

        pack();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Forma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forma().setVisible(true);
            }
        });
    }

    private javax.swing.JComboBox<String> cboStatusNikah;
    private javax.swing.JTextField txtJumlahAnak;

}

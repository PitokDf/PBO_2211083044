import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Combo Box Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Pilihan 1");
        comboBox.addItem("Pilihan 2");
        comboBox.addItem("Pilihan 3");

        JTextField textField = new JTextField(10);

        // Tambahkan action listener pada JComboBox
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedValue = comboBox.getSelectedItem().toString();

                // Periksa nilai yang dipilih
                if (selectedValue.equals("Pilihan 2")) {
                    textField.setEnabled(false); // Buat JTextField tidak bisa diisi
                } else {
                    textField.setEnabled(true); // Aktifkan kembali JTextField
                }
            }
        });

        panel.add(comboBox);
        panel.add(textField);
        frame.add(panel);
        frame.setVisible(true);
    }
}

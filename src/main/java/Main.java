import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.ActiveEvent;

public class Main {
    public static void main(String[] args) {
        // String jamMasuk = "12:12";
        // String jamKeluar = "15:00";

        // DateFormat format = new SimpleDateFormat("HH:mm");

        // try {
        //     Date dateMasuk = format.parse(jamMasuk);
        //     Date dateKeluar = format.parse(jamKeluar);

        //     long selisihMillis = dateKeluar.getTime() - dateMasuk.getTime();
        //     long selisihMenit = selisihMillis / (60 * 1000);

        //     double selisihJam = Math.ceil(selisihMenit / 60.0);

        //     System.out.println("Lama Parkir: " + selisihJam + " jam");
        // } catch (ParseException e) {
        //     e.printStackTrace();
        // }
        JFrame frame = new JFrame("Combo box example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();

        JComboBox<String> combo = new JComboBox<>();
        combo.addItem("1");
        combo.addItem("2");
        combo.addItem("3");

        JTextField textField = new JTextField(10);

        combo.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String selected = combo.getSelectedItem().toString();
                if (selected.equals("2")) {
                    textField.setEnabled(false);
                } else {
                    textField.setEnabled(true);
                }
            }
        });

        panel.add(combo);
        panel.add(textField);
        panel.add(panel);
    }
}
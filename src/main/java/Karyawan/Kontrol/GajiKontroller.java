package Karyawan.Kontrol;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Formatter;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import Karyawan.Model.Gaji;
import Karyawan.Model.GajiDaoImpl;
import Karyawan.Model.Karyawan;
import Karyawan.Model.KaryawanDao;
import Karyawan.Model.KaryawanDaoImpl;
import Karyawan.View.formGaji;

;

public class GajiKontroller {
    private Gaji gaji;
    private GajiDaoImpl gajiDaoImpl;
    private formGaji form;

    private KaryawanDao karyawanDao;

    public GajiKontroller(formGaji form) {
        this.form = form;

        gajiDaoImpl = new GajiDaoImpl();
        karyawanDao = new KaryawanDaoImpl();
    }

    public void cls() {
        form.getTxtBulan().setText("");
        form.getCboKaryawan().setSelectedIndex(0);
        form.getTxtTahun().setText("");
    }

    public void isiCombo() {
        List<Karyawan> listKaryawans = karyawanDao.getAll();
        form.getCboKaryawan().removeAllItems();

        // isi
        for (Karyawan karyawan : listKaryawans) {
            form.getCboKaryawan().addItem(karyawan.getNip());
        }
    }

    private String formatRupiah(Double value) {
        DecimalFormat formmater = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols simbol = formmater.getDecimalFormatSymbols();

        simbol.setCurrencySymbol("Rp. ");
        simbol.setMonetaryDecimalSeparator(',');
        simbol.setGroupingSeparator('.');
        formmater.setDecimalFormatSymbols(simbol);
        return formmater.format(value);
    }

    public void tampilData() {
        DefaultTableModel tabelModel = (DefaultTableModel) form.getTblGaji().getModel();
        tabelModel.setRowCount(0);
        List<Gaji> list = gajiDaoImpl.getAll();
        for (Gaji gaji : list) {
            Object[] data = {
                    gaji.getKaryawan().getNama(),
                    gaji.getBulan(),
                    gaji.getTahun(),
                    this.formatRupiah(gaji.getGajiPokok()),
                    this.formatRupiah(gaji.getTunjanganAnak()),
                    this.formatRupiah(gaji.getTunjanganIstri()),
                    this.formatRupiah(gaji.getTotalGaji())

            };
            tabelModel.addRow(data);
        }
    }

    public void saveGaji() {
        gaji = new Gaji();
        gaji.setKaryawan(karyawanDao.getKaryawan(form.getCboKaryawan().getSelectedIndex()));
        gaji.setBulan(Integer.parseInt(form.getTxtBulan().getText()));
        gaji.setTahun(Integer.parseInt(form.getTxtTahun().getText()));
        gajiDaoImpl.save(gaji);
        javax.swing.JOptionPane.showMessageDialog(form, "Entri Ok");
    }

    public void updateGaji() {
        int idx = form.getTblGaji().getSelectedRow();
        gaji.setKaryawan(karyawanDao.getKaryawan(form.getCboKaryawan().getSelectedIndex()));
        gaji.setBulan(Integer.parseInt(form.getTxtBulan().getText()));
        gaji.setTahun(Integer.parseInt(form.getTxtTahun().getText()));
        gajiDaoImpl.update(idx, gaji);
        javax.swing.JOptionPane.showMessageDialog(form, "Entri Ok");
    }

    public void getGaji() {
        int index = form.getTblGaji().getSelectedRow();
        gaji = gajiDaoImpl.getGaji(index);
        if (gaji != null) {
            form.getCboKaryawan().setSelectedItem(gaji.getKaryawan().getNip());
            form.getTxtBulan().setText(String.valueOf(gaji.getBulan()));
            form.getTxtTahun().setText(String.valueOf(gaji.getTahun()));
        }
    }

    public void deleteGaji() {
        int idx = form.getTblGaji().getSelectedRow();
        gajiDaoImpl.delete(idx);
        javax.swing.JOptionPane.showMessageDialog(form, "Deleted");
    }
}

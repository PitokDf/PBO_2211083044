package Karyawan.Kontrol;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import Karyawan.Model.Karyawan;
import Karyawan.Model.KaryawanDao;
import Karyawan.Model.KaryawanDaoImpl;
import Karyawan.View.FormKaryawan;

public class KaryawanKontrol {
    private FormKaryawan form;
    private KaryawanDao karyawanDao;
    private Karyawan karyawan;

    public KaryawanKontrol(FormKaryawan form) {
        this.form = form;
        karyawanDao = new KaryawanDaoImpl();
    }

    public void cls() {
        form.getTxtNama().setText("");
        form.getTxtAlamat().setText("");
        form.getCboGolongan().setSelectedIndex(0);
        form.getTxtNIP().setText("");
        form.getCboStatus().setSelectedIndex(0);
        form.getTxtJabatan().setText("");
        form.getTxtJumlahAnak().setText("0");
    }

    public void saveKaryawan() {
        karyawan = new Karyawan();

        karyawan.setNama(form.getTxtNama().getText());
        karyawan.setAlamat(form.getTxtAlamat().getText());
        karyawan.setStatusNikah(form.getCboStatus().getSelectedItem().toString());
        karyawan.setNip(form.getTxtNIP().getText());
        karyawan.setGolongan(form.getCboGolongan().getSelectedItem().toString());
        karyawan.setJabatan(form.getTxtJabatan().getText());
        karyawan.setJumlahAnak(Integer.parseInt(form.getTxtJumlahAnak().getText()));

        karyawanDao.save(karyawan);
        javax.swing.JOptionPane.showMessageDialog(form, "Entri Ok");
    }

    public void getKaryawan() {
        int index = form.geTblKaryawan().getSelectedRow();
        karyawan = karyawanDao.getKaryawan(index);
        if (karyawan != null) {
            form.getTxtNama().setText(karyawan.getNama());
            form.getTxtAlamat().setText(karyawan.getAlamat());
            form.getCboStatus().setSelectedItem(karyawan.getStatusNikah());
            form.getTxtNIP().setText(karyawan.getNip());
            form.getCboGolongan().setSelectedItem(karyawan.getGolongan());
            form.getTxtJabatan().setText(karyawan.getJabatan());
            form.getTxtJumlahAnak().setText(Integer.toString(karyawan.getJumlahAnak()));
        }
    }

    public void tampilData() {
        DefaultTableModel tableModel = (DefaultTableModel) form.geTblKaryawan().getModel();
        tableModel.setRowCount(0);
        java.util.List<Karyawan> list = karyawanDao.getAll();
        for (Karyawan karyawan : list) {
            Object[] data = {
                    karyawan.getNama(),
                    karyawan.getAlamat(),
                    karyawan.getStatusNikah(),
                    karyawan.getNip(),
                    karyawan.getGolongan(),
                    karyawan.getJabatan(),
                    karyawan.getJumlahAnak()
            };
            tableModel.addRow(data);
        }
    }

    public void updateKaryawan() {
        int index = form.geTblKaryawan().getSelectedRow();
        karyawan.setNama(form.getTxtNama().getText());
        karyawan.setAlamat(form.getTxtAlamat().getText());
        karyawan.setStatusNikah(form.getCboStatus().getSelectedItem().toString());
        karyawan.setNip(form.getTxtNIP().getText());
        karyawan.setGolongan(form.getCboGolongan().getSelectedItem().toString());
        karyawan.setJabatan(form.getTxtJabatan().getText());
        karyawan.setJumlahAnak(Integer.parseInt(form.getTxtJumlahAnak().getText()));
        karyawanDao.update(index, karyawan);
        javax.swing.JOptionPane.showMessageDialog(form, "Update Ok");
    }

    public void daleteKaryawan() {
        int index = form.geTblKaryawan().getSelectedRow();
        karyawanDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(form, "Delete Ok");
    }
}

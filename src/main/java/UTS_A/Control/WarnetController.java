package UTS_A.Control;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import Karyawan.View.formGaji;
import UTS_A.Model.Pelanggan;
import UTS_A.Model.PelangganDao;
import UTS_A.Model.PelangganDaoImpl;
import UTS_A.Model.Warnet;
import UTS_A.Model.WarnetDaoImpl;
import UTS_A.View.FormWarnet;

public class WarnetController {
    private Warnet warnet;
    private WarnetDaoImpl warnetDaoImpl;
    private FormWarnet form;

    private PelangganDao pelangganDao;

    public WarnetController(FormWarnet form) {
        this.form = form;
        warnetDaoImpl = new WarnetDaoImpl();
        pelangganDao = new PelangganDaoImpl();
    }

    public void cls() {
        form.getCboPelanggan().setSelectedIndex(0);
        form.getTxtTglMasuk().setText("");
        form.getTxtJamMasuk().setText("");
        form.getTxtJamKeluar().setText("");
    }

    public void isiCombo() {
        List<Pelanggan> list = pelangganDao.getAll();
        form.getCboPelanggan().removeAllItems();

        for (Pelanggan pelanggan : list) {
            form.getCboPelanggan().addItem(pelanggan.getKodePelanggan());
        }
    }

    public void tampilData() {
        DefaultTableModel tabelModel = (DefaultTableModel) form.getTblWarnet().getModel();
        tabelModel.setRowCount(0);
        List<Warnet> list = warnetDaoImpl.getAll();
        for (Warnet warnet : list) {
            Object[] data = {
                    warnet.getPelanggan().getKodePelanggan(),
                    warnet.getPelanggan().getNamaPelanggan(),
                    warnet.getPelanggan().getJenisPelanggan(),
                    warnet.getTglMasuk(),
                    warnet.getJamMasuk(),
                    warnet.getJamKeluar(),
                    warnet.getTarif(),
                    warnet.getTotalBayar()
            };
            tabelModel.addRow(data);
        }
    }

    public void saveWarnet() {
        warnet = new Warnet();
        warnet.setPelanggan(pelangganDao.getPelanggan(form.getCboPelanggan().getSelectedIndex()));
        warnet.setTglMasuk(form.getTxtTglMasuk().getText());
        warnet.setJamMasuk(form.getTxtJamMasuk().getText());
        warnet.setJamKeluar(form.getTxtJamKeluar().getText());
        warnetDaoImpl.save(warnet);
        javax.swing.JOptionPane.showMessageDialog(form, "Entri Ok");
    }

    public void updateWarnet() {
        int idx = form.getTblWarnet().getSelectedRow();
        warnet.setPelanggan(pelangganDao.getPelanggan(form.getCboPelanggan().getSelectedIndex()));
        warnet.setTglMasuk(form.getTxtTglMasuk().getText());
        warnet.setJamMasuk(form.getTxtJamMasuk().getText());
        warnet.setJamKeluar(form.getTxtJamKeluar().getText());
        warnetDaoImpl.update(idx, warnet);
        javax.swing.JOptionPane.showMessageDialog(form, "Entri Ok");
    }

    public void getWarnet() {
        int index = form.getTblWarnet().getSelectedRow();
        warnet = warnetDaoImpl.getWarnet(index);
        if (warnet != null) {
            form.getCboPelanggan().setSelectedItem(warnet.getPelanggan().getKodePelanggan());
            form.getTxtTglMasuk().setText(warnet.getTglMasuk());
            form.getTxtJamMasuk().setText(warnet.getJamMasuk());
            form.getTxtJamKeluar().setText(warnet.getJamKeluar());
        }
    }

    public void deleteWarnet() {
        int idx = form.getTblWarnet().getSelectedRow();
        warnetDaoImpl.delete(idx);
        javax.swing.JOptionPane.showMessageDialog(form, "Deleted");
    }
}

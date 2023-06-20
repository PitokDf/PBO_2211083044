package PitoDesriPauzi.Controller;

import java.sql.*;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import PitoDesriPauzi.DB.Koneksi;
import PitoDesriPauzi.Dao.*;
import PitoDesriPauzi.Model.*;
import PitoDesriPauzi.View.FormBukudb;

public class BukuControl {
    private FormBukudb form;
    private Connection cn;
    private Buku buku = new Buku();
    private BukuDao dao;

    public BukuControl(FormBukudb form) throws SQLException {
        this.form = form;
        cn = Koneksi.getConnection();
        dao = new BukuDaoImpl(cn);

    }

    public void Clear() {
        form.getTxtKodeBuku().setText("");
        form.getTxtJudulBuku().setText("");
        form.getTxtPengarang().setText("");
        form.getTxtPenerbit().setText("");
        form.getTxtTahunterbit().setText("");
    }

    public void Showdata() {
        try {
            DefaultTableModel tableModel = (DefaultTableModel) form.getTblDaftarBuku().getModel();
            tableModel.setRowCount(0);

            List<Buku> list = dao.getAll();
            for (Buku buku : list) {
                Object[] data = {
                        buku.getKodeBuku(),
                        buku.getJudulBuku(),
                        buku.getPengarang(),
                        buku.getPenerbit(),
                        buku.getTahunTerbit()
                };
                tableModel.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, e);
        }
    }

    public void Kliked() {
        try {
            String kode = form.getTblDaftarBuku().getValueAt(form.getTblDaftarBuku().getSelectedRow(), 0).toString();
            buku = dao.getBuku(kode);
            form.getTxtKodeBuku().setText(buku.getKodeBuku());
            form.getTxtJudulBuku().setText(buku.getJudulBuku());
            form.getTxtPengarang().setText(buku.getPengarang());
            form.getTxtPenerbit().setText(buku.getPenerbit());
            form.getTxtTahunterbit().setText(buku.getTahunTerbit());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, e);
        }
    }

    public void Update() {
        try {
            buku.setKodeBuku(form.getTxtKodeBuku().getText());
            buku.setJudulBuku(form.getTxtJudulBuku().getText());
            buku.setPengarang(form.getTxtPengarang().getText());
            buku.setPenerbit(form.getTxtPenerbit().getText());
            buku.setTahunTerbit(form.getTxtTahunterbit().getText());
            dao.Update(buku);
            JOptionPane.showMessageDialog(form, "Update Berhasil.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, e);
        }
    }

    public void Insert() {
        try {
            buku.setKodeBuku(form.getTxtKodeBuku().getText());
            buku.setJudulBuku(form.getTxtJudulBuku().getText());
            buku.setPengarang(form.getTxtPengarang().getText());
            buku.setPenerbit(form.getTxtPenerbit().getText());
            buku.setTahunTerbit(form.getTxtTahunterbit().getText());
            dao.Insert(buku);
            JOptionPane.showMessageDialog(form, "Insert Berhasil.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, e);
        }
    }

    public void Delete() {
        try {
            buku.setKodeBuku(
                    form.getTblDaftarBuku().getValueAt(form.getTblDaftarBuku().getSelectedRow(), 0).toString());
            dao.Delete(buku);
            JOptionPane.showMessageDialog(form, "Berhasil hapus data buku.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, e);
        }
    }
}

package PitoDesriPauzi.Controller;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import PitoDesriPauzi.DB.Koneksi;
import PitoDesriPauzi.Dao.*;
import PitoDesriPauzi.Model.*;
import PitoDesriPauzi.View.PengembalianFormdb;

public class ControlPengembalian {
    private PengembalianFormdb form;
    private AnggotaDao daoAgg;
    private BukuDao daoBuku;
    private PengembalianDao dao;
    private Pengembalian pg;
    private Connection cn;

    public ControlPengembalian(PengembalianFormdb form) throws Exception {
        this.form = form;
        cn = Koneksi.getConnection();
        daoAgg = new AnggotaDaoImpl(cn);
        daoBuku = new BukuDaoImpl(cn);
        dao = new PengembalianDaoImpl(cn);
        pg = new Pengembalian();
    }

    public void Clear() {
        try {
            form.getBtnKembalikan().setEnabled(false);
            List<Buku> bukuD = daoBuku.getAll();
            List<Anggota> aggD = daoAgg.getAll();
            form.getTxtDenda().setText("");
            form.getCboKodeAgg().removeAllItems();
            form.getCboKodeBuku().removeAllItems();
            form.getTxtTanggalDikembalikan().setText("");
            form.getTxtTerlambat().setText("");
            form.getTxtCari().setText("");
            form.getTxtTanggalPinjam().setText("");
            for (Anggota agg : aggD) {
                form.getCboKodeAgg().addItem(agg.getKodeanggota());
            }
            for (Buku buku : bukuD) {
                form.getCboKodeBuku().addItem(buku.getKodeBuku());
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void getPengemballian() {
        try {
            form.getBtnKembalikan().setEnabled(true);
            String tanggalPinjam = form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 4)
                    .toString();
            String tanggalkembali = form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 5)
                    .toString();
            form.getCboKodeAgg()
                    .setSelectedItem(form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 0)
                            .toString());
            form.getCboKodeBuku()
                    .setSelectedItem(form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 2)
                            .toString());
            form.getTxtTanggalPinjam()
                    .setText(tanggalPinjam);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String tglDikembalikan = format.format(new java.util.Date());
            form.getTxtTanggalDikembalikan().setText(tglDikembalikan);
            int terlambat = dao.terlmbat(tglDikembalikan, tanggalkembali);
            pg.setTerlambat(terlambat);
            form.getTxtTerlambat().setText("" + terlambat);
            form.getTxtDenda().setText((String.valueOf(pg.getDenda())));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, e, null, 0);
        }
    }

    public void Showdata() {
        try {
            DefaultTableModel tableModel = (DefaultTableModel) form.getTblPengembalian().getModel();
            tableModel.setRowCount(0);
            List<Pengembalian> List = dao.getAll();
            for (Pengembalian pm : List) {
                Object[] data = {
                        pm.getKodeAgg(),
                        pm.getNamaAnggota(),
                        pm.getKodeBuku(),
                        pm.getJudul(),
                        pm.getTglpPjm(),
                        pm.getTglkmbl(),
                        pm.getTglDikembalikan(),
                        pm.getTerlambat(),
                        pm.getDenda()
                };
                tableModel.addRow(data);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void Cari() {
        try {
            String kode = form.getTxtCari().getText();
            DefaultTableModel tableModel = (DefaultTableModel) form.getTblPengembalian().getModel();
            tableModel.setRowCount(0);
            List<Pengembalian> List = dao.cari(kode);
            if (List.isEmpty()) {
                JOptionPane.showMessageDialog(form, "Kode Anggota '" + kode + "' Tidak dapat ditemukan");
            } else {
                for (Pengembalian pm : List) {
                    Object[] data = {
                            pm.getKodeAgg(),
                            pm.getNamaAnggota(),
                            pm.getKodeBuku(),
                            pm.getJudul(),
                            pm.getTglpPjm(),
                            pm.getTglkmbl(),
                            pm.getTglDikembalikan(),
                            pm.getTerlambat(),
                            pm.getDenda()
                    };
                    tableModel.addRow(data);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, e, null, 0);
        }
    }

    public void insert() {
        try {
            pg.setKodeAgg(form.getCboKodeAgg().getSelectedItem().toString());
            pg.setKodeBuku(form.getCboKodeBuku().getSelectedItem().toString());
            pg.setTglpPjm(form.getTxtTanggalPinjam().getText());
            pg.setTglDikembalikan(form.getTxtTanggalDikembalikan().getText());
            pg.setTerlambat(Integer.parseInt(form.getTxtTerlambat().getText()));
            pg.setDenda(Double.parseDouble(form.getTxtDenda().getText()));
            dao.Insert(pg);
            JOptionPane.showMessageDialog(form, "Berhasil Mengembalikan Buku.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, "Tidak dapat melakukan pengembalian!", null, 0);
        }
    }

    public void delete() {
        try {
            pg.setKodeAgg(form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 0)
                    .toString());
            pg.setKodeBuku(form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 2)
                    .toString());
            pg.setTglpPjm(form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 4)
                    .toString());
            dao.Delete(pg);
            JOptionPane.showMessageDialog(form, "Data pada pengembalian berhasil dihapus!", null, 2);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public int tanggalDikembalikan() throws Exception {
        String tglDikembalikan = form.getTxtTanggalDikembalikan().getText();
        String tanggalkembali = form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 5)
                .toString();
        int terlambat = dao.terlmbat(tglDikembalikan, tanggalkembali);
        form.getTxtTerlambat().setText("" + terlambat);
        form.getTxtTanggalDikembalikan().setText(tglDikembalikan);
        form.getTxtDenda().setText((String.valueOf(terlambat * 1000)));
        return terlambat;
    }

    public void Ubah() {
        try {
            pg.setKodeAgg(form.getCboKodeAgg().getSelectedItem().toString());
            pg.setKodeBuku(form.getCboKodeBuku().getSelectedItem().toString());
            pg.setTglpPjm(form.getTxtTanggalPinjam().getText());
            pg.setTglDikembalikan(form.getTxtTanggalDikembalikan().getText());
            pg.setTerlambat(Integer.parseInt(form.getTxtTerlambat().getText()));
            pg.setDenda(Double.parseDouble(form.getTxtDenda().getText()));
            dao.Update(pg);
            JOptionPane.showMessageDialog(form, "Data Pengembalian telah dirubah!", null, 2);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

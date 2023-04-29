/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pito04152023.controller;
import Pito04152023.view.*;
import Pito04152023.Model.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Pitok
 */
public class PeminjamanController {
    private Peminjaman peminjaman;
    private PeminjamanDaoImpl peminjamanDao;
    private FormPeminjaman form;
    
    private AnggotaDao daoAnggota;
    private BukuinDao bukuDao;
    public PeminjamanController(FormPeminjaman form){
        this.form = form;
        peminjamanDao = new PeminjamanDaoImpl();
        daoAnggota = new AnggotaDaoImpl();
        bukuDao = new BukuinDaoImpl();
    }
    public void cls(){
        form.cboAnggota().setText("");
        form.cboBukuin().setText("");
        form.getTxtTglpinjam().setText("");
        form.getTxtTglkembali().setText("");
    }
    public void isiCOmbo(){
        
    }
    public void savePeminjaman(){
        peminjaman = new Peminjaman();
        peminjaman.setAnggota(form.getTxtNobp().getText());
        peminjaman.setBukuin(form.getTxtKodebuku().getText());
        peminjaman.setTglpinjam(form.getTxtTglpinjam().getText());
        peminjaman.setTglkembali(form.getTxtTglkembali().getText());
        peminjamanDao.save(peminjaman);
        javax.swing.JOptionPane.showMessageDialog(form, "Entri Ok");
    }
    public void getPeminjaman(){
        int index = form.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman != null){
            form.getTxtNobp().setText(peminjaman.getNobp());
            form.getTxtKodebuku().setText(peminjaman.getKodebuku());
            form.getTxtTglpinjam().setText(peminjaman.getTglpinjam());
            form.getTxtTglkembali().setText(peminjaman.getTglkembali());
        }
    }
    
    public void updatePeminjaman(){
        int idx = form.getTblPeminjaman().getSelectedRow();
        peminjaman.setNobp(form.getTxtNobp().getText());
        peminjaman.setKodebuku(form.getTxtKodebuku().getText());
        peminjaman.setTglpinjam(form.getTxtTglpinjam().getText());
        peminjaman.setTglkembali(form.getTxtTglkembali().getText());
        peminjamanDao.update(idx,peminjaman);
    }
    
    public void deletePeminjaman(){
        int idx = form.getTblPeminjaman().getSelectedRow();
        peminjamanDao.delete(idx);
        javax.swing.JOptionPane.showMessageDialog(form, "Deleted");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) form.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Peminjaman> list = peminjamanDao.getAll();
        for(Peminjaman peminjaman : list){
            Object[] data = {
                peminjaman.getNobp(),
                peminjaman.getKodebuku(),
                peminjaman.getTglpinjam(),
                peminjaman.getTglkembali()
            };
            tabelModel.addRow(data);
        }
    }
}

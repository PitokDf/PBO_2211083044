package Karyawan.Kontrol;

import Karyawan.Model.*;
import Karyawan.View.FormGajiKaryawan;

public class Controller {
    private FormGajiKaryawan form;
    private Karyawan karyawan;
    private KaryawanDao karyawanDao;
    private Gaji gaji;
    private GajiDao gajiDao;
    private GajiDaoImpl gajiDaoImpl;

    public Controller(FormGajiKaryawan form) {
        this.form = form;

    }
}

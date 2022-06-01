package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MONHOC")
public class MonHocEntity {
    @Id
    private String MaMH;
    @Column
    private String TenMH;
    @Column
    private int soTC;
    @Column
    private String DieuKien;

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String maMH) {
        MaMH = maMH;
    }

    public String getTenMH() {
        return TenMH;
    }

    public void setTenMH(String tenMH) {
        TenMH = tenMH;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    public String getDieuKien() {
        return DieuKien;
    }

    public void setDieuKien(String dieuKien) {
        DieuKien = dieuKien;
    }
}

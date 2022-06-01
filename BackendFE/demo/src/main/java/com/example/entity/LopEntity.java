package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table(name = "LOP")
public class LopEntity {

    @Id
    private String MaLop;
    @Column
    private String MaKhoa;
    @Column
    private String SiSo;
    @Column
    private String TenLop;

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String maLop) {
        MaLop = maLop;
    }

    public String getMaKhoa() {
        return MaKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        MaKhoa = maKhoa;
    }

    public String getSiSo() {
        return SiSo;
    }

    public void setSiSo(String siSo) {
        SiSo = siSo;
    }

    public String getTenLop() {
        return TenLop;
    }

    public void setTenLop(String tenLop) {
        TenLop = tenLop;
    }
}

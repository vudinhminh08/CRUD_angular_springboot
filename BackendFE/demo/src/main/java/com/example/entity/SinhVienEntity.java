package com.example.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name ="SINHVIEN")
@Data
public class SinhVienEntity {
    @Id
    @Column(name="MASV")
    private String maSv;
    @Column(name = "HODEM")
    private String hoDem;
    @Column(name = "TEN")
    private String name;
    @Column(name =  "NGAYSINH")
    private Date ngaySinh;
    @Column(name = "GIOITINH")
    private String gioiTinh;
    @Column(name = "TINH")
    private String tinh;
    @Column(name = "MALOP")
    private String maLop;


}

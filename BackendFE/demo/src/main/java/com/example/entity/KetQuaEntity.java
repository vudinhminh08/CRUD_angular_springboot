package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="KETQUA")
public class KetQuaEntity {
    @Id
    private String MaSV;
    private String MaMH;
    @Column
    private float KetQua;

}

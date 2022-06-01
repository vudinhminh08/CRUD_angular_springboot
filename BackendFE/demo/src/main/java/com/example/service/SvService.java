package com.example.service;

import com.example.entity.SinhVienEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SvService {
    List<SinhVienEntity> findAll();
    SinhVienEntity save(SinhVienEntity sv);

    void delete(SinhVienEntity sv);
    List<SinhVienEntity> findByName(String name);
    SinhVienEntity findByMssv(String mssv);
    List<SinhVienEntity> findByGioiTinhOrderByNameAsc(String gioiTinh);
    void deleteByMssv(String mssv);
    SinhVienEntity updateSv(String mssv, SinhVienEntity sv);

}

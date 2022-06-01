package com.example.service;

import com.example.entity.SinhVienEntity;
import com.example.repository.SvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import java.util.*;

@Service

public class SvServiceImpl  implements SvService {
    @Autowired
    private SvRepository svRepository;

    @Override
    public SinhVienEntity save(SinhVienEntity sv) {
        return svRepository.save(sv);
    }
    @Override
    public List<SinhVienEntity> findAll() {
        return svRepository.findAll();
    }

    @Override
    public void delete(SinhVienEntity sv) {
        svRepository.delete(sv);
    }

    @Override
    public List<SinhVienEntity> findByName(String name) {
        return svRepository.findByName(name);
    }

    @Override
    public SinhVienEntity findByMssv(String mssv) {
        return svRepository.findByMaSv(mssv);
    }

    @Override
    public List<SinhVienEntity> findByGioiTinhOrderByNameAsc(String gioiTinh) {
        return svRepository.findByGioiTinhOrderByNameAsc(gioiTinh);
    }
    @Override
    public void deleteByMssv(String mssv) {
        System.out.println(svRepository.findByMaSv(mssv));
        svRepository.deleteByMaSv(mssv);
    }
    @Override
    public SinhVienEntity updateSv(String mssv, SinhVienEntity sv) {
        SinhVienEntity temp = svRepository.findByMaSv(mssv);
        temp.setHoDem(sv.getHoDem());
        temp.setName(sv.getName());
        temp.setTinh(sv.getHoDem());
        temp.setGioiTinh(sv.getGioiTinh());
        temp.setMaLop(sv.getMaLop());
        return svRepository.save(temp);
    }
 }
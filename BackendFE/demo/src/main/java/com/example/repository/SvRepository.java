package com.example.repository;

import com.example.entity.SinhVienEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SvRepository extends JpaRepository<SinhVienEntity, String> {
    List<SinhVienEntity> findByName(String name);
    SinhVienEntity findByMaSv(String mssv);
    List<SinhVienEntity> findByGioiTinhOrderByNameAsc(String gioiTinh);

    public void deleteByMaSv(String maSv);
}

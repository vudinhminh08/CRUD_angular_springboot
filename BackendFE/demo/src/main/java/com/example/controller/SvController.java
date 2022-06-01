package com.example.controller;

import com.example.entity.SinhVienEntity;
import com.example.repository.SvRepository;
import com.example.service.SvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/qlSv")
public class SvController {
    @Autowired
    private SvService svService;
    @GetMapping()
    public ResponseEntity<List<SinhVienEntity>> findAll() {
        return ResponseEntity.ok(svService.findAll());
    }
    @PostMapping
    public ResponseEntity<SinhVienEntity> save(@RequestBody SinhVienEntity sv) {
        return ResponseEntity.ok(svService.save(sv));
    }
    @PutMapping({"/{mssv}"})
    public ResponseEntity<SinhVienEntity> updateSv(@PathVariable("mssv") String mssv, @RequestBody SinhVienEntity sv) {
        svService.updateSv(mssv, sv);
        return ResponseEntity.ok(svService.findByMssv(mssv));
    }

    @DeleteMapping({"/{mssv}"})
    public void delete(@PathVariable("mssv") String mssv) {
        svService.delete(svService.findByMssv(mssv));
    }
    @GetMapping("/findByName")
    public ResponseEntity<List<SinhVienEntity>> findByName() {
        return ResponseEntity.ok(svService.findByName("Minh"));
    }
//    @GetMapping("/GetByID")
//    public ResponseEntity<List<SinhVienEntity>> findByMssv() {
//        return ResponseEntity.ok(svService.findByMssv("4805"));
//    }
    @GetMapping("/sortByName")
    public ResponseEntity<List<SinhVienEntity>> findByGioiTinhOrderByNameAsc() {
        return ResponseEntity.ok(svService.findByGioiTinhOrderByNameAsc("Nu"));
    }


}

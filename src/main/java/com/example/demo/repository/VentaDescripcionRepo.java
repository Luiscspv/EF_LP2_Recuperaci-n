package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.VentaDescripcion;

@Repository
public interface VentaDescripcionRepo extends JpaRepository<VentaDescripcion, Integer> {
}

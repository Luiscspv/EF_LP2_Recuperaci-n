package com.example.demo.service;

import java.util.List;

import com.example.demo.model.VentaDescripcion;

public interface VentaDescripcionService {
    VentaDescripcion guardarDetalleVenta(VentaDescripcion detalleVenta);
    List<VentaDescripcion> obtenerTodosDetallesVenta();
    VentaDescripcion obtenerDetalleVentaPorId(int id);
    void eliminarDetalleVentaPorId(int id);
}

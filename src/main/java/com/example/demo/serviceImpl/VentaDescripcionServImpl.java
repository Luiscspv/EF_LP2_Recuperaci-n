package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.VentaDescripcion;
import com.example.demo.repository.VentaDescripcionRepo;
import com.example.demo.service.VentaDescripcionService;

import java.util.List;

@Service
public class VentaDescripcionServImpl implements VentaDescripcionService {

    @Autowired
    private VentaDescripcionRepo detalleVentaRepository;

    @Override
    public VentaDescripcion guardarDetalleVenta(VentaDescripcion detalleVenta) {
        return detalleVentaRepository.save(detalleVenta);
    }

    @Override
    public List<VentaDescripcion> obtenerTodosDetallesVenta() {
        return detalleVentaRepository.findAll();
    }

    @Override
    public VentaDescripcion obtenerDetalleVentaPorId(int id) {
        return detalleVentaRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarDetalleVentaPorId(int id) {
        detalleVentaRepository.deleteById(id);
    }
}

package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ciudad;
import com.example.demo.repository.CiudadRepo;
import com.example.demo.service.CiudadService;

import java.util.List;

@Service
public class CiudadServImpl implements CiudadService {

    @Autowired
    private CiudadRepo ciudadRepository;

    @Override
    public Ciudad guardarCiudad(Ciudad ciudad) {
        return ciudadRepository.save(ciudad);
    }

    @Override
    public List<Ciudad> obtenerTodasCiudades() {
        return ciudadRepository.findAll();
    }

    @Override
    public Ciudad obtenerCiudadPorCodigoPostal(String codigoPostal) {
        return ciudadRepository.findById(codigoPostal).orElse(null);
    }

    @Override
    public void eliminarCiudadPorCodigoPostal(String codigoPostal) {
        ciudadRepository.deleteById(codigoPostal);
    }
}

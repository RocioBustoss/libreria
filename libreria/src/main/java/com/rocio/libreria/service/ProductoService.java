package com.rocio.libreria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rocio.libreria.model.Producto;
import com.rocio.libreria.repository.ProductoRepository;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;
    public List<Producto> verProductos(){
        return productoRepository.leerProductos();
    }
    
    public Producto crearProducto(Producto p) {
        return productoRepository.agregarProducto(p);
    }

    public String eliminarProducto(String nombre) {
        return productoRepository.quitarProducto(nombre);
        
    }

    
}

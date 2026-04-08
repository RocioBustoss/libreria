package com.rocio.libreria.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.rocio.libreria.model.Producto;

@Repository
public class ProductoRepository {
    private List<Producto> listaProductos = new ArrayList<>();

    public List<Producto> leerProductos() {
        return listaProductos;
    }

    public Producto agregarProducto(Producto p) {
        listaProductos.add(p);
        return p;
        
    }
    
}

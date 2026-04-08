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

    public String quitarProducto(String nombre) {
        for (Producto producto : listaProductos) {
            if(producto.getNombre().equalsIgnoreCase(nombre)){
                listaProductos.remove(producto);
                return nombre+" Eliminado";
            }
            
        }
        return nombre+" No encontrado";
    }
    
}

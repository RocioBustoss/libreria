package com.rocio.libreria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rocio.libreria.model.Producto;
import com.rocio.libreria.service.ProductoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping ("api/v1/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;
    @GetMapping
    public List<Producto> getProducto(){
        return productoService.verProductos();
    }
    @PostMapping
    public Producto postProducto(@Valid @RequestBody Producto p){
        return productoService.crearProducto(p);
    }
    @DeleteMapping("eliminar/{nombre}")
    public String deleteProducto(@PathVariable String nombre){
        return productoService.eliminarProducto(nombre);
    }
    

    // hola
}

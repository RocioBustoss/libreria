package com.rocio.libreria.model;

import java.util.concurrent.atomic.AtomicInteger;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Producto {
    private static AtomicInteger counter = new AtomicInteger(100);
    private int id;
    @NotNull(message = "El nombre es necesario")
    @NotBlank(message = "El nombre esta vacio")
    private String nombre;

    @NotNull(message = "El precio es necesario")
    @Positive(message = "El precio debe ser positivo")
    private int precio;

    @NotNull(message = "La categoria es necesaria")
    @NotBlank(message = "La categoria esta vacia")
    private String categoria;
    
    public Producto(String nombre, int precio, String categoria){
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;

        this.id = counter.getAndIncrement();
    }

    
}

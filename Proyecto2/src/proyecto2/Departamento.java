/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

/**
 *
 * @author Valery
 */
public class Departamento {

    // Atributos
    private String id;
    private String nombre;
    // Cola simple de artículos (representada como arreglo y contador)
    private Articulo[] articulos;
    private int articulosTamano;

    
    public Departamento(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.articulos = new Articulo[20]; // capacidad por defecto
    }

    // Getters y Setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Articulo[] getArticulos() {
        return articulos;
    }
    // Métodos para manejar la cola de artículos
    public boolean tieneArticulos() {
        return this.articulosTamano > 0;
    }

    public int getArticulosTamano() {
        return this.articulosTamano;
    }

    public void agregarArticulo(Articulo a) {
        if (a == null) return;
        if (this.articulosTamano >= this.articulos.length) return;
        this.articulos[this.articulosTamano++] = a;
    }

    public Articulo eliminarPrimerArticulo() {
        if (this.articulosTamano == 0) return null;
        Articulo eliminado = this.articulos[0];
        // desplazar a la izquierda
        for (int i = 1; i < this.articulosTamano; i++) {
            this.articulos[i - 1] = this.articulos[i];
        }
        this.articulos[this.articulosTamano - 1] = null;
        this.articulosTamano--;
        return eliminado;
    }


}

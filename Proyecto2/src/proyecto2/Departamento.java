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
    private String[] articulos;
    private int articulosTamano;

    
    public Departamento(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.articulos = new String[50]; // capacidad por defecto
        this.articulosTamano = 0;
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
    // Métodos para manejar la cola de artículos
    public boolean tieneArticulos() {
        return this.articulosTamano > 0;
    }

    public int getNumeroArticulos() {
        return this.articulosTamano;
    }

    public boolean agregarArticulo(String articuloId) {
        if (this.articulosTamano >= this.articulos.length) return false;
        this.articulos[this.articulosTamano++] = articuloId;
        return true;
    }

    public String eliminarArticulo() {
        if (this.articulosTamano == 0) return null;
        // Cola: eliminar por orden FIFO -> quitar el primero
        String eliminado = this.articulos[0];
        // desplazar
        for (int i = 1; i < this.articulosTamano; i++) {
            this.articulos[i-1] = this.articulos[i];
        }
        this.articulos[--this.articulosTamano] = null;
        return eliminado;
    }
    
}

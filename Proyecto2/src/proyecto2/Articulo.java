/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

/**
 *
 * @author Valery
 */
public class Articulo {
    // Atributos
    private int id;
    private String nombre;
    private int categoria;
    // Generador global de IDs (compartido entre todos los departamentos)
    private static int nextId = 1;

    // Constructor
    public Articulo(int id, String nombre, int categoria) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    // Devuelve el próximo ID sin consumirlo
    public static synchronized int getNextId() {
        return nextId;
    }

    // Devuelve y consume el próximo ID (post-incremento)
    public static synchronized int consumeNextId() {
        return nextId++;
    }
    // Getters y Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCategoria() {
        return categoria;
    }
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
}

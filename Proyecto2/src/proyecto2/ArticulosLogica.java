/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

/**
 *
 * @author Valery
 */
public class ArticulosLogica {
    
    private Articulo[] articulos;
    private int tamano;

    public ArticulosLogica( Articulo[] datosIniciales) {
        this.articulos = datosIniciales;
        this.tamano = 0;
        if (datosIniciales != null) {
            for (Articulo a : datosIniciales) {
                if (a != null) {
                    this.tamano++;
                }
            }
        }
    }

    public String validarDatos(String idStr, String nombre, String categoriaStr) {
        if (idStr == null || idStr.trim().isEmpty()) {
            return "ID no puede ser nulo o vacío";
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            return "Nombre no puede ser nulo o vacío";
        }
        if (categoriaStr == null || categoriaStr.trim().isEmpty()) {
            return "Categoría no puede ser nula o vacía";
        }
        return null; // No hay errores
    }

    public void agregarArticulo(Articulo articulo) {
        this.articulos[tamano] = articulo;
        this.tamano++;
    }

    public Articulo[] getArticulos() {
        return articulos;
    }

    public int getTamano() {
        return tamano;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

/**
 *
 * @author Valery
 */
public class DepartamentosLogica {
	private Departamento[] datos;
    private int tamano;
	public DepartamentosLogica(Departamento[] datosIniciales) {
        this.datos = datosIniciales;
        int cuenta = 0;
        if (this.datos != null) {
            for (Departamento d : this.datos) {
                if (d != null) cuenta++;
            }
        }
        this.tamano = cuenta;
	}
	// Conveniencia para crear y agregar con id y nombre
	public boolean agregarDepartamento(String id, String nombre) {
        if (!validarDepartamento(id, nombre)) {
            System.out.println("Validación falló: id o nombre inválido");
            return false;
        }
        if (datos == null) {
            System.out.println("Arreglo de datos no inicializado");
            return false;
        }
        if (tamano >= datos.length) {
            System.out.println("No hay espacio para más departamentos (capacidad " + datos.length + ")");
            return false;
        }
        Departamento nuevoDepartamento = new Departamento(id, nombre);
        System.out.println("Intentando agregar departamento: ID=" + id + ", Nombre=" + nombre);
        System.out.println("Datos actuales antes de agregar: " + tamano + " departamentos");
        datos[tamano] = nuevoDepartamento;
        tamano++;
        return true;
	}

    // Validar que id, nombre tengan valores no nulos y no vacíos
    public boolean validarDepartamento(String id, String nombre) {
        if (id == null || id.trim().isEmpty()) {
            return false; // ID no puede ser nulo o vacío
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            return false; // Nombre no puede ser nulo o vacío
        }
        return true; // Ambos son válidos
    }

    public int getTamano() {
        return this.tamano;
    }

}

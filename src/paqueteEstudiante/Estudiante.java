/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteEstudiante;


public class Estudiante {
    private String id;
    private String nombre;
    private String carrera;

    public Estudiante(String id, String nombre, String carrera) {
        this.id = id;
        this.nombre = nombre;
        this.carrera = carrera;
        
    }

    public Estudiante() {
        this.id = "";
        this.nombre = "";
        this.carrera = "";
        
    }

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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    
    

    public String mostrarInfo() {
        return "Estudiante: " + nombre + " (ID: " + id + ") - Carrera: " + carrera;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteMatricula;

import PaqueteProfesor.Profesor;
import paqueteEstudiante.Estudiante;

/**
 *
 * @author alovi
 */
public class Matricula {

    private String codigoMatricula;
    private Estudiante estudiante;
    private Profesor profesor;
    private String curso;

    public Matricula(String codigoMatricula, Estudiante estudiante, Profesor profesor, String curso) {
        this.codigoMatricula = codigoMatricula;
        this.estudiante = estudiante;
        this.profesor = profesor;
        this.curso = curso;
    }
     public Matricula() {
        this.codigoMatricula = "";
        this.estudiante = null;
        this.profesor = null;
        this.curso = "";

}

    public String getCodigoMatricula() {
        return codigoMatricula;
    }

    public void setCodigoMatricula(String codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
     public void mostrarMatricula() {
        System.out.println("===== MATRÍCULA " + codigoMatricula + " =====");
        System.out.println("Curso: " + curso);
        System.out.println(estudiante.mostrarInfo());
        System.out.println(profesor.mostrarInfo());
        System.out.println("=================================");
    }
}
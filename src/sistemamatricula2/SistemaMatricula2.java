/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemamatricula2;

import PaqueteMatricula.Matricula;
import PaqueteProfesor.Profesor;
import java.util.ArrayList;
import paqueteEstudiante.Estudiante;

/**
 *
 * @author Joshua
 */
public class SistemaMatricula2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lista para guardar todas las matrículas
        ArrayList<Matricula> matriculas = new ArrayList<>();

        // Crear estudiantes
        Estudiante e1 = new Estudiante("E01", "Joshua Guerrero", "Ingenieria Informatica");
        Estudiante e2 = new Estudiante("E02", "Anthony Ortega", "Ingenieria Informatica");
        Estudiante e3 = new Estudiante("E03", "Alejandro Oviedo", "Ingenieria Informatica");

        // Crear profesores
        Profesor p1 = new Profesor("P01", "Ana Solano", "Computacion");
        Profesor p2 = new Profesor("P02", "Carlos Méndez", "Matematicas");
        Profesor p3 = new Profesor("P03", "Khaterin Rivas", "Matematicas");

        // Crear matrículas
        Matricula m1 = new Matricula("M001", e1, p1, "Programacion II");
        Matricula m2 = new Matricula("M002", e2, p2, "Estructuras Discretas");
        Matricula m3 = new Matricula("M003", e2, p2, "Estadistica");

        // Agregarlas a la lista
        matriculas.add(m1);
        matriculas.add(m2);
        matriculas.add(m3);

        // Mostrar todas las matrículas del sistema
        System.out.println("SISTEMA DE MATRICULA - UNIVERSIDAD\n");
        for (Matricula m : matriculas) {
            m.mostrarMatricula();
            System.out.println();
        }

        System.out.println("Total de matrículas registradas: " + matriculas.size());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adan Trejo
 */
public class Informacion {
    String nombre;
    String materia;
    String semestre;

    public Informacion(String nombre, String materia, String semestre) {
        this.nombre = nombre;
        this.materia = materia;
        this.semestre = semestre;
    }

    public String getNombre() {
        return "Nombre:" + nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return "Materia:" + materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getSemestre() {
        return "Semestre:" + semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    }
    
    
    


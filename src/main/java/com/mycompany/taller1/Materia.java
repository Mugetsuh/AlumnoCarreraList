/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.taller1;
import java.util.ArrayList;
/**
 *
 * @author orlan
 */
public class Materia {
    private String nombreMateria;
    private int codigoMateria;
    
    private ArrayList<Alumno> listaAlumnos;

    public Materia(String nombreMateria, int codigoMateria) {
        this.nombreMateria = nombreMateria;
        this.codigoMateria = codigoMateria;
        listaAlumnos=new ArrayList<Alumno>();
    }
       
    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getCodigo() {
        return codigoMateria;
    }

    public void setCodigo(int codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
    
}

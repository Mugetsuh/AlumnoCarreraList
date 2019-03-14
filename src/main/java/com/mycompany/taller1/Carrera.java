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
public class Carrera {
    private String nombreCarrera;
    private int codigoCarrera;
    private ArrayList<Materia> listaMateria;

    public Carrera(String nombreCarrera, int codigoMateria){
        listaMateria=new ArrayList<Materia>();
        this.nombreCarrera=nombreCarrera;
        this.codigoCarrera=codigoMateria;
    }
    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public int getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(int codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public ArrayList<Materia> getListaMateria() {
        return listaMateria;
    }

    public void setListaMateria(ArrayList<Materia> listaMateria) {
        this.listaMateria = listaMateria;
    }
    
            
}

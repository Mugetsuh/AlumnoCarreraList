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
public class Menu {
    ArrayList<Carrera> listaCarrera =new ArrayList<Carrera>();
    
    public void datos(){
    Alumno alumno1=new Alumno("Orlando Mora", 1);
    Alumno alumno2=new Alumno("Angie Paez", 2);
    Alumno alumno3=new Alumno("Juan Okendo", 3);
    Alumno alumno4=new Alumno("Mateo Arevalo", 4);
    Alumno alumno5=new Alumno("Fabia Castro", 5);
    Alumno alumno6=new Alumno("Jose Castillo", 6);
    Alumno alumno7=new Alumno("Sebas Quinte", 7);
    Alumno alumno8=new Alumno("Mateo Garnica", 8);
    Alumno alumno9=new Alumno("Diego Bustos", 9);
    
    Materia programacion = new Materia("Programacion",0);
    Materia programacion1 = new Materia("Programacion 1",1);
    Materia matematicas = new Materia("matematicas", 2);
    Materia matematicas1 = new Materia("matematicas 1", 3);
    Materia matematicas2 = new Materia("matematicas 2", 4);
    Materia biologia =new Materia("biologia", 5);
    Materia biologia1 =new Materia("biologia", 6);
    
    programacion.getListaAlumnos().add(alumno1);
    programacion.getListaAlumnos().add(alumno2);
    programacion.getListaAlumnos().add(alumno3);
    
    programacion1.getListaAlumnos().add(alumno5);
    programacion1.getListaAlumnos().add(alumno8);
    programacion1.getListaAlumnos().add(alumno9);
    
    matematicas.getListaAlumnos().add(alumno3);
    matematicas.getListaAlumnos().add(alumno2);
    matematicas.getListaAlumnos().add(alumno7);
    
    matematicas1.getListaAlumnos().add(alumno7);
    matematicas1.getListaAlumnos().add(alumno8);
    matematicas1.getListaAlumnos().add(alumno9);
    
    matematicas2.getListaAlumnos().add(alumno5);
    matematicas2.getListaAlumnos().add(alumno6);
    matematicas2.getListaAlumnos().add(alumno9);
    
    biologia.getListaAlumnos().add(alumno7);
    biologia.getListaAlumnos().add(alumno8);
    biologia.getListaAlumnos().add(alumno9);
    
    biologia1.getListaAlumnos().add(alumno4);
    biologia1.getListaAlumnos().add(alumno5);
    biologia1.getListaAlumnos().add(alumno6);
    
    Carrera sistemas =new Carrera("Ingenieria de Sistemas", 1);
    Carrera ambiental =new Carrera("Ingenieria de Ambiental", 2);
    Carrera agronomia =new Carrera("Ingenieria de Agronomia", 3);
    
    sistemas.getListaMateria().add(programacion);
    sistemas.getListaMateria().add(matematicas);
    sistemas.getListaMateria().add(biologia);
    
    ambiental.getListaMateria().add(matematicas1);
    ambiental.getListaMateria().add(biologia1);
    ambiental.getListaMateria().add(programacion1);
    
    agronomia.getListaMateria().add(biologia);
    agronomia.getListaMateria().add(matematicas1);
    agronomia.getListaMateria().add(matematicas2);
    
    listaCarrera.add(sistemas);
    listaCarrera.add(ambiental);
    listaCarrera.add(agronomia);
    
    
        for (Carrera listaCarrera1 : listaCarrera) {
            System.out.println("Nombre Carrera: "+listaCarrera1.getNombreCarrera()+", Codigo: "+listaCarrera1.getCodigoCarrera());
            for(Materia listaMateria : listaCarrera1.getListaMateria()) {
                System.out.println("Nombre Materia:"+listaMateria.getNombreMateria()+", Codigo:"+listaMateria.getCodigo());
                for(Alumno listaAlumno : listaMateria.getListaAlumnos()){
                    System.out.println("Nombre Alumno:"+listaAlumno.getNombre()+", Codigo:"+listaAlumno.getCodigo());
                }
            }
        }
    
    }
    
    
    
}

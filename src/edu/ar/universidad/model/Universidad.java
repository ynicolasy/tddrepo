package edu.ar.universidad.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Universidad {
  
  private Long id;
  private String nombre;
  private HashSet<Materia> materias = new HashSet<>();
  private HashSet<Alumno> alumnos = new HashSet<>();

  public Universidad(){}

  public Universidad(Long i, String n) {
    this.id = i;
    this.nombre = n;
  }


  public void agregarAlumno(Alumno a) {
    //chequear dni existente del alumno
    if(!isDniRegistrado(a)) {
      alumnos.add(a);
    }
  }

  public boolean isDniRegistrado(Alumno a) {
    boolean dniregistrado = false;
      for(Alumno alumno : alumnos) {
        if(alumno.getId().equals(a.getId())) {
          System.out.println("Repetido");
          dniregistrado = true;
        } else {
          System.out.println("guardar");
        }
      }
    return dniregistrado;
  }

  public void listarAlumnos() {
    for(Alumno alumno : this.alumnos) {
      System.out.println(alumno);
    }
  }

public void agregarMateria(Materia m) {
    //chequear dni existente del alumno
    if(!isMateriaRegistrada(m)) {
      materias.add(m);
    }
  }

  public boolean isMateriaRegistrada(Materia m) {
    boolean matRegistrada = false;
      for(Materia materia : materias) {
        if(materia.getId().equals(m.getId())) {
          System.out.println("Repetida");
          matRegistrada = true;
        } else {
          System.out.println("guardar");
        }
      }
    return matRegistrada;
  }

  public void listarMaterias() {
    for(Materia materia : materias) {
      System.out.println(materia);
    }
  }


  //Iria en una clase?
  public void crearDocente() {

  }

  public void inscribirAlumnoACurso(Long dni, Long codComision) {

    LocalDate fechaNacimiento = LocalDate.of(2000, 1, 1);
    LocalDate fechaIngreso = LocalDate.of(2023, 1, 1);
    //se construyen dos alumnos en base al dni uno que no ingreso(a1) y el otro si(a2).
    Alumno a1 = new Alumno(dni, "nombre", "apellido", fechaNacimiento);
    Alumno a2 = new Alumno(dni, "otro", "alumno", fechaNacimiento, fechaIngreso);

    //agregar validación para la alta de la comisión
    if(a1.isIngresado()) {
      agregarAlumno(a1);
    }

    //chequear lista de correlativas aprobadas con mas de 4

    

  }
}

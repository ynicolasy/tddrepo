package edu.ar.universidad.model;

import java.time.LocalDate;

public class Alumno {

  private Long id;
  private String nombre;
  private String apellido;
  private LocalDate fechaNac;
  private LocalDate fechaIng;

  //Constructores
  public Alumno(){}

  public Alumno(Long i, String n, String a, LocalDate fn) {
    this.id = i;
    this.nombre = n;
    this.apellido = a;
    this.fechaNac = fn;
  }


  public Alumno(Long i, String n, String a, LocalDate fn, LocalDate fi) {
    this.id = i;
    this.nombre = n;
    this.apellido = a;
    this.fechaNac = fn;
    this.fechaIng = fi;
  }

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public String getNombre() {
    return nombre;
  }


  public void setNombre(String nombre) {
    this.nombre = nombre;
  }


  public String getApellido() {
    return apellido;
  }


  public void setApellido(String apellido) {
    this.apellido = apellido;
  }


  public LocalDate getFechaNac() {
    return fechaNac;
  }


  public void setFechaNac(LocalDate fechaNac) {
    this.fechaNac = fechaNac;
  }


  public LocalDate getFechaIng() {
    return fechaIng;
  }


  public void setFechaIng(LocalDate fechaIng) {
    this.fechaIng = fechaIng;
  }

  public boolean isIngresado() {
    boolean respuesta = false;
    if (fechaIng != null) {
      respuesta = true;
    } 
    return respuesta;
  }

  @Override
  public String toString() {
    return "Alumno [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac
        + ", fechaIng=" + fechaIng + "]";
  }
  
}

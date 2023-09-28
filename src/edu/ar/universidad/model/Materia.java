package edu.ar.universidad.model;

public class Materia {
  
  private Long id;
  private String nombre;

  public Materia(){}

  public Materia(Long i, String n) {
    this.id = i;
    this.nombre = n;
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

  @Override
  public String toString() {
    return "Materia [id=" + id + ", nombre=" + nombre + "]";
  }

}

package edu.ar.universidad.model;

import java.time.LocalDate;

public class CicloLectivo {

  public Long id;
  public LocalDate fechaInicio;
  public LocalDate fechaFinalizacion;
  public LocalDate fechaInicioInscripcion;
  public LocalDate fechaFinalizacionInscripcion;

  public CicloLectivo(){}

  public CicloLectivo(Long id, LocalDate fechaInicio, LocalDate fechaFinalizacion, LocalDate fechaInicioInscripcion,
      LocalDate fechaFinalizacionInscripcion) {
    this.id = id;
    this.fechaInicio = fechaInicio;
    this.fechaFinalizacion = fechaFinalizacion;
    this.fechaInicioInscripcion = fechaInicioInscripcion;
    this.fechaFinalizacionInscripcion = fechaFinalizacionInscripcion;
  }

  @Override
  public String toString() {
    return "CicloLectivo [id=" + id + ", fechaInicio=" + fechaInicio + ", fechaFinalizacion=" + fechaFinalizacion
        + ", fechaInicioInscripcion=" + fechaInicioInscripcion + ", fechaFinalizacionInscripcion="
        + fechaFinalizacionInscripcion + "]";
  }

  

  
}

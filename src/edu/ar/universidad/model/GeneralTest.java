package edu.ar.universidad.model;

import java.time.LocalDate;

public class GeneralTest {

  public static void main(String[] args) {
    
    //Agregar Alumno
    LocalDate fechaNac = LocalDate.of(2000, 1, 1);
    //Alumno n = new Alumno(336699L, "Linus", "Torvalds", fechaNac);
    Alumno n = new Alumno();
    n.setId(333L);
    n.setNombre("Linus");
    n.setApellido("Torvalds");
    n.setFechaNac(fechaNac);
    System.out.println(n);


    //Agregar Materia
    Materia m = new Materia(123L, "Java SpringBoot");
    System.out.println(m);

    //Universidad
    Universidad u = new Universidad(1L, "MIT");
    
    

  }
  
}

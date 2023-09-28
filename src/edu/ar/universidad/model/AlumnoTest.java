package edu.ar.universidad.model;

import java.time.LocalDate;

public class AlumnoTest {
  public static void main(String[] args) {
    LocalDate fechaNac = LocalDate.of(2000, 1, 1);
    //Alumno n = new Alumno(336699L, "Linus", "Torvalds", fechaNac);
    Alumno n = new Alumno();
    n.setId(333L);
    n.setNombre("Linus");
    n.setApellido("Torvalds");
    n.setFechaNac(fechaNac);
    System.out.println(n);


    Alumno n2 = new Alumno();
    n2.setId(333L);
    n2.setNombre("Linus");
    n2.setApellido("Torvalds");
    n2.setFechaNac(fechaNac);
    System.out.println(n2);

    //Alumno na = new Alumno(336699L, "Linus", "Torvalds", fechaNaci);
    System.out.println(n2);
  }
}

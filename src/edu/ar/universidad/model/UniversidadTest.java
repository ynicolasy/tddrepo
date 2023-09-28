package edu.ar.universidad.model;

import java.time.LocalDate;

public class UniversidadTest {

  public static void main(String[] args) {
    
    //Crear Alumnos
    LocalDate fechaNac = LocalDate.of(2000, 1, 1);
    LocalDate fechaIng = LocalDate.of(2020, 1, 1);
    //Alumno n = new Alumno(336699L, "Linus", "Torvalds", fechaNac);
    Alumno a1 = new Alumno();
    a1.setId(333L);
    a1.setNombre("Linus");
    a1.setApellido("Torvalds");
    a1.setFechaNac(fechaNac);

    Alumno a2 = new Alumno();
    a2.setId(3313L);
    a2.setNombre("Richard");
    a2.setApellido("Stallman");
    a2.setFechaNac(fechaNac);

    Alumno a3 = new Alumno();
    a3.setId(3313L);
    a3.setNombre("Richard");
    a3.setApellido("Tex Tex");
    a3.setFechaNac(fechaNac);

    Alumno a4 = new Alumno();
    a4.setId(20244L);
    a4.setNombre("Juana");
    a4.setApellido("Perez");
    a4.setFechaNac(fechaNac);

    //crear Materias
    Materia m1 = new Materia(123L, "Java SpringBoot");
    Materia m2 = new Materia(2020L, "JUnit");
    Materia m3 = new Materia(2020L, "Python");
    Materia m4 = new Materia(2021L, "UX / UI");
    //Universidad
    Universidad u = new Universidad(1L, "MIT");
    u.agregarAlumno(a1);
    u.agregarAlumno(a2);
    //este alumno3 tiene dni igual al alumno2 y no se agrega
    u.agregarAlumno(a3);
    u.agregarAlumno(a4);
    u.listarAlumnos();


    u.agregarMateria(m1);
    u.agregarMateria(m2);
    u.agregarMateria(m3);
    u.agregarMateria(m4);
    u.listarMaterias();



  }
  
}

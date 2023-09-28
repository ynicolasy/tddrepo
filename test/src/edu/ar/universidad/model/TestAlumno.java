package edu.ar.universidad.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class TestAlumno {


	LocalDate fechaNacimiento = LocalDate.of(2000, 1, 1);
    LocalDate fechaIngreso = LocalDate.of(2023, 1, 1);
    
	Alumno a1 = new Alumno(336699L, "Linus", "Torvalds", fechaNacimiento);
	Alumno a2 = new Alumno(336699L, "Richard", "Stallman", fechaNacimiento, fechaIngreso);
    @Test
    void alumnoIngresado() {
        assertEquals(true, a2.isIngresado());
    }
    
    @Test
    void alumnoNoIngresado() {
        assertEquals(false, a1.isIngresado());
    }
    

}



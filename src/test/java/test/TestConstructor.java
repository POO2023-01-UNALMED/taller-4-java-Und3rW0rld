package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import classroom.*;

import java.io.*;

import org.junit.jupiter.api.Test;

public class TestConstructor {

   @Test
   public void testConstructorPersona()
   {
    Persona persona1 = new Persona();
    Persona persona2 = new Persona("Jaime");
    Persona persona3 = new Persona(1234);
    Persona persona4 = new Persona("Oswaldo", 2345);
    Persona persona5 = new Persona(3456, "David");

    boolean ok = false;
    if (persona1.getCedula() == 0 && 
        persona2.getCedula() == 1 && persona2.getNombre().equals("Jaime") &&
        persona3.getCedula() == 1234 && persona3.getNombre().equals("") &&
        persona4.getCedula() == 2345 && persona4.getNombre().equals("Oswaldo") &&
        persona5.getCedula() == 3456 && persona5.getNombre().equals("David")) {
      ok = true;
    }

    assertTrue(ok, "Hay un problema en el constructor de Persona");
   }

   @Test
   public void testConstructorAsignatura()
   {
    Asignatura asignatura1 = new Asignatura();
    Asignatura asignatura2 = new Asignatura("POO", Tipo.DISCIPLINAR);
    Asignatura asignatura3 = new Asignatura(1029, Tipo.FUNDAMENTACION);
    Asignatura asignatura4 = new Asignatura("Vision por computador", 3984, 4983, Tipo.ELECTIVA);
    
    boolean ok = false;
    if (asignatura1.nombre.equals("Sin nombre") && asignatura1.tipo == Tipo.FUNDAMENTACION && asignatura1.codigoExterno == 0 &&
        asignatura2.nombre.equals("POO") && asignatura2.tipo == Tipo.DISCIPLINAR && asignatura2.codigoExterno == 0 &&
        asignatura3.nombre.equals("Sin nombre") && asignatura3.tipo == Tipo.FUNDAMENTACION && asignatura3.codigoExterno == 1029 &&
        asignatura4.nombre.equals("Vision por computador") && asignatura4.tipo == Tipo.ELECTIVA && asignatura4.codigoExterno == 4983) {
      ok = true;
    }

    assertTrue(ok, "Hay un problema en el constructor de Asignatura");
   }

   @Test
   public void testConstructorGrupo()
   {
    Persona[] personas = new Persona[5];
    personas[0] = new Persona();
    personas[1] = new Persona("Jaime");
    personas[2] = new Persona(1234);
    personas[3] = new Persona("Oswaldo", 2345);
    personas[4] = new Persona(3456, "David");
    
    Persona profesor1 = new Persona("Guzman", 8769);
    Persona profesor2 = new Persona("Andres", 8769);
    Asignatura asignatura1 = new Asignatura("POO", Tipo.DISCIPLINAR);
    Asignatura asignatura2 = new Asignatura("Vision por computador", 3984, 4983, Tipo.ELECTIVA);
    
    Grupo grupo1 = new Grupo(personas, profesor1, asignatura1, 5456, "L V 4-6");
    Grupo grupo2 = new Grupo(3, profesor2, asignatura2, 6784, "W V 8-10");
    
    boolean ok = false;
    if (grupo1.codigo == 5456 && grupo1.estudiantes[3].getNombre().equals("Oswaldo") &&
        grupo2.codigo == 6784 && grupo2.profesor.getNombre().equals("Andres")) {
      ok = true;
    }

    assertTrue(ok, "Hay un problema en el constructor de Grupo");
   }
}

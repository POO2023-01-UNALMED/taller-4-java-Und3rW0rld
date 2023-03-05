package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import classroom.Taller4;

import java.io.*;

import org.junit.jupiter.api.Test;

public class TestCoincidencia {

   @Test
   public void testMain()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     Taller4.main(null);
     
     String texto= "Sin nombre 10122 882 50 0 1 ";
     
     // assertion
     assertEquals(texto, bos.toString().replaceAll("(?:\\\\[rn]|[\\r\\n]+)+", " "));

     // undo the binding in System
     System.setOut(originalOut);
   }
}

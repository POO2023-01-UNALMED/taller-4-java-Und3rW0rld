package classroom;

public class Taller4 {

    public static void main(String[] args) {
        Persona[] estudiantes1 = new Persona[3];
        estudiantes1[0] = new Persona(188220);
        estudiantes1[1] = new Persona();
        estudiantes1[2] = new Persona(71212, "Maria");
        Persona profesor1 = new Persona("Juan", 988);
        Asignatura asignatura1 = new Asignatura("Calculo",Tipo.FUNDAMENTACION);
        Grupo grupo1 = new Grupo(estudiantes1, profesor1, asignatura1, 10023, "M J 2-4");

        Persona profesor2 = new Persona(99212, "Andrea");
        Asignatura asignatura2 = new Asignatura(882,Tipo.DISCIPLINAR);
        asignatura2.setCodigoInterno(98);
        asignatura2.cambiarDatos("Estadistica");
        Grupo grupo2 = new Grupo(2, profesor2, asignatura2, 10122, "W V 8-10");
        grupo2.cambiarEstudiante(0, estudiantes1[0]);
        grupo2.cambiarEstudiante(1, estudiantes1[2]);
        grupo2.cambiarEstudiante(estudiantes1[0], estudiantes1[1]);

        System.out.println(new Asignatura().nombre);
        System.out.println(grupo2.codigo);
        System.out.println(asignatura2.codigoExterno);
        asignatura1.cambiarDatos(50);
        System.out.println(asignatura1.codigoExterno);
        System.out.println(estudiantes1[1].cedula);
        System.out.println(new Persona("Alejandro").cedula);
    }
}

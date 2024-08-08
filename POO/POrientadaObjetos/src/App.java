public class App {
    public static void main(String[] args) throws Exception {
       
        //Instanciar la clase
        Persona persona1 = new Persona();
        persona1.nombre = "Juanito";
        persona1.apellido = "Alimaña";
        persona1.edad = 21;

        Carrera carrera1 = new Carrera();
        carrera1.nombre = "Ingeniera de Software";
        carrera1.duracion = 6;
        carrera1.estaEnCurso = false;

        persona1.carrera = carrera1;

        Persona persona2 = new Persona();
        persona2.nombre = "Milan";
        persona2.apellido = "Milanesa mayonesa";
        persona2.edad = 16;

        Carrera carrera2 = new Carrera();
        carrera2.nombre = "Telecomunicaciones";
        carrera2.duracion = 7;
        carrera2.estaEnCurso = true;

        persona2.carrera = carrera2;

        System.out.println(persona1.darNombreCompleto() + " tiene " + persona1.edad + " años de edad y esta en " +carrera1.nombre);
        System.out.println(persona2.apellido + " , " + persona2.nombre + " tiene " + persona2.edad + " años de edad y esta en " +carrera2.nombre);

        System.out.println(persona1.darNombreCompleto());
        System.out.println(persona1.carrera.nombre);


        
    }
}

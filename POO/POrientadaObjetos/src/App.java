public class App {
    public static void main(String[] args) throws Exception {
       
        //Instanciar la clase
        Persona persona1 = new Persona();
        persona1.nombre = "Juanito";
        persona1.apellido = "Alimaña";
        persona1.edad = 21;


        Persona persona2 = new Persona();
        persona2.nombre = "Milan";
        persona2.apellido = "Milanesa mayonesa";
        persona2.edad = 16;

        System.out.println(persona1.darNombreCompleto() + " tiene " + persona1.edad + " años de edad");
        System.out.println(persona2.apellido + " , " + persona2.nombre + " tiene " + persona2.edad + " años de edad");

    }
}

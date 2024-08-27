public class App {
    public static void main(String[] args) throws Exception {
       
        //Instanciar la clase
        Persona persona1 = new Persona("Pedro","Carrascal", 25, "Ing software");
        

        System.out.println(persona1.darNombreCompleto()+ " tiene " + persona1.edad + " años y pertene a "+ persona1.carrera.nombre);
        System.out.println(persona1.carrera.nombre);


        
    }
}

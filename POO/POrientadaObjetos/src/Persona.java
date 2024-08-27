public class Persona {

    //* Atributos (estado/caracteristicas de un objeto)

    String nombre;
    String apellido;
    int edad;
    Carrera carrera;

    //* Constructor

    public Persona (String nombre, String apellido, int edad, String nombreCarrera, int duracionCarrera, boolean estaCursando){
        carrera = new Carrera(nombreCarrera, duracionCarrera, estaCursando);
        //this nombre se refiere a los atributos de arriba
        //this se utiliza para acceder a variables de instancia o metodos de la clase actual
        this.nombre = nombre; //nombre atributo de clase nos pasa
        this.apellido = apellido;
        this.edad = edad;
        carrera.nombre = nombreCarrera;
        

    }

    //Mismo constructor de mismo nombre pero con comportamientos distintos

    /* 
     *  Una sobrecarga del constructor en Java es cuando una clase tiene múltiples constructores
     *  con el mismo nombre pero con diferentes listas de parametros. Sirve para permitir la creación
     * de objetos de esa clase con diferentes configuraciones iniciales según los argumentos proporcionados al constructor
     * 
     */

    public Persona (String nombre, String apellido, int edad, String nombreCarrera){
    
        }

    //* Metodos (comportamiento de un objeto)

    public String darNombreCompleto(){
        return nombre + " " + apellido;
    }

    public String enviarSaludo(String saludado){
        return "Kiubo" + saludado;
    }

    
}

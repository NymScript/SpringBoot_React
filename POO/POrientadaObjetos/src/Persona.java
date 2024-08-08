public class Persona {

    //* Atributos (estado/caracteristicas de un objeto)

    String nombre;
    String apellido;
    int edad;
    Carrera carrera;

    //* Metodos (comportamiento de un objeto)

    public String darNombreCompleto(){
        return nombre + " " + apellido;
    }

    public String enviarSaludo(String saludado){
        return "Kiubo" + saludado;
    }

    
}

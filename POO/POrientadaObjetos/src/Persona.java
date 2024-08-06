public class Persona {

    //* Atributos (estado/caracteristicas de un objeto)

    String nombre;
    String apellido;
    int edad;

    //* Metodos (comportamiento de un objeto)

    public String darNombreCompleto(){
        return apellido + " , " + nombre;
    }

    public String enviarSaludo(String saludado){
        return "Kiubo" + saludado;
    }

    
}

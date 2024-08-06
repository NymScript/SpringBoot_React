import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
    
    //Clase scanner que nos permite que el usuario escriba
    Scanner scanner = new Scanner(System.in);

    //Declaraciones y asignaciones
    
    String palabraSecreta = "inteligencia"; // La palabra que el usuario debe adivinar
    int intentosMaximos = 10; // Número máximo de intentos permitidos
    int intentos = 0; // Contador de intentos realizados por el usuario
    boolean palabraAdivinada = false; // Bandera para saber si la palabra ha sido adivinada

    //* Arreglos

    //En programación, char es un tipo de dato que se usa para almacenar un solo carácter.
    
    char[]letrasAdivinadas = new char [palabraSecreta.length()]; // Arreglo para almacenar las letras adivinadas

    //*Estructura de control (bucle) de manera Iterativa
    for (int i = 0; i < letrasAdivinadas.length; i++) {
        letrasAdivinadas[i] ='_';  // Inicializa el arreglo con guiones bajos para mostrar las letras no adivinadas
        System.out.print(letrasAdivinadas[i]);
    }

    // Bucle principal del juego
    while (!palabraAdivinada && intentos < intentosMaximos) {

        System.out.println("Palabra a adivinar: "+ String.valueOf(letrasAdivinadas));

        System.out.print("Introduce una letra, por favor: ");
        //Si pone muchas letras solo va a tomar la primera letra
        char letra = scanner.next().charAt(0);
        
        boolean letraCorrecta = false; // Bandera para saber si la letra está en la palabra

        // Si la letra no está en la palabra secreta, aumenta el número de intentos
        for(int i = 0; i < palabraSecreta.length(); i++){
            //Estructura de control condicional
            if (palabraSecreta.charAt(i)== letra) {
                letrasAdivinadas[i] =letra;
                letraCorrecta = true;
            }
        }

        if(!letraCorrecta){
            intentos++;
            System.err.println("Intento incorrecto! te quedan "+(intentosMaximos - intentos)+ " intentos");
        }

        if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
            palabraAdivinada = true;
            System.out.println("Felicidades! has adivinado la palabra secreta: " +palabraSecreta);
        }
    }

    if (!palabraAdivinada) {
        System.out.println("Que mal! te has quedado sin intentos. GAME OVER");
        
    }

    scanner.close();

    }
}



/*
 Comentario tipico, normal
 * Comentario importante, con detalle, explica
 ! Comentario de advertencia, error
 ? Comentario de pregunta, duda si compartimos el codigo con alguien
 TODO: Esta es un todo, es para tarea
 
*/
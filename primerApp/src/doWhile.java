public class doWhile {
    public static void main(String[] args) throws Exception {
    //Estructura de control (bucle DO WHILE)

    int contador = 1;

        //Sucede antes de la condición 
    do{

        System.out.println("Sucede antes de la condición");

        //Actualizacion para evitar bucle eterno
        contador++;

        
    } while (contador <= 5);


    System.out.println(contador);
                  
    }
}

/*
    do {
     Bloque de código a ejecutar
} while (condición);

Cómo Funciona:

    Ejecución del Bloque de Código: Primero, el bloque de código dentro del DO
    se ejecuta una vez sin importar si la condición es verdadera o falsa.

    Evaluación de la Condición: Después de ejecutar el bloque de código, se evalúa la condición del while.

    Repetición: Si la condición es verdadera (true), el bloque de código se ejecuta nuevamente.
    Si es falsa (false), el bucle termina y la ejecución del programa continúa después del while.
 */


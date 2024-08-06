public class arreglos_matrices_vectores {
 
    public static void main(String[]args) throws Exception {

        //ARREGLOS: Estructuras de datos que tienen valores del mismo tipo bajo un mismo nombre
        //Estos valores se distribuyen secuencialmente en la memoria y se puede acceder a ellos mediante un índice

        //LOS ARREGLOS SON TAMBIEN LLAMADOS VECTORES O MATRICES
        //El indice empieza a contar por el 0 no 1


        //Arreglo de enteros, dentro de un solo arreglo iran varios valores
        
        //tDato  //nombre      //'indices'  
        int[] numeros = {10,20,30,40};
        numeros[0] = 15;
        numeros[1] = 25;
        numeros[2] = 35;

        numeros[2] = 40;

        int indice = 0;
        //forEach
        //Un elemento de arreglo, corto pero no tiene indice
        for(int numero : numeros){
            System.out.println(numero);
            System.out.println(indice);
            indice++;
        }

        for (int index = 0; index < numeros.length; index++) {
            System.out.println(numeros[index]);

        }

        String palabra = "Abecedario";

        System.out.println(palabra.length());


    }

    /*

        Arreglo: Una fila ordenada de cajas donde cada caja tiene un número (índice) para acceder a ella.
        Todas las cajas tienen el mismo tipo de contenido y el tamaño no cambia.

        Vector: Similar a un arreglo, pero puede cambiar de tamaño,
        permitiendo agregar o quitar cajas según se necesite.

        Matriz: Una cuadrícula de cajas organizadas en filas y columnas. 
        Es útil para almacenar datos en forma de tabla.

     */

}

public class App {
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

//ALt + Shit + F

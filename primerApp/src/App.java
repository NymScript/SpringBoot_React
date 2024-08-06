public class App {
    public static void main(String[] args) throws Exception {
    //Estructura de control (bucle while)

    int contador = 1;

    while (contador <= 5) {
        System.out.println(contador);

        //Actualización de la variable,si no ponemos esto sera un bucle infinito hasta que se coma toda la RAM
        contador++;
    }

    System.out.println(contador);
                  
    }
}

//ALt + Shit + F

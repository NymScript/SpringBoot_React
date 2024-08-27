import java.util.Scanner;

//Escribe un programa que pida al usuario 2 números, mostrando como salida cuál es el número mayor
// y la diferencia de uno respecto al otro. En caso de que los números sean iguales, mostrarlo también en pantalla.

public class retoNumeros {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Continuar con el menú
        boolean continuar = true;

        while (continuar) {
            
            System.out.println("-------------------------------------|");
            System.out.println("Tienes que ingresar dos numeros :)   |");
            System.out.println("-------------------------------------|");
            System.out.print("Primer número: ");
            int numero1 = scanner.nextInt();
            System.out.print("Segundo número: ");
            int numero2 = scanner.nextInt();
    
        if (numero1 < numero2) {
            System.out.println("El número " + numero1 + " es menor a " + numero2);
            
        } else if (numero2 < numero1){
            System.out.println("El número " + numero2 + " es mayor a " + numero1);
    
        } else if (numero1 == numero2){
            System.out.println("Los números son iguales");
    
        } else{
            System.out.println("Debes ingresar un número");
    
        }
        System.out.println("-------------------------------------|");
        System.out.println("¿Deseas continuar?                   |");
        System.out.println("-------------------------------------|");
        System.out.println("1. Si                                |");
        System.out.println("2. No                                |");
        System.out.println("-------------------------------------|");
        System.out.print("Opción = ");
        int opcion = scanner.nextInt();
    

        if (opcion == 1 ) {
            continuar = true;
        } else if(opcion == 2) {
            continuar = false;
            
        } else {
            System.out.println("Opción no valida");
        }
    

        }

        scanner.close();
    }
    
}

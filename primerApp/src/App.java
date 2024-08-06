import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué tipo de bebida te gusta?");
        System.out.println("");
        System.out.println("1. Cafe");
        System.out.println("2. Mate");
        System.out.println("3. Chocolate");
        System.out.println("4. Leche");
        System.out.println("");
        System.out.print("Me gusta: ");

        //Guardara en opcion un tipo de dato int y el scanner solo recibira int como tipo de dato entrada
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Delicioso, mezclalo con Java");
                break;
            case 2:
                System.out.println("Nariz de argentino debes tener");  
                break;      
            case 3:
                System.out.println("Confirmooo, delicioso");
                break;
            case 4:
                System.out.println("Buena combinacion para un browni");     
                break;   
            default:
                System.out.println("Nah, pon una opcion de 1 al 4");
                break;
        }

        // Crtl k + Crtl c -> Comentar varias lineas

        // if (opcion <= 4) {
        //     System.out.println("Disfruta la bebida");
        // }
        
        System.out.println("Disfrutalo!");


        //Cierro el escaner para que deje de escuchar
        scanner.close();
    }
}

//ALt + Shit + F

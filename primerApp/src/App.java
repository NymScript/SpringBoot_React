import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Que tipo de bebida te gusta?: ");
        String bebida = scanner.nextLine();
        
        // Switch -> Es más adecuado cuando estás comparando una única variable con diferentes valores posibles, 
        // haciendo que el código sea más legible y organizado.

        switch (bebida) {
            case "Cafe":
                System.err.println();
                break;
            case "Leche":
                System.out.println();
                break;
            case "Maria Juana":
                System.out.println();
                break;
            default:
                System.out.println("Ahh que bien");
                break;
        }

        // if-else: para condiciones complejas y variadas que involucran operadores lógicos (como &&, ||)
        // y comparaciones de múltiples valores o expresiones.

        if(bebida == "Café"){
            System.out.println("Buena elección");
        }else if(bebida == "Mate"){
            System.out.println("Che boludo ¿era de argenina?");
        }else if(bebida == "Chocolate"){
            System.out.println("Concuerdo totalmente");
        }else if(bebida == "Aguapanela"){
            System.out.println("Mucho estilo");
        } else {
            System.out.println("Que bien!");
        }

        scanner.close();
    }
}

//ALt + Shit + F

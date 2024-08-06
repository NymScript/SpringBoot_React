import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Que tipo de bebida te gusta?: ");
        String bebida = scanner.nextLine();
        
        //Que tipo de bebida te gusta


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
        
    }
}

//ALt + Shit + F

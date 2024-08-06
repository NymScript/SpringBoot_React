public class return_continue_break {
    public static void main(String[] args) throws Exception {
    //break, continue, return

    int i;

    for( i = 1; i <= 10; i++){
        
        System.out.println(i);
        if (i == 5) {
            return;//Se utiliza para devolver cosas y cerrar funcionas, se corta el codigo
            //continue; //No corta sino hace que salten, no corta el cucle sino saltea
            //break; //Nos sirve para cortar el bucle directamente
        }
        System.out.println(i);

    }

    //Entonces el return a diferencia del break, 

    //Return -> es para devolver valores, se utiliza dentro de funciones o metodos
   
    //Break -> Se usa dentro de bucle (for,while,do while) se interrumpe inmediatamente, 
    //y el programa continúa ejecutando el código después del bloque.
                  
    }

}


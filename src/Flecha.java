/*longitud: Un entero que representa la longitud de la flecha.
  color: Una cadena de texto que representa el color de la flecha.*/
public class Flecha {
    int longitud;
    String color;

 /*Un constructor sin argumentos que inicializa la longitud de la flecha a 18 y el color a "negro".*/   
    public Flecha() {
        longitud = 18;
        color = "negro";
    }
    
/*Un constructor con argumentos que permite al usuario especificar la longitud 
y el color de la flecha al momento de crear una instancia de la clase*/
    public Flecha(int longitud, String color) {
        this.longitud = longitud;
        this.color = color;
    }

/*Un método que imprime el símbolo especificado. Si el color de la flecha es "negro", se imprime el símbolo 
  normalmente con System.out.print(). Si el color no es "negro", se imprime el símbolo en rojo utilizando System.err.print(). */
    public void imprimir(String simbolo) {
        if (color.equals("negro")) {
            System.out.print(simbolo);
        } else {
            System.err.print(simbolo);
        }
    }

    /*Un método que construye la flecha imprimiendo una serie de guiones ("-") según la longitud especificada y luego
      imprime el símbolo de la flecha (">") seguido de un salto de línea.*/
    public void construirFlecha() {
        for (int i = 0; i < longitud; i++) {
            imprimir("-");
        }
        imprimir("> \n");
    }
}
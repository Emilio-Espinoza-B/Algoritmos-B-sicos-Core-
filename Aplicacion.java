import clases.Algoritmos;

public class Aplicacion {
    public static void main(String[] args) {
        
        //metodo es par 
        System.out.println("6 es par? " + Algoritmos.esPar(6));
        System.out.println("3 es par? " + Algoritmos.esPar(3));

        // metodo de numeros primos
        System.out.println("13 es primo? " + Algoritmos.esPrimo(13));
        System.out.println("20 es primo? " + Algoritmos.esPrimo(20));

        //metodo de imprimir al reves
        System.out.println("El reversa de 'gato' es: " + Algoritmos.stringEnReversa("gato"));
        System.out.println("El reversa de 'perro' es: " + Algoritmos.stringEnReversa("perro"));

        // metodo si la palabra si se lee igual al reves
        System.out.println("'reconocer' es un palindromo? " + Algoritmos.esPalindromo("reconocer"));
        System.out.println("'azul' es un palindromo? " + Algoritmos.esPalindromo("azul"));

        // secuencia
        System.out.println("Secuencia FizzBuzz hasta 15:");
        Algoritmos.secuenciaFizzBuzz(15);
    }
}

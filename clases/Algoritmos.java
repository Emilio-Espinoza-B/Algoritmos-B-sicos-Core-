package clases;

public class Algoritmos {

    //se encarga si el primo es par
    public static boolean esPar(int par){
        return par % 2 == 0;
    }

    //se encarga si el secuencia es primo
    public static boolean esPrimo(int primo){
        if (primo <= 1) return false;
        for (int i =2; i < primo; i++){
            if (primo % i ==0) return false;
        }
        return true;
    }

    //imprime las palabras al reves 
    public static String stringEnReversa(String reves){
        StringBuilder reversa = new StringBuilder(reves);
        return reversa.reverse().toString();
    }

    //indica si la palabra se lee igual al reves
    public static boolean esPalindromo(String igual){
        String palabra = stringEnReversa(igual);
        return igual.equals(palabra);
    }

    // secuencia de fizz
    public static void secuenciaFizzBuzz(int secuencia) {
        for (int i = 1; i <= secuencia; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            } 
        }
        System.out.println();
    }
}


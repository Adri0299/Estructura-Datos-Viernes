package TrabajoClase.Semana2;
//Debe tener minimo una condicion de Parada/Base y que se llame a si misma

public class recursion {

    static int arr[] = {12, 34, 64, 2, 3};

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {

            return n * factorial(n - 1);
        }
    }

    public static int encontrarMax(int[] numeros, int indice, int max) {
        if (indice != numeros.length) {

            if (numeros[indice] > max) {
                System.out.println("\n");
                System.out.print(max);
                System.out.print(" ");
                System.out.print(numeros[indice]);
                max = encontrarMax(numeros, indice + 1, numeros[indice]);

            } else {
                System.out.println("\n");
                System.out.print(max);
                 System.out.print(" ");
                System.out.print(numeros[indice]);
                max = encontrarMax(numeros, indice + 1, max);
            }
        }
        System.out.println("\n"); //espacios en blanco, son las que hizo y devolvio el num
        return max;
    }
}

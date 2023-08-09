package Atv10;

public class ExercicioSemRetorno {
    public static void imprimirNumeros(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(+i+"º Numero é: " +numeros[i]);

        }
    }

    public static void somaNumeros(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println("Soma total: " + soma);
    }

    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5 };

        imprimirNumeros(numeros);

        somaNumeros(numeros);
        
        imprimirNumeros(numeros);
    }
}

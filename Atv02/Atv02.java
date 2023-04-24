package Atv02;

import java.util.Scanner;

public class Atv02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um inteiro: ");
        int value = scanner.nextInt();
        System.out.println("o inteiro informado é: " + value);

        sumVar();
        payment();

    }

    public static void sumVar() {
        System.out.println("///////////////////////////////////");
        int b = 8;
        int c = 4;
        int a = b + c;

        System.out.println("A soma das duas variáveis é: " + a);
    }

    public static void payment() {
        System.out.println("///////////////////////////////////");
        int desconto = 200;
        int inss = 100;
        int salario = 1900;
        int resto = salario - (desconto + inss);
        System.out.println("O salario final ficou: " + resto); // essa é um calculo de exemplo de folha de pagamento
    }

}

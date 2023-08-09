#Atividade 06

1 - Criei uma variavel de depósito fixo mensal onde será o valor fixo depositado todo mes

2 - Criei uma variavel de montante que é o valor desejado

3 - Assim então eu criei mais 3 variáveis que são utilizadas para fazer o calculo, "saldo" que será o saldo final de cada loop da conta, "meses" será a quantidade de meses até atingir o montante e por ultimo "saldoatual" que será o saldo que está sendo gerado até chegar no montante

4 - Faço um laço de while e nele faço a conta de pegar o valor do depósito, multiplicar por 0,5%, e assim no "saldoatual" eu pego o resultado dos 0,5% do depósito de todo mês enquanto cada loop a variável "meses" soma + 1 

5 - No final eu só printo a quantidade de meses que foi somado até o "saldoatual" que é a variavel que recebe os 0,5% de todo mes chegar no montate desejado

~~~java
package Atv06;

public class Atv06 {
    public static void main(String[] args) {
        float depositoFM = 1500;
        float montante = 2000;

        System.out.println("total de meses: " + calcularMeses(depositoFM, montante));
    };

    public static int calcularMeses(float depositoFM, float montante) {
        float saldo = 0;
        int meses = 0;
        float saldoatual = 0;
        while (saldoatual < montante) {
            saldo += depositoFM;
            saldo *= 0.005;
            saldoatual += saldo;
            meses++;
        }
        return meses;
    };
}
~~~

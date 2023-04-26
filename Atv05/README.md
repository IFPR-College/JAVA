#Atividade 05 

1 - Setei as variáveis de gastos mensais(jan, fev e mar)

2 - Criei a variável "gastosTrimestre" para juntar todos os gastos

3 - Criei a variável "mediaMensal" para tirar a média, no caso a soma de todos os meses de gastos divido pela quantidade de meses somados 

4 - Printei na tela a média

~~~java
package Atv05;

public class Atv05 {
    public static void main(String[] args) {
        double gastosJaneiro = 30000.00;
        double gastosFevereiro = 33030.77;
        double gastosMarco = 23899.01;
        double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        System.out.println("Os gastos do trimestre foram de: R$"+ gastosTrimestre);
        
        double mediaMensal = gastosTrimestre/3;
        System.out.println("Valor da média mensal = " + mediaMensal);
    }

}

~~~
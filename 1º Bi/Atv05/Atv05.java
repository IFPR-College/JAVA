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

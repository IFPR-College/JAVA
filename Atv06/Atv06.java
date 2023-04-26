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

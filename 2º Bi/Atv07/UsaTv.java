package Atv07;

public class UsaTv {
    public static void main(String[] args) {
        Tv tv1 = new Tv();

        tv1.canal = 180;
        tv1.volume = 5;
        tv1.aumentaVolume();
        tv1.reduzirVolume();
        tv1.reduzirVolume();
        tv1.mostrar();
    }
}

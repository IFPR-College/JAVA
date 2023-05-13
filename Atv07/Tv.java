package Atv07;

public class Tv {
    public int volume;
    public int canal;
    public void aumentaVolume(){
        volume++;
    }
    public void reduzirVolume(){
        volume--;
    }
    public void trocarCanal(int c){
        canal = c;
    }
    public void mostrar(){
        System.out.println("Volume:" + volume);
        System.out.println("Canal: " + canal);
    }
}
public class SmartTv {
    boolean ligada = false;
    int canal = 5;
    int volume = 10;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void avancarCanal() {
        canal++;
        System.out.println("Canal: " + canal);
    }

    public void voltarCanal() {
        canal--;
        System.out.println("Canal: " + canal);
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Volume: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.err.println("Volume: " + volume);
    }

}
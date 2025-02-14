public class UsuarioTV {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv.ligada);
        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);

        smartTv.ligar();

        System.out.println(smartTv.ligada);

        smartTv.avancarCanal();
        smartTv.avancarCanal();
        smartTv.avancarCanal();

        System.out.println(smartTv.canal);

        smartTv.mudarCanal(4);
        System.out.println(smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println(smartTv.volume);
    }
}
public class MinhaClasse {
    public static void main(String [] args) {
        String primeiroNome = "Diogo";
        String segundoNome = "Lima";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Meu nome é: " + primeiroNome + " " + segundoNome;
    }
}
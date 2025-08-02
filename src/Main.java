public class Main {
    public static void main(String[] args) {

        IPhone iphone = new IPhone();

        iphone.selecionarMusica("Charlie Brown Jr. - Pontes Indestrutíveis");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("11987654321");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
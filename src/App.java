import Telefone.Iphone;

public class App {
    public static void main(String[] args) throws Exception {

        Iphone iphone = new Iphone();

        //TODO: Aparelho Telefonico
        iphone.ligar("31998389773");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //TODO: Reprodutor Musical
        iphone.selecionarMusica("Chitaozinho e Xororo - Evidências");
        iphone.tocar();
        iphone.pausar();

        //TODO: Navegador Internet
        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://google.com");
        iphone.atualizar();
    }
}


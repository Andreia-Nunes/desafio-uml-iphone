package codigo.apple;

import codigo.classes.Iphone;

public class Teste {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        System.out.println();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println();

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}

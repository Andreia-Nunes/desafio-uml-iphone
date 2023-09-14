package codigo.classes;

import codigo.interfaces.NavegadorNaInternet;
import codigo.interfaces.AparelhoTelefonico;
import codigo.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }


    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }


    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página na internet...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da internet...");
    }
}

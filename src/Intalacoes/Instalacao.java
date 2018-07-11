package Intalacoes;

import Enums.Localizacao;
import Interfaces.Animal;

import java.util.ArrayList;

public abstract class Instalacao {
    private int capacidadeMaxima;
    private Localizacao localizacao;
    private double temperatura;
    private ArrayList<Animal> animaisInstalados;
    private ArrayList<ElementoInstalacao> elementosInstalacao;

    public Instalacao(
            int capacidadeMaxima,
            Localizacao localizacao,
            double temperatura) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.localizacao = localizacao;
        this.temperatura = temperatura;
        this.animaisInstalados = new ArrayList<Animal>();
        this.elementosInstalacao = new ArrayList<ElementoInstalacao>();
    }

    public ArrayList<Animal> getAnimaisInstalados() {
        return this.animaisInstalados;
    }

    public ArrayList<ElementoInstalacao> getElementosInstalacao() {
        return this.elementosInstalacao;
    }

    public boolean instalaAnimal(Animal animal) {
        if (this.animaisInstalados.size() < this.capacidadeMaxima) {
            this.animaisInstalados.add(animal);
            return true;
        }

        System.out.println("Capacidade de animal atingida. Animal não instalado.");
        return false;
    }

    public void addElementoInstalacao(ElementoInstalacao elementoInstalacao) {
        this.elementosInstalacao.add(elementoInstalacao);
    }

    public Localizacao getLocalizacao() {
        return this.localizacao;
    }
}
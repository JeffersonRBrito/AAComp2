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

    public abstract boolean instalaAnimal(Animal animal);
    public abstract void addElementoInstalacao(ElementoInstalacao elementoInstalacao);
}

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
	
    public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}
	public Localizacao getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public ArrayList<Animal> getAnimaisInstalados() {
		return animaisInstalados;
	}
	public void setAnimaisInstalados(ArrayList<Animal> animaisInstalados) {
		this.animaisInstalados = animaisInstalados;
	}
	public ArrayList<ElementoInstalacao> getElementosInstalacao() {
		return elementosInstalacao;
	}
	public void setElementosInstalacao(ArrayList<ElementoInstalacao> elementosInstalacao) {
		this.elementosInstalacao = elementosInstalacao;
	}
    
    
}

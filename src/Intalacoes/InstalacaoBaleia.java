package Intalacoes;

import java.util.ArrayList;

import Interfaces.Animal;

public class InstalacaoBaleia extends Instalacao{


	@Override
	public void setTemperatura(double temperatura) {
		super.setTemperatura(24);
	}
	
	@Override
	public void setCapacidadeMaxima(int capacidadeMaxima) {
		super.setCapacidadeMaxima(2);
	}
	
	@Override
	public void setElementosInstalacao(ArrayList<ElementoInstalacao> elementosInstalacao) {
		ArrayList<ElementoInstalacao> elementosInstalacao1 = new ArrayList<>();
		super.setElementosInstalacao(elementosInstalacao1);
	}
	
	@Override
	public boolean instalaAnimal(Animal animal) {
		return false;
	}

	@Override
	public void addElementoInstalacao(ElementoInstalacao elementoInstalacao) {
		
	}

}

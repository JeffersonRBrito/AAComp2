package Intalacoes;
import Enums.Localizacao;

public class InstalacaoZebra extends Instalacao{

	  public InstalacaoZebra(Localizacao localizacao) {
	        super(2, localizacao, 24);

	        Jaula jaula = new Jaula(20, 30 , 25);
	        super.addElementoInstalacao(jaula);
	    }

}

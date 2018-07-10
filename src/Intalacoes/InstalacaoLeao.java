package Intalacoes;
import Enums.Localizacao;

public class InstalacaoLeao extends Instalacao{

	  public InstalacaoLeao(Localizacao localizacao) {
	        super(3, localizacao, 21.5);

	        Jaula jaula = new Jaula(20, 30 , 25);
	        super.addElementoInstalacao(jaula);
	    }

}

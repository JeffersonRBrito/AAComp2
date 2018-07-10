package Intalacoes;
import Enums.Localizacao;

public class InstalacaoMacaco extends Instalacao{

	  public InstalacaoMacaco(Localizacao localizacao) {
	        super(10, localizacao, 25);

	        Jaula jaula = new Jaula(40, 35.7 , 90);
	        super.addElementoInstalacao(jaula);
	    }

}

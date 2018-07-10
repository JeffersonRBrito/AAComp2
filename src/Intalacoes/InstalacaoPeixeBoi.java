package Intalacoes;
import Enums.Localizacao;

public class InstalacaoPeixeBoi extends Instalacao{

	 public InstalacaoPeixeBoi(Localizacao localizacao) {
	        super(7, localizacao, 18);

	        Tanque tanque = new Tanque(750);
	        super.addElementoInstalacao(tanque);
	    }
}

package Intalacoes;
import Enums.Localizacao;

public class InstalacaoTubarao extends Instalacao{

	 public InstalacaoTubarao(Localizacao localizacao) {
	        super(2, localizacao, 22);

	        Tanque tanque = new Tanque(500);
	        super.addElementoInstalacao(tanque);
	    }
}

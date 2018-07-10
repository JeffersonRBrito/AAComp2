package Intalacoes;
import Enums.Localizacao;

public class InstalacaoFoca extends Instalacao{

	 public InstalacaoFoca(Localizacao localizacao) {
	        super(5, localizacao, 15);

	        Tanque tanque = new Tanque(100);
	        super.addElementoInstalacao(tanque);
	    }

}

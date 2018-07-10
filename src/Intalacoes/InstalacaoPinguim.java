package Intalacoes;
import Enums.Localizacao;

public class InstalacaoPinguim extends Instalacao{

	public InstalacaoPinguim(Localizacao localizacao) {
        super(25, localizacao, 15);

        Tanque tanque = new Tanque(100);
        super.addElementoInstalacao(tanque);
    }

}

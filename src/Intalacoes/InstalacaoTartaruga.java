package Intalacoes;
import Enums.Localizacao;

public class InstalacaoTartaruga extends Instalacao{

	public InstalacaoTartaruga(Localizacao localizacao) {
        super(17, localizacao, 20);

        Tanque tanque = new Tanque(200);
        super.addElementoInstalacao(tanque);
    }

}

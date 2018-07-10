package Intalacoes;
import Enums.Localizacao;

public class InstalacaoBaleia extends Instalacao {
    public InstalacaoBaleia(Localizacao localizacao) {
        super(2, localizacao, 19);

        Tanque tanque = new Tanque(1000);
        super.addElementoInstalacao(tanque);
    }

}

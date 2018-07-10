package Intalacoes;

import Enums.Localizacao;

public class FabricaInstalacao {
    public InstalacaoElefante criaInstalacaoElefante(Localizacao localizacao) {
        return new InstalacaoElefante(localizacao);
    }
}

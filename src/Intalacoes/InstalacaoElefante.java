package Intalacoes;

import Enums.Localizacao;

import java.util.ArrayList;

public class InstalacaoElefante extends Instalacao {
    public InstalacaoElefante(Localizacao localizacao) {
        super(2, localizacao, 23);

        Jaula jaula = new Jaula(20, 30 , 25);
        super.addElementoInstalacao(jaula);
    }

}

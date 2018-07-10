package Intalacoes;

import Enums.Localizacao;

public class FabricaInstalacao {
    
	public InstalacaoBaleia criarInstalacaoBaleia(Localizacao localizacao) {
        return new InstalacaoBaleia(localizacao);
    }
	
	public InstalacaoElefante criarInstalacaoElefante(Localizacao localizacao) {
        return new InstalacaoElefante(localizacao);
    }
    
	public InstalacaoFoca criarInstalacaoFoca(Localizacao localizacao) {
        return new InstalacaoFoca(localizacao);
    }
	
	public InstalacaoLeao criarInstalacaoLeao(Localizacao localizacao) {
        return new InstalacaoLeao(localizacao);
    }
	
	public InstalacaoMacaco criarInstalacaoMacaco(Localizacao localizacao) {
        return new InstalacaoMacaco(localizacao);
    }
	
	public InstalacaoPeixeBoi criarInstalacaoPeixeBoi(Localizacao localizacao) {
        return new InstalacaoPeixeBoi(localizacao);
    }
	
	public InstalacaoPinguim criarInstalacaoPinguim(Localizacao localizacao) {
        return new InstalacaoPinguim(localizacao);
    }
	
	public InstalacaoTartaruga criarInstalacaoTartaruga(Localizacao localizacao) {
        return new InstalacaoTartaruga(localizacao);
    }
	
	public InstalacaoTubarao criarInstalacaoTubarao(Localizacao localizacao) {
        return new InstalacaoTubarao(localizacao);
    }
	
	public InstalacaoZebra criarInstalacaoZebra(Localizacao localizacao) {
        return new InstalacaoZebra(localizacao);
    }
	
}
import Animais.*;
import Enums.Localizacao;
import Enums.Sexo;
import Intalacoes.FabricaInstalacao;
import Intalacoes.Instalacao;
import Intalacoes.Zoologico;

public class Main {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico("Zoo da UFRRJ");
        FabricaInstalacao fabricaInstalacao = new FabricaInstalacao();

        // Cria instalações com animais
        Instalacao instalacaoBaleia = fabricaInstalacao.criarInstalacaoBaleia(Localizacao.NORTE);
        Instalacao instalacaoElefante = fabricaInstalacao.criarInstalacaoElefante(Localizacao.NORDESTE);
        Instalacao instalacaoFoca = fabricaInstalacao.criarInstalacaoFoca(Localizacao.NOROESTE);
        Instalacao instalacaoLeao = fabricaInstalacao.criarInstalacaoLeao(Localizacao.CENTROESTE);
        Instalacao instalacaoMacaco = fabricaInstalacao.criarInstalacaoMacaco(Localizacao.OESTE);

        // Adiciona animais nas instalações
        instalacaoBaleia.instalaAnimal(new Baleia(Sexo.FEMININO));
        instalacaoBaleia.instalaAnimal(new Baleia(Sexo.MASCULINO));
        instalacaoElefante.instalaAnimal(new Elefante(Sexo.MASCULINO));
        instalacaoFoca.instalaAnimal(new Foca(Sexo.MASCULINO));
        instalacaoLeao.instalaAnimal(new Leao(Sexo.FEMININO));
        instalacaoMacaco.instalaAnimal(new Macaco(Sexo.MASCULINO));

        // Adiciona as instalações ao zoológico
        zoo.adicionaInstalação(instalacaoBaleia);
        zoo.adicionaInstalação(instalacaoElefante);
        zoo.adicionaInstalação(instalacaoFoca);
        zoo.adicionaInstalação(instalacaoLeao);
        zoo.adicionaInstalação(instalacaoMacaco);

        // Valida se o zoológico foi totalmente preenchido ou não
//         zoo.validaLocalizacoes();

        // Tenta colocar uma instação diferente na mesma localidade de outra
//        Instalacao instalacaoPeixeBoi = fabricaInstalacao.criarInstalacaoPeixeBoi(Localizacao.NORDESTE);
//        instalacaoPeixeBoi.instalaAnimal(new PeixeBoi(Sexo.MASCULINO));
//        zoo.adicionaInstalação(instalacaoPeixeBoi);

        // Tenta instalar um animal além da capacidade
//         instalacaoBaleia.instalaAnimal(new Baleia(Sexo.MASCULINO));

        // Move todos os animais do zoológico
//         zoo.moveAnimais();
    }
}

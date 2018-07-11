package Intalacoes;

import Enums.Localizacao;
import Interfaces.Animal;

import java.util.ArrayList;

public class Zoologico {
    private String nome;
    private ArrayList<Instalacao> instalacaos;

    public Zoologico(String nome) {
        this.nome = nome;
        instalacaos = new ArrayList<Instalacao>();
    }

    public void setNome(String nome) {
        if (!nome.isEmpty())
            this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public boolean adicionaInstalação(Instalacao instalacao) {
        for (Instalacao inst : this.instalacaos) {
            if (inst.getLocalizacao() == instalacao.getLocalizacao()) {
                System.out.println("A localização " + instalacao.getLocalizacao().toString() + " do zoológico já possui uma instalação");
                return false;
            }
        }

        this.instalacaos.add(instalacao);
        return true;
    }

    public void validaLocalizacoes() {
        boolean contemInstalacao = false;
        boolean tudoPreenchido = true;
        for (Localizacao localizacao : Localizacao.values()) {
            for (Instalacao instalacao : this.instalacaos) {
                if (instalacao.getLocalizacao() == localizacao)
                    contemInstalacao = true;
            }

            if (!contemInstalacao) {
                tudoPreenchido = false;
                System.out.println("A localização " + localizacao.toString() + " está vazia");
            }

            contemInstalacao = false;
        }

        if (tudoPreenchido) {
            System.out.println("O zoológico está totalmente preenchido");
        }
    }

    public void moveAnimais() {
        for (Instalacao instalacao : instalacaos) {
            for (Animal animal : instalacao.getAnimaisInstalados()) {
                animal.locomover();
            }
        }
    }
 }

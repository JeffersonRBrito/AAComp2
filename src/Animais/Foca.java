package Animais;

import Enums.Alimento;
import Enums.Porte;
import Enums.Sexo;
import Interfaces.Anfibio;

public class Foca implements Anfibio {
    private Porte porte;
    private Sexo sexo;

    public Foca(Sexo sexo) {
        this.setPorte(Porte.MEDIO);
        this.setSexo(sexo);
    }

    @Override
    public void andar() {
        System.out.println("estou andando");
    }

    @Override
    public boolean alimentar(Alimento alimento) {
        if (alimento == Alimento.PEIXES)
            return true;

        return true;
    }

    @Override
    public void locomover() {
        this.nadar();
        this.andar();
    }

    @Override
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public void setPorte(Porte porte) {
        if (porte != Porte.MEDIO)
            return;

        this.porte = porte;
    }

    @Override
    public Sexo getSexo() {
        return this.sexo;
    }

    @Override
    public Porte getPorte() {
        return this.porte;
    }

    @Override
    public void nadar() {
        System.out.println("estou nadando");
    }
}

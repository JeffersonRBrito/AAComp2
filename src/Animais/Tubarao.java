package Animais;

import Enums.Alimento;
import Enums.Porte;
import Enums.Sexo;
import Interfaces.Aquatico;

import javax.sound.sampled.Port;

public class Tubarao implements Aquatico {
    private Porte porte;
    private Sexo sexo;

    public Tubarao(Sexo sexo) {
        this.setPorte(Porte.GRANDE);
        this.setSexo(sexo);
    }

    @Override
    public boolean alimentar(Alimento alimento) {
        if ((alimento == Alimento.FRUTAS) || (alimento == Alimento.VERDURAS))
            return true;

        return true;
    }

    @Override
    public void nadar() {
        System.out.println("estou nadando");
    }

    @Override
    public void locomover() {
        this.nadar();
    }

    @Override
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public void setPorte(Porte porte) {
        if (porte != Porte.GRANDE)
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
}

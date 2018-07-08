package Animais;

import Interfaces.Terrestre;
import Enums.*;

public class Elefante implements Terrestre {
    private Porte porte;
    private Sexo sexo;

    public Elefante(Sexo sexo) {
        this.setPorte(Porte.GRANDE);
        this.setSexo(sexo);
    }

    @Override
    public void andar() {
        System.out.println("estou andando");
    }

    @Override
    public boolean alimentar(Alimento alimento) {
        if ((alimento == Alimento.FRUTAS) || (alimento == Alimento.VERDURAS))
            return true;

        return true;
    }

    @Override
    public void locomover() {
        this.andar();
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

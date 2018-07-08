package Animais;

import Enums.Alimento;
import Enums.Porte;
import Enums.Sexo;
import Interfaces.Terrestre;

public class Macaco implements Terrestre {
    private Porte porte;
    private Sexo sexo;

    public Macaco(Sexo sexo) {
        this.setPorte(Porte.PEQUENO);
        this.setSexo(sexo);
    }

    @Override
    public void andar() {
        System.out.println("estou andando");
    }

    @Override
    public boolean alimentar(Alimento alimento) {
        if (alimento == Alimento.FRUTAS)
            return true;

        return true;
    }

    @Override
    public void locomover() {
        this.andar();
    }

    @Override
    public void setSexo(Sexo sexo) {
        if (porte != Porte.PEQUENO)
            return;

        this.sexo = sexo;
    }

    @Override
    public void setPorte(Porte porte) {
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

package Animais;

import Enums.Alimento;
import Enums.Porte;
import Enums.Sexo;
import Interfaces.Terrestre;

public class Leao implements Terrestre {
    private Porte porte;
    private Sexo sexo;

    public Leao(Sexo sexo) {
        this.setPorte(Porte.MEDIO);
        this.setSexo(sexo);
    }

    @Override
    public void andar() {
        System.out.println("estou andando");
    }

    @Override
    public boolean alimentar(Alimento alimento) {
        if (alimento == Alimento.CARNES)
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
}

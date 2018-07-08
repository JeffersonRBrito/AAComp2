package Interfaces;

import Enums.*;

public interface Animal {
    public boolean alimentar(Alimento alimento);
    public void locomover();
    public void setSexo(Sexo sexo);
    public void setPorte(Porte porte);
    public Sexo getSexo();
    public Porte getPorte();
}

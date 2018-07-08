package Intalacoes;

public class Tanque extends ElementoInstalacao {
    private double volumeEmLitros;

    public Tanque(double volumeEmLitros) {
        this.setVolumeEmLitros(volumeEmLitros);
    }

    public void setVolumeEmLitros(double volumeEmLitros) {
        if (volumeEmLitros > 0)
            this.volumeEmLitros = volumeEmLitros;
        else
            this.volumeEmLitros = 1;
    }

    public double getVolumeEmLitros() {
        return this.volumeEmLitros;
    }
}

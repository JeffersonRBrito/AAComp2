package Intalacoes;

public class Jaula extends ElementoInstalacao {
    private double altura;
    private double largura;
    private double comprimento;

    public Jaula(double altura, double largura, double comprimento) {
        this.setAltura(altura);
        this.setLargura(largura);
        this.setComprimento(comprimento);
    }

    public void setAltura(double altura) {
        if (altura > 0)
            this.altura = altura;
        else
            this.altura = 1;
    }

    public void setLargura(double largura) {
        if (largura > 0)
            this.largura = largura;
        else
            this.largura = 1;
    }

    public void setComprimento(double comprimento) {
        if (comprimento > 0)
            this.comprimento = comprimento;
        else
            this.comprimento = 1;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getLargura() {
        return this.largura;
    }

    public double getComprimento() {
        return this.comprimento;
    }

    public double area() {
        return this.altura * this.largura * this.comprimento;
    }
}

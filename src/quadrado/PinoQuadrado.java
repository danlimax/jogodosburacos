package quadrado;

public class PinoQuadrado {
    private double largura;

    public PinoQuadrado(double largura) {
        this.largura = largura;
    }

    public double getLargura() {
        return largura;
    }

    public double getSquare() {
        double resultado;
        resultado = Math.pow(this.largura, 2);
        return resultado;
    }
}

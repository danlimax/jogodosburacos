package adaptadores;

import quadrado.PinoQuadrado;
import redondo.PinoRedondo;

public class AdaptadorPinoQuadrado extends PinoRedondo {
    private PinoQuadrado pino;

    public AdaptadorPinoQuadrado(PinoQuadrado pino) {
        this.pino = pino;
    }

    public double getRaio() {
        double resultado;
        resultado = (Math.sqrt(Math.pow((pino.getLargura() / 2), 2) * 2));
        return resultado;
    }
}

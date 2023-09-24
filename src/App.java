import adaptadores.AdaptadorPinoQuadrado;
import quadrado.PinoQuadrado;
import redondo.BuracoRedondo;
import redondo.PinoRedondo;

public class App {
    public static void main(String[] args) throws Exception {
        BuracoRedondo buraco = new BuracoRedondo(8);
        PinoRedondo pr = new PinoRedondo(8);
        if (buraco.encaixa(pr)) {
            System.out.println("Pino pr8 encaixa no burado pr8");
        }

        PinoQuadrado pinoMedio = new PinoQuadrado(4);
        PinoQuadrado pinoGrande = new PinoQuadrado(30);

        AdaptadorPinoQuadrado adaptadorPinoMedio = new AdaptadorPinoQuadrado(pinoMedio);
        AdaptadorPinoQuadrado adaptadorPinoGrande = new AdaptadorPinoQuadrado(pinoGrande);
        if (buraco.encaixa(adaptadorPinoMedio)) {
            System.out.println("O pino médio: de largura 2 encaixa no buraco pr8");
        }
        if (!buraco.encaixa(adaptadorPinoGrande)) {
            System.out.println("O pino grande de largura 30 não encaixa no buraco pr8");
        }

    }
}

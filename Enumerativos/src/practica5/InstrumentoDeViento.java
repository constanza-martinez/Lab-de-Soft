package practica5;

import practica5.InstrumentoMusical;

public class InstrumentoDeViento implements InstrumentoMusical {

    @Override
    public void hacerSonar(Notas n, int duracion) {
        System.out.println("Sonando intrumento");
    }

    @Override
    public String queEs() {
        return "Instrumento de viento";
    }

    @Override
    public void afinar(FrecuenciasDeLa f) {
        System.out.println("Afinando instrumento");
    }
}

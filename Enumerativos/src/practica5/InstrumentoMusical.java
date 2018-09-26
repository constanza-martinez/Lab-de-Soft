package practica5;

public interface InstrumentoMusical {

    void hacerSonar(Notas n, int duracion);
    String queEs();
    void afinar(FrecuenciasDeLa f);
}

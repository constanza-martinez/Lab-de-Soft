package practica5;

public class Piano implements InstrumentoMusical {

    @Override
    public void hacerSonar(Notas n, int duracion) {
        System.out.println("Suena nota " + n.getAbrev() + " con tiempo " + duracion);
    }

    @Override
    public String queEs() {
        return null;
    }

    @Override
    public void afinar(FrecuenciasDeLa f) {

    }
}

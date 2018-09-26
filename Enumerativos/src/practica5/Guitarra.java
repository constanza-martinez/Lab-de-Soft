package practica5;

public class Guitarra implements InstrumentoMusical {

    @Override
    public void hacerSonar(Notas n, int duracion) { //getAbrev me da el dato
        System.out.println("Haciendo sonar guitarra con nota " + n.getAbrev() + " y duración "+ duracion);
    }

    @Override
    public String queEs() {
        return "Intrumento de cuerda";
    }

    @Override
    public void afinar(FrecuenciasDeLa f) {
        System.out.println("Afinando con frecuencia " + f.name());
    }
}

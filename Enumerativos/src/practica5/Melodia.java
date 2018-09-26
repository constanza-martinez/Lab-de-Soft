package practica5;

public class Melodia {

    private Notas nota;
    private int duracion;

    public Melodia(Notas nota, int duracion) {
        this.nota = nota;
        this.duracion = duracion;
    }

    public Notas getNota() {
        return nota;
    }

    public void setNota(Notas notas) {
        this.nota = notas;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}

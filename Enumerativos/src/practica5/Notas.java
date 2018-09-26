package practica5;

public enum Notas {

    C("DO"),
    D("RE"),
    E("MI"),
    F("FA"),
    G("SOL"),
    A("LA"),
    B("SI");

    private String abrev;

    Notas(String abrev) {
        this.abrev = abrev;
    }

    public String getAbrev(){
        return abrev;
    }
}

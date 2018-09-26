package practica5;

import java.util.ArrayList;

public class CharlyGarcia {

    public static final CharlyGarcia INSTANCE = new CharlyGarcia(new Piano());

    private Piano piano;

    public CharlyGarcia(Piano piano){
        this.piano = piano;
    }

    public void tocarCancion(ArrayList<Melodia> melodia){

        for (Melodia n:melodia) {
            piano.hacerSonar(n.getNota(), n.getDuracion());
        }
    }
}

package practica5;

import java.util.ArrayList;

public class CharlyGarciaTest {

    public static void main(String[] args){

        ArrayList<Melodia> melodia = new ArrayList<>();

        melodia.add(new Melodia(Notas.A, 1));
        melodia.add(new Melodia(Notas.B,2));
        melodia.add(new Melodia(Notas.E,1));
        melodia.add(new Melodia(Notas.G, 3));

        CharlyGarcia.INSTANCE.tocarCancion(melodia);
    }
}

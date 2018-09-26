package practica5;

public class TestGuitarra {

    public static void main(String[] args){
        Guitarra guitarra = new Guitarra();

        guitarra.hacerSonar(Notas.C, 2);
        guitarra.afinar(FrecuenciasDeLa.F440);
    }
}

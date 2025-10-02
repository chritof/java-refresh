import java.util.ArrayList;
import java.util.List;

interface Betingelse {
    boolean sjekk(int x);
}

public class Tallplukker {

    public static List<Integer> plukkUt(List<Integer> liste, Betingelse betingelse) {

        List<Integer> svar = new ArrayList<>();

        for(int tall : liste) {
            if(betingelse.sjekk(tall)) { //Bruker Betingelse-objektet sin logikk
                svar.add(tall);
            }
        }
        return svar;
    }
}
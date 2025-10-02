import java.util.List;

public class Utvalgssortering {

    public static <T> void sorter(List<T> liste, Sammenligner<T> sammenligner) {

        int n = liste.size();

        for (int i = 0; i < n; i++) {
            T min = liste.get(i);
            int minIndeks = i;

            for (int j = i + 1; j < n; j++) {
                T aktuell = liste.get(j);


                if (sammenligner.sammenlign(aktuell, min) < 0) {
                    min = aktuell;
                    minIndeks = j;
                }
            }

            T temp = liste.get(i);
            liste.set(i, min);
            liste.set(minIndeks, temp);
        }
    }

    public static <T extends Comparable<? super T>> void sorter(List<T> liste) {

        Sammenligner<T> naturlig = (a, b) -> a.compareTo(b);

        sorter(liste, naturlig);
    }
}
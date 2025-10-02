import java.util.List;

public class Utvalgssortering {
    public static <T extends Comparable<? super T>> void sorter(List<T> liste) {
        int n = liste.size();

        for(int i = 0; i < n; i++) {
            T min = liste.get(i);
            int minIndex = i;

            for(int j = i + 1; j < n; j++) {
                T aktuell = liste.get(j);

                if(aktuell.compareTo(min) < 0) {
                    min = aktuell;
                    minIndex = j;
                }
            }
            T temp = liste.get(i);
            liste.set(i, min);
            liste.set(minIndex, temp);
        }
    }
}

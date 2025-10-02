import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * Eksempel7 / Gjøre sammen i timen
 *
 * Øve oss litt på litt flere grunnleggende
 *  - source		IntStream.range(), Stream.iterate(), Stream.of()
 *  - intermediate	filter(), map(), limit(), distinct(), sorted()
 *  - terminal 		forEach(), collect(), toList()
 *
 * operations på streams.
 */

public class Eksempel7 {

    public static void main(String[] args) {

        //a) Skrive ut alle partall i området [1,10>
        System.out.println("\n\nAlle partall i området [1,10>");
        IntStream.range(1, 10).filter(i -> i % 2 == 0).forEach(System.out::println);

        //b) Skrive ut kvadratet av alle tallene området [1,10>
        System.out.println("\n\nKvadratet av alle tallene området [1,10>");
        IntStream.range(1, 10).map(i -> i*i).forEach(System.out::println);

        //c) For en strøm av tallene 100, 103, 106, 109, ...
        //   skriv ut de 10 første som er delelig med 4
        System.out.println("\n\nDe 10 første i (100, 103, 106, ...) som er delelig med 4");
        Stream.iterate(100, i -> i + 3).filter(i -> i % 4 == 0).limit(10).forEach(System.out::println);

        //d) For en stream av strenger, samle dem opp i en ny string, sortert
        //og uten duplikater. Skriv deretter ut resultatet.
        System.out.println("\n\nSorterte strenger uten duplikater");
        String resultat = Stream.of("a", "b", "a", "a", "c", "d", "b").distinct().collect(Collectors.joining(", "));
		System.out.println(resultat);

        //e) For en stream av strenger, samle dem sortert på stringlengde,
        //uten duplikater i en ny liste. Skriv deretter ut listen.
        System.out.println("\n\nSorterte strenger uten duplikater");
        List<String> favoritter = Stream.of("awdadaw", "dad", "adadadawad", "da", "dad").sorted(Comparator.comparing(String::length)).distinct().collect(Collectors.toList());
		System.out.println(favoritter);

    }
}

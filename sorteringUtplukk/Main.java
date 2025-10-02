import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("ola", "nordman", 1998);
        Person person2 = new Person("per", "sverresen", 2000);
        Person person9 = new Person("kari", "hansen", 1995);
        Person person5 = new Person("per", "sverresen", 2000);
        Person person6 = new Person("lise", "andersen", 1992);
        Person person7 = new Person("jon", "olsen", 1988);
        Person person8 = new Person("emma", "berg", 1999);

        List<Person> personer = List.of(person1, person2);

        personer.stream().sorted().forEach(System.out::println);

        PersonClassOldStyle person3 = new PersonClassOldStyle("ola", "nordman", 1998);
        PersonClassOldStyle person4 = new PersonClassOldStyle("per", "sverresen", 2000);
        List<PersonClassOldStyle> personClasses = List.of(person3, person4);
        personClasses.stream().sorted().forEach(p -> System.out.println(p));

        //sortering av tall
        List<Integer> listeAvTall = Arrays.asList(1,4,2,6,11,9,10);
        Utvalgssortering.sorter(listeAvTall);
        System.out.println("Sortert listeAvTall: " + listeAvTall);

        //sortering av tekst
        List<String> listeAvString = Arrays.asList("Aaa", "Xxx", "Bbb", "Kkk");
        Utvalgssortering.sorter(listeAvString);
        System.out.println("Sortert listeAvString: " + listeAvString);

        //sortering av personer
        List<Person> personListe = Arrays.asList(person1, person2, person5, person6, person7, person8, person9);
        Utvalgssortering.sorter(personListe);
        System.out.println("Sortert personListe: " + personListe);

        //sortere på fornavn (måtte da endre på utvalgssorterings klassen for å tillate et nytt parameter.
        Sammenligner<Person> fnsmnlgn = (a,b) -> a.fornavn().compareTo(b.fornavn());
        Utvalgssortering.sorter(personListe, fnsmnlgn);
        System.out.println("Sortert på fornavn:   " + personListe);

        Sammenligner<Person> aarsmnlgn = (a,b) -> a.fodselsaar() - b.fodselsaar();
        Utvalgssortering.sorter(personListe, aarsmnlgn);
        System.out.println("Sortert på fødselsår: " + personListe);


        //1. Sortere i "naturlig" rekkefølge i hht. String compareTo. OK
        List<String> listen = Arrays.asList("Hallo", "blabla", "knut", "Per");
        System.out.println("Original liste:     " + listen);
        Collections.sort(listen);
        System.out.println("Naturlig sortering: " + listen);

        //2. Sortere alfabetisk uavhengig av store og små bokstaver
        Collections.sort(listen, (a, b) -> a.toLowerCase().compareTo(b.toLowerCase()));
        System.out.println("Ignore case:        " + listen);

        //4. Sortere på lengden på strengene
        Collections.sort(listen, (s1,s2) -> s1.length() - s2.length());
        System.out.println("String-lengde:      " + listen);

        //5. Sortere på lengden synkende. Putte lambda-uttrykk inn i variabel.
        Comparator<String> lengdeSynkende = (s1,s2) -> s2.length() - s1.length();

        Collections.sort(listen, lengdeSynkende);
        System.out.println("Strlengde synkende: " + listen);



        List<Integer> listen2 = List.of(-4, 9, 2, 7, 6, 0);
        List<Integer> resultat = null;;

        System.out.println("Listen:      " + listen2);

        //1. Plukk ut og returner alle partall
        resultat = Tallplukker.plukkUt(listen2, x -> x % 2 == 0);
        System.out.println("Partallene:  " + resultat);

        //2. Plukk ut og returner alle tall større enn 3
        resultat = Tallplukker.plukkUt(listen2, x -> x > 3);
        System.out.println("Tallene > 3: " + resultat);
    }
}

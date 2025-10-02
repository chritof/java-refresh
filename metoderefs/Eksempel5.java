
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Eksempel5
 *
 * Vårt andre stream()-eksempel.
 * Lage en liste av etternavnene til de som er over 50 år.
 */
public class Eksempel5 {

    public static void main(String[] args) {

        //2 - Lage en liste av etternavnene til de som er over 50 år

        //Gamlemåten:
        List<String> etternavnene = new ArrayList<>();
        for(Person p : People.people) {
            if (p.age() > 50) {
                etternavnene.add(p.lastName());
            }
        }
        System.out.println(etternavnene);

        //Med streams (ligner på SQL?):
        List<Person> etternavn = People.people.stream().filter(p -> p.age() > 50).collect(Collectors.toList());
        for (Person p : etternavn) {
            System.out.println(p);
        }

        List<String> etternavn2 = People.people.stream().filter(p -> p.age() > 50).map(Person::lastName).toList();
        System.out.println(etternavn2);

        People.people.stream().filter(p -> p.age() > 50).forEach(p -> System.out.println(p.lastName()));
    }
}















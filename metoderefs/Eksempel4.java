import java.util.Arrays;

/*
 * Eksempel4
 *
 * Vårt første stream()-eksempel.
 * Skrive ut alle med fornavn som begynner på "C".
 */
public class Eksempel4 {

    public static void main(String[] args) {

        //1 - Skrive ut alle med fornavn som begynner på "C"

        //Gamlemåten:
		for (Person p : People.people) {
			if (p.firstName().startsWith("C")) {
				System.out.println(p);
			}
		}

        //Med streams:
        People.people.stream().filter(p -> p.firstName().startsWith("C")).forEach(System.out::println);


    }
}















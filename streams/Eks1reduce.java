import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Eks1reduce {

    public static void main(String[] args) {

        /* Summen av aldrene til personene i people-listen */
        int sum = People.people.stream().mapToInt(Person::age).sum();
        System.out.println(sum);

        /* En streng med alle initialene, "CD LC TC CB MA" */
        String initialer = People.people.stream().map(p -> "" + p.firstName().charAt(0) + p.lastName().charAt(0)).collect(Collectors.joining(", "));
        System.out.println(initialer);
    }
}

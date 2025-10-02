import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("ola", "nordman", 1998);
        Person person2 = new Person("per", "sverresen", 2000);

        List<Person> personer = List.of(person1, person2);

        personer.stream().sorted().forEach(System.out::println);

        PersonClassOldStyle person3 = new PersonClassOldStyle("ola", "nordman", 1998);
        PersonClassOldStyle person4 = new PersonClassOldStyle("per", "sverresen", 2000);
        List<PersonClassOldStyle> personClasses = List.of(person3, person4);
        personClasses.stream().sorted().forEach(p -> System.out.println(p));
    }
}

import java.util.stream.Collectors;

public class Eks2countmatch {

    public static void main(String[] args) {

        //Alle forbokstavene i fornavnene i en streng "CLTCM" - reduce()
        String forbokstav = People.people.stream().map(p -> "" + p.firstName().charAt(0)).reduce("",(a, b) -> a + b);
        System.out.println(forbokstav);


        //Antall personer over 50 år - count()
        long antallOver50 = People.people.stream().filter(p -> p.age() > 50).count();

        //Om vi har data som matcher - anyMatch(), allMatch(), noneMatch()
        //Er alle over 30 år?
        //Er noen over 60 år?
        boolean alleOver30 = People.people.stream().allMatch(p -> p.age() > 30);
        System.out.println(alleOver30);
        boolean noenOver60 = People.people.stream().anyMatch(p -> p.age() > 60);
        System.out.println(noenOver60);

    }

}





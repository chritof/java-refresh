public record Person(String fornavn, String etternavn, int fodselsaar) implements Comparable<Person> {

    @Override
    public String toString() {
        return "["+ fornavn + ", " + etternavn + ", " + fodselsaar + "]";
    }

    //lage en standard sortering på etternavn:
    public int compareTo(Person other) {
        System.out.println("compareTo: " + this.etternavn + " vs " + other.etternavn);
        return this.etternavn().compareTo(other.etternavn());
    }
}
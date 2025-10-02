public class PersonClassOldStyle implements Comparable<PersonClassOldStyle> {
    String fornavn;
    String etternavn;
    int fodselsaar;

    public PersonClassOldStyle(String fornavn, String etternavn, int fodselsaar) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.fodselsaar = fodselsaar;
    }

    String getFornavn() {
        return fornavn;
    }
    String getEtternavn() {
        return etternavn;
    }
    int getFodselsaar() {
        return fodselsaar;
    }
    @Override
    public String toString() {
        return "["+ fornavn + ", " + etternavn + ", " + fodselsaar + "]";
    }

    public int compareTo(PersonClassOldStyle other){
        return this.getEtternavn().compareTo(other.getEtternavn());
    }
}

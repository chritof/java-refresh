
public class BetingetUtskrift {

	private static void betingetUtskrift(String s, Betingelse2 betingelse) {
        if(betingelse.test(s)){
            System.out.println(s);
        }
	}

	public static void main(String[] args) {
        betingetUtskrift("Xylophon", str -> str.startsWith("X"));     // true → skrives ut
        betingetUtskrift("Hei", str -> str.startsWith("X"));

        betingetUtskrift("test", str -> str.length() > 3);
	}
}

@FunctionalInterface
interface Betingelse2 {
    boolean test(String s);
}




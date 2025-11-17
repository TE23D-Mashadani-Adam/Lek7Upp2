public class Larare extends PersonalBasKlass {
    String[] klasser;
    String ansvarsämne;

    public Larare(String namn, int perNum, String biträdesAnledning, String kontor, String kontrakt, String[] klasser,
            String ansvarsämne) {
        super(namn, perNum, biträdesAnledning, kontor, kontrakt);
        this.klasser = klasser;
        this.ansvarsämne = ansvarsämne;
    }

    
}

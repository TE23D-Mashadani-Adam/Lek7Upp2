public class Larare extends PersonalBasKlass {
    private String[] klasser;
    private String ansvarsämne;

    public Larare(String namn, int perNum, String biträdesAnledning, String kontor, String kontrakt, String[] klasser,
            String ansvarsämne) {
        super(namn, perNum, biträdesAnledning, kontor, kontrakt);
        this.klasser = klasser;
        this.ansvarsämne = ansvarsämne;
    }

    public void setKlasser(String[] klasser) {
        this.klasser = klasser;
    }

    public void setAnsvarsämne(String ansvarsämne) {
        this.ansvarsämne = ansvarsämne;
    }

    
}

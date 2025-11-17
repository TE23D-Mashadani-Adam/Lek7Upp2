public class Elev extends BaseClass {
    String klass;
    String[] pågåendeKurser;
    
    public Elev(String namn, int perNum, String biträdesAnledning, String klass, String[] pågåendeKurser) {
        super(namn, perNum, biträdesAnledning);
        this.klass = klass;
        this.pågåendeKurser = pågåendeKurser;
    }

    


}

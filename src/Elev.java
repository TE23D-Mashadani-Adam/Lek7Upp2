public class Elev extends BaseClass {
    private String klass;
    private String[] pågåendeKurser;
    
    public Elev(String namn, int perNum, String biträdesAnledning, String klass, String[] pågåendeKurser) {
        super(namn, perNum, biträdesAnledning);
        this.klass = klass;
        this.pågåendeKurser = pågåendeKurser;
    }

    public void setKlass(String klass) {
        this.klass = klass;
    }

    public void setPågåendeKurser(String[] pågåendeKurser) {
        this.pågåendeKurser = pågåendeKurser;
    }

    

}

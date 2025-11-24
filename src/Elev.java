import java.util.Arrays;

public class Elev extends BaseClass {
    private String klass;
    private String[] pågåendeKurser;
    
    public Elev(String namn, int perNum, String biträdesAnledning, String klass, String[] pågåendeKurser) {
        super(namn, perNum, "Studerande");
        this.klass = klass;
        this.pågåendeKurser = pågåendeKurser;
    }

    public void setKlass(String klass) {
        this.klass = klass;
    }

    public void setPågåendeKurser(String[] pågåendeKurser) {
        this.pågåendeKurser = pågåendeKurser;
    }

    @Override
    public String toString() {
        return "Elev [klass=" + klass + ", pågåendeKurser=" + Arrays.toString(pågåendeKurser) + ", getNamn()="
                + getNamn() + ", getPerNum()=" + getPerNum() + ", getBiträdesAnledning()=" + getBiträdesAnledning()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }

    

    

}

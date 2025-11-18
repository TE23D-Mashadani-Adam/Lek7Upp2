import java.util.Arrays;

public class SkolKlass {
    private String KlassNamn;
    private Elev[] elever;
    private Larare lärare;

    public SkolKlass(String klassNamn, Elev[] elever, Larare lärare) {
        KlassNamn = klassNamn;
        this.elever = elever;
        this.lärare = lärare;
    }

    // Getters
    public String getKlassNamn() {
        return KlassNamn;
    }

    public Elev[] getElever() {
        return elever;
    }

    public Larare getLärare() {
        return lärare;
    }

    @Override
    public String toString() {
        return "SkolKlass [KlassNamn=" + KlassNamn + ", elever=" + Arrays.toString(elever) + ", lärare=" + lärare + "]";
    }

    // Setters

    public void setKlassNamn(String klassNamn) {
        KlassNamn = klassNamn;
    }

    public void setElever(Elev[] elever) {
        this.elever = elever;
    }

    public void setLärare(Larare lärare) {
        this.lärare = lärare;
    }

}

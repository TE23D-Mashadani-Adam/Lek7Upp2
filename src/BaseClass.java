public class BaseClass {
    private String namn;
    private int perNum;
    private String biträdesAnledning;

    public BaseClass(String namn, int perNum, String biträdesAnledning) {
        this.namn = namn;
        this.perNum = perNum;
        this.biträdesAnledning = biträdesAnledning;
    }

    public String getNamn() {
        return namn;
    }

    public int getPerNum() {
        return perNum;
    }

    public String getBiträdesAnledning() {
        return biträdesAnledning;
    }

    
    
}

public class PersonalBasKlass extends BaseClass{
    protected String kontor;
    protected String kontrakt;
    
    public PersonalBasKlass(String namn, int perNum, String biträdesAnledning, String kontor, String kontrakt) {
        super(namn, perNum, biträdesAnledning);
        this.kontor = kontor;
        this.kontrakt = kontrakt;
    }

    

    
}

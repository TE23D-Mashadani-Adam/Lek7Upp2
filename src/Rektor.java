public class Rektor extends PersonalBasKlass {
    String programAnsvar;
    
    public Rektor(String namn, int perNum, String biträdesAnledning, String kontor, String kontrakt,
            String programAnsvar) {
        super(namn, perNum, biträdesAnledning, kontor, kontrakt);
        this.programAnsvar = programAnsvar;
    }

    public String getProgramAnsvar() {
        return programAnsvar;
    }

    public String getKontor() {
        return kontor;
    }

    public String getKontrakt() {
        return kontrakt;
    }

   

    
}

public class Skola {
    private Rektor skolRektor;
    private int antalKlasser;
    private String adress;

    public Skola(Rektor skolRektor, int antalKlasser, String adress) {
        this.skolRektor = skolRektor;
        this.antalKlasser = antalKlasser;
        this.adress = adress;
    }

    //Getters
    public Rektor getSkolRektor() {
        return skolRektor;
    }

    public int getAntalKlasser() {
        return antalKlasser;
    }

    public String getAdress() {
        return adress;
    }

    //Setters
    public void setSkolRektor(Rektor skolRektor) {
        this.skolRektor = skolRektor;
    }

    public void setAntalKlasser(int antalKlasser) {
        this.antalKlasser = antalKlasser;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    
    

}

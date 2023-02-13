import java.util.ArrayList;
public class Varausjarjestelma {
    private ArrayList<Asiakas> asiakkaat;
    private ArrayList<Esiintyjat> esiintyjat;
    private Juhla juhla;
    private ArrayList<Varaus> varaukset;

    // GETTERIT eli havainnointimuuttujat

    public ArrayList<Asiakas> getAsiakas() {
        return asiakkaat;
    }

    public ArrayList<Esiintyjat> getEsiintyjat() {
        return esiintyjat;
    }

    public Juhla getJuhla() {
        return juhla;
    }

    public ArrayList<Varaus> getVaraus() {
        return varaukset;
    }

    // SETTERIT eli asetusmuuttujat

    public void setAsiakkaat(ArrayList<Asiakas> asiakkaat) {
        this.asiakkaat = asiakkaat;
    }

    public void setEsiintyjat(ArrayList<Esiintyjat> esiintyjat) {
        this.esiintyjat = esiintyjat;
    }

    public void setJuhla(Juhla juhla) {
        this.juhla = juhla;
    }

    public void setVaraukset(ArrayList<Varaus> varaukset) {
        this.varaukset = varaukset;
    }

    public Varausjarjestelma(ArrayList<Asiakas> asiakkaat, ArrayList<Esiintyjat> esiintyjat, Juhla juhla, ArrayList<Varaus> varaukset) {
        this.asiakkaat = asiakkaat;
        this.esiintyjat = esiintyjat;
        this.juhla = juhla;
        this.varaukset = varaukset;
    }

    public static void main(String args[]) {
        // ...
    }
}
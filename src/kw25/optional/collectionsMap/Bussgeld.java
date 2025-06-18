package kw25.optional.collectionsMap;

public class Bussgeld {
    String kennzeihen;
    String marke;
    Float betrag;
    Integer punkte;
    
    public Bussgeld() {
        this("Unknown", "XX0000XX", 0f, 0);
    }
    public Bussgeld(String marke, String kennzeichen, Float betrag, Integer punkte ) {
        this.marke = marke;
        this.kennzeihen = kennzeichen;
        this.betrag = betrag;
        this.punkte = punkte;
    }
    @Override
    public String toString() {
        return "Bussgeld [kennzeihen=" + kennzeihen + ", marke=" + marke + ", betrag=" + betrag + ", punkte=" + punkte
                + "]";
    }
    
   
}

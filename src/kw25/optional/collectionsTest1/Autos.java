package kw25.optional.collectionsTest1;

public class Autos {

    int baujahr;
    String marke;
    int leistung;

    public Autos(int baujahr, String marke, int leistung) {
        this.baujahr = baujahr;
        this.marke = marke;
        this.leistung = leistung;
    }

    @Override
    public String toString() {
        return "Autos [baujahr=" + baujahr + ", marke=" + marke + ", leistung=" + leistung + "]";
    }

}

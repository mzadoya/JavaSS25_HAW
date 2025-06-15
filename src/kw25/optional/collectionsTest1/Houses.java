package kw25.optional.collectionsTest1;

public class Houses implements Comparable<Houses>{
    
    int preis;
    int wohnflaeche;
    
    public Houses (int preis, int wohnflaeche) {
        this.preis = preis;
        this.wohnflaeche = wohnflaeche;
    }
    public int compareTo(Houses that) {
        
        if (this.preis > that.preis) {
            return 1;
        } else
            return -1;
    }
    @Override
    public String toString() {
        return "Houses [preis=" + preis + ", wohnflaeche=" + wohnflaeche + "]";
    }
    
    
}

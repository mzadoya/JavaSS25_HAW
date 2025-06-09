package kw21.optional.tutorialClass;

public class LKW extends Fahrzeug {

    String companyName;
    boolean isLoaded;
    String cargo;
    
    
    public LKW(int leistung, String marke, String[] modell, String companyName, boolean isLoaded) {
        
        super(leistung, marke, modell);
        this.isLoaded = isLoaded;
        this.companyName = companyName;
        
    }
}

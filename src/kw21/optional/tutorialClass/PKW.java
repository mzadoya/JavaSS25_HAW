package kw21.optional.tutorialClass;

public class PKW extends Fahrzeug{

    String typeOfBody;
    public PKW (int leistung, String marke, String[] modell, String typeOfBody) {
        
        super(leistung, marke,modell);
        
        this.typeOfBody = typeOfBody;
    }
}

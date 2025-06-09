package kw21.optional.tutorialClass;

public class Fahrzeug {
    
  public int leistung; 
  public String marke;
  public String[] modell;
  private int price;
  int baujahr;
  
  public Fahrzeug (int leistung, String marke, String[] modell) {
      
      this.leistung = leistung; //einfach color ist ein Parameter, den wir uebergeben, 
                         //wobei this.color Attribut des Objekts ist (ihm wird color zugewiesen, bzw. uebergeben
      
  }
  
}

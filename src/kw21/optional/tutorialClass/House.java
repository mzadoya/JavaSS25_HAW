package kw21.optional.tutorialClass;

public class House {
    
  public int square; 
  public String color;
  public String[] material;
  private int price;
  
  public House (int square, String color, String[] material) {
      
      this.color = color; //einfach color ist ein Parameter, den wir uebergeben, 
                         //wobei this.color Attribut des Objekts ist (ihm wird color zugewiesen, bzw. uebergeben
      
  }
  
}

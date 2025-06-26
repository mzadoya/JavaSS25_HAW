package kw25.optional.generics;

public class GenericClassOnlyForNumbers<T extends Number> { // <-- es werden nur Datentypen erlaubt, die Zahlen
                                                            // darstellen
  /*
   * - Also es werden nur die Datentype Akzeptiert, die von einer Klasse erben... sollte beispielsweise <Animals> geschrieben werden,
   * dann werden nur die Parameter akzeptiert, die von Animals erben
   * 
   * Beispiel: 
   * 
   * GenericClassOnlyForAnimals<Dog> dogClass = new GenericClassOnlyForAnimals<>(); - supi geht
   * 
   * aber
   * 
   * enericClassOnlyForAnimals<String> stringClass = new GenericClassOnlyForAnimals<>(); - hää was soll das ganze? 
   * 
   * - Da wir T spezifizieren, dass nur alles was von Numbers erbt vorkommen darf, dürfen wir die Methoden benutzen, die für Numbers spezifisch sind.
   * 
   * - Man darf es kombinieren, also <T extends Animal & Number> oder <T extends Animal & Number & Serializable>...
   */
    
    T x;

    public GenericClassOnlyForNumbers(T x) {
        this.x = x;
    }
    /**
     * Ist nur für Numbers spezifiziert!! Sollte extends Number gelöst werden, so wird hier Fehler angezeigt!!
     * @return x als Double 
     */
    public Double returnDouble() { 
      return x.doubleValue();
    }
    public T getValue() {
        return x;
    }
    
    
}

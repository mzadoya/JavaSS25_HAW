package kw26.required.a6x1.thingyCollector;

import kw26.required.a6x1._untouchable_.thingy.*;

import java.util.*;

/**
 * @author Maksym Zadoya
 * @version 2025/06/29 #1
 */
public class Collector implements Collector_I {

    private final Set<Item> uniqueItems;

    public Collector() {
        uniqueItems = new HashSet<Item>();
    }

    @Override
    /**Verarbeited ein Item und fuegt es zur Sammlung hinzu. Sobald 5 einzigartige Items gesammelt sind, werden diese 
     * zurueckgegeben und der Zustand geleert.
     * 
     * @param item  das zu verarbeitende Item
     * @return Sammlung von 5 einzigartigen Items vorhanden wenn genau 5 vorhanden ist, sonst wenn < 5 -> null
     */
    public Collection<Item> process(Item item) {

        Collection<Item> fuenfElemente = null;  //Default -> ein Return 
        uniqueItems.add(item);  
        if (uniqueItems.size() == 5) {          //Gibts 5 einzigartige Items -> abspeichern und sie aus dem Set loeschen
            fuenfElemente = new ArrayList<Item>(uniqueItems); 
            reset();
        }
        return fuenfElemente;
    }

    @Override
    public void reset() {
        uniqueItems.clear();
    }

    @Override
    public String toString() {
        return this.getClass() + "[uniqueItems=" + uniqueItems + "]";
    }
    
    
}

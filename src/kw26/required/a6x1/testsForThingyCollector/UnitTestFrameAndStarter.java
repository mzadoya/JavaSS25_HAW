package kw26.required.a6x1.testsForThingyCollector;
//
//Der JUnit-Abnahme-Test

//
//Fur die Inbetriebnahme des TestFrames ersetzen Sie:
// am Anfang - etwa Zeile 13
//   /*         durch    //##/*
// dann
//   //##* /    durch    */
// und schließlich (etwa Zeile 122):
//   */         durch    //*##/
//


//##/*

import static org.junit.jupiter.api.Assertions.*;
import static kw26.required.a6x1.thingyCollector.Collector_I.*;
import kw26.required.a6x1.ItemDispenser;
//
import java.util.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import kw26.required.a6x1.thingyCollector.Collector;
import kw26.required.a6x1.thingyCollector.Collector_I;
import kw26.required.a6x1._untouchable_.thingy.*;
import kw26.required.a6x1._untouchable_.thingy.internalProjectSupport.*;

public class UnitTestFrameAndStarter {
    
    @BeforeAll
    public static void runSetupBeforeAnyUnitTestStarts(){
        assert requestedNumberOfDifferentItems == 5 : "Configuration ERROR - 5 was expected as requested number of different items";
        //\=> Collector_I.requestedNumberOfDifferentItems constant has expected value
    }//method()
    
    
    
    
    
    /**
     * Ganz einfache Testcase mit 5 unterschiedlichen Items
    //##* /
    ///
     */
    @Test
    public void testFiveDifferentItemsSimple(){
        
        final Collector_I collector = new Collector();
        
        final Item[] ia = {
            new Item( Color.BLACK, Size.LARGE,  Weight.HEAVY,  1L ),
            new Item( Color.BLUE,  Size.MEDIUM, Weight.MEDIUM, 2L ),
            new Item( Color.BROWN, Size.SMALL,  Weight.LIGHT,  3L ),
            new Item( Color.CYAN,  Size.SMALL,  Weight.HEAVY,  4L ),
            new Item( Color.GOLD,  Size.MEDIUM, Weight.LIGHT,  5L )
        };
        for( int i=0; i<requestedNumberOfDifferentItems-1; i++ ){
            final Collection<Item> actualResult = collector.process( ia[i] );
            assertNull( actualResult );
        }//for
        final Collection<Item> computedResult = collector.process( ia[requestedNumberOfDifferentItems-1] );
        assertTrue( computedResult.size() == requestedNumberOfDifferentItems );
        for( final Item item : ia ) {
            assertTrue( computedResult.remove( item ));
        }//for
        assertTrue( computedResult.isEmpty() );
    }//method()
    
    
    /**
     * Erzeuge alle Kombination von Color x Size x Weight
     * Jedes 5.Mal gibt es 5 unterschiedliche Items
    //##* /
    ///
     */
    @Test
    public void testFiveDifferentItemsWithoutDuplicates(){
        
        final Collector_I collector = new Collector();
        
        // prepare for test loop
        Collection<Item> expectedResult = new ArrayList<Item>();
        long value = 1;
        //
        // test loop
        for( final Color color : Color.values() ){
            for( final Size size : Size.values() ){
                for( final Weight weight : Weight.values() ) {
                    final Item item = new Item( color, size, weight, value );
                    expectedResult.add( item );
                    final Collection<Item> computedResult = collector.process( item );
                    if( value%requestedNumberOfDifferentItems == 0 ){
                        assertTrue(
                            isEqualCollection( expectedResult, computedResult ),
                            String.format( "expected: <%s> but was: <%s>", expectedResult, computedResult )
                        );
                        expectedResult.clear();
                    }else{
                        assertNull( computedResult );
                    }//if
                    value++;
                }//for
            }//for
        }//for
        
    }//method()
    
    @Test
    public void testNullIfUniqueItemsNotEquals5() {

        Collector itemsCollector = new Collector();
        final ItemDispenser getRandomItems = new ItemDispenser();
        final Item item1 = getRandomItems.getSomeItem();
        itemsCollector.process(item1);
        final Item item2 = getRandomItems.getSomeItem();
        itemsCollector.process(item2);

        final Item item5 = getRandomItems.getSomeItem();
        assertNull(itemsCollector.process(item5));
        
    }
    
    @Test
    public void testClear() {
       
        Collector itemsCollector = new Collector();
        final ItemDispenser getRandomItems = new ItemDispenser();
        final Item item1 = getRandomItems.getSomeItem();
        itemsCollector.process(item1);
        
        itemsCollector.reset();
        
        final Item item2 = getRandomItems.getSomeItem();
        assertNull(itemsCollector.process(item2));
    }

    @Test
    public void testAddingSameItemForceStress() {
        Collector itemsCollector = new Collector();
        final ItemDispenser getRandomItems = new ItemDispenser();
        final Item item = getRandomItems.getSomeItem();
        for (int i = 0; i < 1000; i++) {
            assertNull(itemsCollector.process(item));
        }
    }
    
    @Test
    
    public void superGeilerTestFürExtremePenetrationMitFastKomplettUnterschiedlichenItems() {
        Collector itemsCollector = new Collector();
        int pushForceAnzahl = 10;
        final Item[] itemsToTest = {
        new Item(Color.GOLD, Size.TINY, Weight.LIGHT, 12l),  //warum gehts ohne Color. Size. und Weigth. nicht, obwohl wir die importieren?
        new Item(Color.AERO, Size.MEDIUM, Weight.HEAVY, 15l),
        new Item(Color.BLACK, Size.LARGE, Weight.MEDIUM, 156543l),
        new Item(Color.SILVER, Size.GIANT, Weight.HEAVY, 2281337l),
        new Item(Color.BLACK, Size.SMALL, Weight.LIGHT, 777777l),
        };
        
        for (int i = 0; i < itemsToTest.length; i ++) {
            for (int j = 0; j < pushForceAnzahl; j++) {
                if (i<4) {  assertNull(itemsCollector.process(itemsToTest[i])); 
                    
                }
            }
        }
        assertNotNull(itemsCollector.process(itemsToTest[4]));
    }
    
    @Test
    public void collectorHatGenauDie5ItemsDieÜbergebenWorden() {
        Collector itemsCollector = new Collector();
        final ItemDispenser getRandomItems = new ItemDispenser();
        for (int i = 0; i < 100; i ++ ) {
            itemsCollector.process(getRandomItems.getSomeItem());
        }
        
        Item item1 = new Item(Color.ORANGE, Size.LARGE, Weight.HEAVY, 15l);
        Item item2 = new Item(Color.GOLD, Size.TINY, Weight.LIGHT, 12l);
        Item item3 = new Item(Color.OLIVE, Size.GIANT, Weight.MEDIUM, 156543l);
        Item item4 = new Item(Color.AMBER, Size.GIANT, Weight.HEAVY, 2281337l);
        Item item5 = new Item(Color.BLACK, Size.SMALL, Weight.LIGHT, 777777l);
    

    itemsCollector.process(item1);
    itemsCollector.process(item2);
    itemsCollector.process(item3);
    itemsCollector.process(item4);
    
    Collection<Item> testItemsCollector = itemsCollector.process(item5);
    
    assertEquals(5, testItemsCollector.size());
    assertTrue(testItemsCollector.contains(item1));
    assertTrue(testItemsCollector.contains(item2));
    assertTrue(testItemsCollector.contains(item3));
    assertTrue(testItemsCollector.contains(item4));
    assertTrue(testItemsCollector.contains(item5));
    
    testItemsCollector.remove(item4);
    
    assertFalse(testItemsCollector.contains(item4));
    
    }
    
    //TODO: Test fertig machen
    @Test
    public void wasPassiertWennItemNull() {       
        Collector itemsCollector = new Collector();
        
        Item itemOk = new Item (Color.GREEN,Size.SMALL,Weight.LIGHT,12l);
        
        Item itemMitNull = new Item (Color.GOLD,Size.GIANT,Weight.MEDIUM,null);
        
        Item itemMitZweiNull = new Item (Color.WHITE,Size.SMALL,null,null);
        
        Item itemMitDreiNull = new Item (Color.BLACK,null,null,null);
        
        Item itemsKomplettNull = new Item (null,null,null,null);
        
        itemsCollector.process(null);

    }
    //
    public static boolean isEqualCollection( final Collection<?> coll1,  final Collection<?> coll2 ){
        if( coll1.size() != coll2.size() )  return false;
        for( final Object obj : coll1 ) {
            if( ! coll2.remove( obj ))  return false;
        }//for
        return coll2.isEmpty();
    }//method()
    
    
   
    // Vorschläge fuer weitere Tests
    // ==============================
    // o) Funktioniert reset()?
    // o) Funktioniert Implementierung, wenn sich Items nur in einer Eigenschaft unterscheiden?
    // o) Funktioniert Implementierung, wenn Doppelte auftreten? -> Achtung! (Nicht nur) wegen Aufgabenstellung  DOPPELT ::="Gleich aber NICHT dasselbe (Objekt)"
    // o) Ist Collection, die als Ergebnis von process() abgeliefert wird, geeignet?
    // ...
    
}//class
//*##/


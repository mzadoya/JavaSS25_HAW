package kw20.vorlesungen.PT8Mai;

public class Package {
    
    public static void main (String args[]) {
        
    int [] ai = new int [3];
    
    
    
    
    for (int i = 0; i< ai.length; i++) {
        System.out.printf("%d", ai[i]); 
    }
    System.out.printf("%n %n");
    
    
    
    
    for (int e : ai)  System.out.printf("%d", e); 
    System.out.printf("%n %n");
    
    
    
    
    for (int i = 0; i< ai.length; i++) {
        ai[i]++;
        System.out.printf("%d", ai[i]); 
    }
    System.out.printf("%n %n");
    
    
    for (int e : ai) {  e++; System.out.printf("%d", e); } 
    System.out.printf("%n %n");
    
    /* i hat den Wert nicht verändert, da e ist ein Referenztyp, also eine Kopie von i
     * deswegen ändert sich i nicht, sondern nur e 
     */
    
    int posi = 0; 
    for (int e : ai ) {
        e = e + 1;
        ai[posi] = e;
        posi = posi + 1; 
    }
    
    /* 
     * Ändert den Wert von i  /\
     *                        |
     *                        | 
     */
    for (int i = 0; i< ai.length; i++) {
        System.out.printf("%d", ai[i]); 
    }
    System.out.printf("%n %n");

    for (int e : ai)  System.out.printf("%d", e); 
    
    /* 
     * Sowohl i als auch e gibt jetzt 2 aus  /\
     *                                       |
     *                                       | 
     */
    System.out.printf("%n %n");
    int [][]aai = new int [2][2];
    for (int d1 = 0; d1 < aai.length; d1++) {
        for (int d2 = 0; d2<aai.length; d2++) {
            System.out.printf ("%d", aai[d1][d2]);
      }
    }
    
    /* 
     * ausgibt ein leeres Array 2x2          /\
     *                                       |
     *                                       | 
     */
    
     System.out.printf("%n %n");
     aai[1] = new int [1]; // neues Array mit Grosse 1 
     aai[1][0] = 42;
     for (int d1 = 0; d1 < aai.length; d1++) {
         for (int d2 = 0; d2<aai[d1].length; d2++) {  // <--- aai[d1] fixt 
             System.out.printf ("%d", aai[d1][d2]);
       }
     }
    /*  
     for (int d1 = 0; d1 < aai.length; d1++) {
         for (int d2 = 0; d2<aai.length; d2++) {   <----- FEHLER 
             System.out.printf ("%d", aai[d1][d2]);
       }
     }
     
     Da dieses Array aussieht wie 
     
     0 -1 
     4  nix 
     
     ergibt der Code ein Fehler, da dieses Element "nix" nicht zugreifbar ist 
     */ 
  }
}

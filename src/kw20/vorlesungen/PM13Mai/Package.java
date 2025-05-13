package kw20.vorlesungen.PM13Mai;

public class Package {
    
    int[] arrayVonElementen = {12,43,56,17,14};
    
    public void doTest() {
    avg(arrayVonElementen);
    }
    
    public int avg (int[] inputArrayVonElementen) {
        int Ergebnis = 0;
        for (int i = 0; i < inputArrayVonElementen.length; i++) {
            Ergebnis += inputArrayVonElementen[i];
        }
        return Ergebnis;
    }
    
}

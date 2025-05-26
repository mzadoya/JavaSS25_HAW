package kw21.vorlesungen.PT22Mai;

public class Fraction {
 long n; 
 long d;
 
   public Fraction (final long n, final long d) {
       this.n = n; 
       this.d = d;
   }//constructor 1
   
   public Fraction() {
       this (0,1);
   }//constructor 2
   
   public void add (Fraction f) {
       n = n*f.d + f.n*d;
   }
   
   Fraction op1,op2,resu;
   
   op1 = new Fraction(1,2);
   op2 = new Fraction(1,3);
   System.out.printf ("op1 = %s%n", op1);
   System.out.printf ("op2 = %s%n", op2);
   op1.add(op2);
   System.out.printf ("op1 = %s%n", op1);
   System.out.printf ("op1 = %s%n", op1);
}


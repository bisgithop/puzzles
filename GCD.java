/**
*  Expand to find GCD for n number of items  
*  Uses recursion to find GCD of two numbers
*/
public class Main {
  
  public static void main(String[] args) {      
    //System.out.println(gcdByEuclidsAlgorithm( 13, 26));
    //System.out.println(gcdByEuclidsAlgorithm( 26, 13));
    //System.out.println(gcdByEuclidsAlgorithm( 7, 3));
    //System.out.println(gcdByEuclidsAlgorithm( 98, 56));  
    System.out.println(gcdByEuclidsAlgorithm( 0, 56));          
  }
    
    /**
    *	Elegent method that uses modulo 
    *   And switching elements        
    */    
	public static int gcdByEuclidsAlgorithm(int n1, int n2) {         
      if (n2 == 0) {
          return n1;
      }
      return gcdByEuclidsAlgorithm(n2, n1 % n2);
}
  
  
}

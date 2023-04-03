import java.util.*;
public class Factorialnumber
{
	 static int Factori(int n)
	 {    
	  if (n == 0)    
	    return 1;    
	  else    
	    return (n * Factori(n-1));    
	 }    
	 public static void main(String args[])
	 {
	  int n,fact=1;  
	  System.out.println("Enter n");
	  
	  System.out.println("Factorial of the given number is: "+fact);    
	 }  
	}  
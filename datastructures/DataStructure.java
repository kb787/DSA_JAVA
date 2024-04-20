package datastructures;

class Stack {
	public int index = 0 ;
	public int topMax  ; 
	public final int [] array ;
	public Stack(int size) {
		this.array = new int [size] ;
	}
	public boolean isEmpty() {
		 int k = array.length ;
		 if(k == 0) {
			  return true ;
		 }
		 else {
			 return false ;
		 }
	}
	public void push(int x) {
		  topMax = array.length-1 ;
		  if(topMax<0) {
			    System.out.println("Empty array") ;
		   }
		  if(index == topMax) {
			  System.out.println("Stack overflow occured cannot insert more elements") ;
		  }
		  else {
			   array[index++] = x ;
			   System.out.println("Successfully entered the element into stack") ; 
		  }
		  
	}
	public void pop() {
		   topMax = array.length-1 ;
		   
		   if(topMax<0) {
			    System.out.println("Empty array") ;
		   }
		   if(index == 0) {
			    System.out.println("Stack underflow occured") ;
		   }
		   else {
			   
			    int x = array[--index] ;
			    System.out.print("Successfully popped the element from the stack " + x);
		   }
	}
	public int peek() {
		   int topMax = array.length-1 ;
		   
		   if(topMax<0) {
			    System.out.println("Empty array") ;
			    return -1 ;
		   }
		   else {
			    int x = array[index-1] ;
			    return x ;
		   }
	}
	public int search(int key) {
		    int topMax = array.length-1 ;
			if(topMax<0) {
				System.out.println("Empty array") ;
				return -1 ;
			}
			int k = 0 ; 
			for(int i = 0 ; i<=index ; i++) {
			  if(array[i] == key) {
				   k = i ; 
				   return index-k ;
			  }
			}
			return -1 ;

		    
	}
}	
	
	

public class DataStructure {
         public static void main(String [] args) {
        	    Stack stacky = new Stack(6) ;
        	    stacky.push(2);
        	    stacky.push(3);
        	    stacky.push(4);
        	    stacky.push(5);
        	    stacky.push(6);
        	    stacky.pop() ;
        	    int k1 = stacky.search(3) ;
        	    if(k1 == -1) {
        	    	System.out.println("Element not found in stack") ;
        	    }
        	    else {
        	    	 System.out.println("The distance where element found is " + k1) ;
        	    }
        	    int k2 = stacky.peek() ;
        	    if(k2 == -1) {
        	    	 System.out.println("Stack is empty") ; 
        	    }
        	    else {
        	    	 System.out.println("Peak element found is " + k2) ;
        	    }
        	    
         }
} 

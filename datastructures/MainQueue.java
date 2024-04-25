package datastructures;

class Queue {
	   public final int [] array ;
	   int front = 0 , rear = 0 ;
	   
	   public Queue(int size) {
		    this.array = new int [size] ;
	   }
	   public void add(int key) {
		    int maxIndex = array.length-1 ;
		    if(rear == maxIndex) {
		    	System.out.println("Queue is overflow cannot insert more elements") ;
		    }
		    else {
		    	array[rear++] = key ;
		    	System.out.println("Successfully inserted the element") ;
		    }
		    
	   }
	   public void remove() {
		      if(front == rear) {
		    	  System.out.println("Queue is empty") ;
		      }
		      int k =  array[front++] ;
		      System.out.println("Removed element is "+ k) ;
		      
	   }
	   public void peek() {
		   if(front == rear) {
			   System.out.println("Empty Queue") ;
		   }
		   else {
			   int k = array[front] ;
			   System.out.println("Peek element is "+ k) ;
		   }
	   }
}

public class MainQueue {
	   public static void main(String [] args) {
		    Queue sampleQueue = new Queue(10) ;
		    sampleQueue.add(12);
		    sampleQueue.add(13);
		    sampleQueue.add(14);
		    sampleQueue.add(15);
		    sampleQueue.add(16);
		    sampleQueue.remove();
		    sampleQueue.remove();
		    sampleQueue.peek() ;
	   }

}

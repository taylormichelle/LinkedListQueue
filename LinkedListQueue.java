
public class LinkedListQueue {
	
	private LinkedList theList;
	
	public LinkedListQueue() {
		theList = new LinkedList();
	}
	
	public boolean isEmpty() {
		return theList.isEmpty();
	}
	
	public void insert(String s) { 
		theList.insertFirst(s);
	}
	
	public String remove() {
		return theList.deleteFirst();
	}
	
	public void displayQueue() {
		System.out.println("Queue (front --> rear): ");
		theList.displayList();
	}

}

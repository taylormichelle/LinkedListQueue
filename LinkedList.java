
public class LinkedList {
	
	private Link first; // References first link on the list
	
	public LinkedList() { // Constructor for null linked list
		first = null;
	}
	
	public boolean isEmpty() { // True if list is empty
		return(first == null);
	}
	
	public void insertFirst(String d) { // Insert at start of list
		Link newLink = new Link(d); // Make new link
		newLink.next = first;
		first = newLink; 
	}
	
	public String deleteFirst() { // Delete first item
		Link temp = first; // Save reference to first link
		first = first.next;
		return temp.data; // Return deleted link
	}
	
	public void displayList() {
		Link current = first; // Start at the beginning of a list
		while(current != null) {
			current.displayLink(); // Print data
			current = current.next; // Move to next link
		}	
		System.out.println("");
	}
	
}

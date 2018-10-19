
public class Link {

	public String data; // Data item
	public Link next; // Next link
	
	public Link(String d) {
		data = d;
	}
	
	public void displayLink() {
		System.out.print(data + " "); // Display link
	}
	
}

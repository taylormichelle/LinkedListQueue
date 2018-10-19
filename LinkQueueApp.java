//Michelle Taylor
public class LinkQueueApp {

	public static void main(String[] args) {
		String remove = "-- Removing top element --";
		String insert = "-- Inserting element --";
		LinkedListQueue one = new LinkedListQueue();
		
		System.out.println(insert);
		one.insert("Red");
		System.out.println(insert);
		one.insert("Orange");
		System.out.println(insert);
		one.insert("Yellow");
		one.displayQueue();
		
		System.out.println(remove);
		one.remove();
		one.displayQueue();
		
		System.out.println(insert);
		one.insert("Green");
		System.out.println(insert);
		one.insert("Blue");
		one.displayQueue();
	}
	
}

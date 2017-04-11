package main.objectModels;

public class Links {
	private String self;
	private String next;
	private String last;
	
	public Links( String self, String next, String last) {
		this.self = self;
		this.next = next;
		this.last = last;
	}
	
	public String getLink() { return self; }
	public String getNext() { return next; }
	public String getLast() { return last; }
}

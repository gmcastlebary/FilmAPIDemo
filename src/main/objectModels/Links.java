package main.objectModels;
/*
* Created by Gabe Castlebary
* This object is intended to contain self, next & last links for films and other objects being constructed and sent out
* as JSON objects.  For some reason in my Postman testing, this object isn't being displayed correctly.  No "self" title
* link appears and instead a "link" titled 'link' appears at the END of the links.
*/
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

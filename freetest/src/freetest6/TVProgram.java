package freetest6;

public class TVProgram {

	String title;
	String broadcast;
	
	public TVProgram() {
		
	}
	
	public TVProgram(String title, String broadcast) {
		super();
		this.title = title;
		this.broadcast = broadcast;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBroadcast() {
		return broadcast;
	}

	public void setBroadcast(String broadcast) {
		this.broadcast = broadcast;
	}

	@Override
	public String toString() {
		return " . " + title + " " + broadcast + "\t";
	}
	
	
}

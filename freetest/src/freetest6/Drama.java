package freetest6;



public class Drama extends TVProgram{

	String director;
	String actor;
	String actress;
	
	public Drama() {
		
	}
	public Drama(String title, String broadcast, String director) {
		super(title, broadcast);
		this.director = director;
	}
	
	
	public Drama(String title, String broadcast,String director,String actor,String actress) {
		super(title, broadcast);
		this.director = director;
		this.actor = actor;
		this.actress = actress;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getActress() {
		return actress;
	}

	public void setActress(String actress) {
		this.actress = actress;
	}

	@Override
	public String toString() {
		String str = super.toString()+"\n\t - 감독 :"+director;
		if(actor != null)
			str += "\n\t - 남자배우 : "+actor;
		if(actress != null)
			str += "\n\t - 여자배우 : "+actress;
		return str;
		
//		return super.toString() +"\n\t - 감독 : "+ director + "\n\t - 남자배우 : " + actor + "\n\t - 여자배우 : "
//	+ actress;
	}
	
	

}

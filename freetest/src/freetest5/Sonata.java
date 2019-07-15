package freetest5;

public class Sonata extends Car{
		
	String series;
	String use;
	
	public Sonata(String color,int account,String series,String use ) {
		super.color = color;
		super.account = account;
		this.series = series;
		this.use = use;
		
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	@Override
	public String toString() {
		return super.toString()+"[용도]"+" "+use+"\t"+"[시리즈]"+" "+series+"\t";
	}
	
	
	

}

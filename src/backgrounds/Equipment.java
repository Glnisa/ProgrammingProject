package backgrounds;

public class Equipment {
	protected String name;
	protected String price;
	protected String percentage;
	
	
	
	
	public Equipment(String name, String price, String percentage) {
		super();
		this.name = name;
		this.price = price;
		this.percentage = percentage;
	}
	
	
	public Equipment(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	
	

}

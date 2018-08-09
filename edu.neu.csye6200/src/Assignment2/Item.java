package Assignment2;

public class Item extends AbstractItemAPI{

	
	
	@Override
	public String info() {
		// TODO Auto-generated method stub
		return null;
	}



	public Item(int iD, String name, String description, int price) {
		super();
		ID = iD;
		Name = name;
		Description = description;
		Price = price;
	}








	private int ID;
	private String Name;
	private String Description;
	private int Price;
	
	
	

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}

	
	
	
	
}

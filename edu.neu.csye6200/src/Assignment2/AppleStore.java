package Assignment2;



public class AppleStore extends Store{

	public AppleStore(int iD, String name, String description, String itemURL, String employeeURL) {
		super(iD, name, description, itemURL, employeeURL);
		// TODO Auto-generated constructor stub
	}
	
	
	
	//-----------------------------Set Default list-----------------------------------------------
	public void Demo() {
		
		
		Store store = new Store(getID(), getName(), getDescription(), getItemURL(), getEmployeeURL());
		store.getInventoryInfo();
		//System.out.println(store.ItemList.size());
		store.addEmployee();
		//System.out.println(store.EmployeeList.size());
		store.show();
	//	store.getInventoryInfo();
		store.showInventory();
		store.clearInventory();
		store.addItemToInventory(10, "Ipad", "ipad", 800);
		store.showInventory();
		
		
		
	}


	
	
	
	//?
	
	





	

	
	
	
	

}

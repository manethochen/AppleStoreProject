package Assignment2;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public  class Store extends AbstractStoreAPI{
	
	
	public Store(int iD, String name, String description, String itemURL, String employeeURL) {
		super();
		ID = iD;
		Name = name;
		Description = description;
		ItemURL = itemURL;
		EmployeeURL = employeeURL;
	}


	public Store() {
		super();
	}


	private int ID;
	private String Name;
	private String Description;
	private String ItemURL;
	private String EmployeeURL;
	
	
    public  ArrayList<Item> ItemList = new ArrayList<Item>();
    public  ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
	


	//-------------------------Add Item From Csv File-----------------------------
	
	
	






	public String addItemToInventory(int iD,String name,String description,int price){
		
		System.out.println("---------------------AddItemToInventory Method--------------------");
		
		Item item = new Item(iD, name, description, price);
		
		ItemList.add(item);
		
	    System.out.println("Item : "+item.getName()+"   Add successfully");
		return null;
	
		}
	
	
	//-------------------------Add Employee From Csv File-----------------------------
	
	
	
     public ArrayList<Item> addEmployee(){
		
		try(
		FileReader fReader = new FileReader(getEmployeeURL());
		BufferedReader inLine = new BufferedReader(fReader);
				){
		String inputLine = null;
		while((inputLine = inLine.readLine())!= null) {
		
			String[] fields = inputLine.split(",");
			int ID = Integer.valueOf(fields[0]);
			String Name = fields[1];
			String Description = fields[2];

			Employee employee = new Employee(ID, Name, Description);
			EmployeeList.add(employee);

			
		}
		
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return ItemList;
			
		}
	
	
		
	
	
	
    
    
   //----------------------------------GETTER AND SETTER------------------------------------



	
	public String getName() {
		return Name;
	}
	
	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getItemURL() {
		return ItemURL;
	}


	public void setItemURL(String itemURL) {
		ItemURL = itemURL;
	}






	public String getEmployeeURL() {
		return EmployeeURL;
	}






	public void setEmployeeURL(String employeeURL) {
		EmployeeURL = employeeURL;
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

	






//--------------------------Abstract Medthod-------------------------------------

	






	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		
		System.out.println("---------------------show() Method-------------------------");
		
		System.out.println("Store ID :"+getID()+" Store Name:"+getName()+" Product Instock: "+ItemList.size());
		
		
		for (Employee employee:EmployeeList) {
			System.out.println("EmployeeID: " +employee.getID() + " Name: "+employee.getName()+" Descriptions:" + employee.getDescription() );
		}
		
		
		int iphonecount = 0 ;
		int maccount = 0 ;
		int ipadcount = 0 ;
		
		for (Item item :ItemList) {
			//System.out.println(" ProductID: "+item.getID()+" Name: "+item.getName()+" Description: "+item.getDescription()+" Price: $"+item.getPrice());
			
			if (item.getName().equals("IPhone")) {
				iphonecount++;

			}else if(item.getName().equals("Ipad")){
				
				ipadcount++;
			}else {
				maccount++;
			}
		
		}
		
	
		System.out.println(iphonecount+" IPhone intock " + ipadcount + " Ipad instock " +maccount +" Mac instock");
		

	}


	@Override
	public String getInventoryInfo() {
		// TODO Auto-generated method stub
		

		try(
				FileReader fReader = new FileReader(getItemURL());
				BufferedReader inLine = new BufferedReader(fReader);
						){
				String inputLine = null;
				while((inputLine = inLine.readLine())!= null) {
				
					String[] fields = inputLine.split(",");
					int ID = Integer.valueOf(fields[0]);
					String Name = fields[1];
					String Description = fields[2];
					int Price = Integer.valueOf(fields[3]);
					
					
				    Item item = new Item(ID, Name, Description, Price);
				    
				    ItemList.add(item);

					
				}
				
				}catch (IOException e) {
					e.printStackTrace();
				}
				
				//System.out.println(ItemList.size());
				
				return null;
		
		
	}


	@Override
	public void clearInventory() {
		// TODO Auto-generated method stub
	 
		ItemList.clear();
		
	System.out.println("-------------clear inventory-----------------------------");
		
	}


	@Override
	public void showInventory() {
		// TODO Auto-generated method stub
		System.out.println("---------------------showInventory() method------------------");
		for (Item item :ItemList) {
			System.out.println(" ProductID: "+item.getID()+" Name: "+item.getName()+" Description: "+item.getDescription()+" Price: $"+item.getPrice());
		}
		
		
	
		
	}
	






}

package Assignment2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AppleStore appleStore = new AppleStore(1, "applestore", "JiayuanChen's applestore", "attachment\\Item.csv", "attachment\\Employee.csv");
        appleStore.Demo();
        
        

	}

}


/* RESULT
---------------------show() Method-------------------------
Store ID :1 Store Name:applestore Product Instock: 9
EmployeeID: 1 Name: Lily Descriptions:female
EmployeeID: 2 Name: Mia Descriptions:female
EmployeeID: 3 Name: Tom Descriptions:male
EmployeeID: 4 Name: Tony Descriptions:male
EmployeeID: 5 Name: Jony Descriptions:male
5 IPhone intock 2 Ipad instock 2 Mac instock
---------------------showInventory() method------------------
 ProductID: 1 Name: IPhone Description: IPhone1 Price: $800
 ProductID: 2 Name: IPhone Description: IPhone2 Price: $800
 ProductID: 3 Name: IPhone Description: IPhone3 Price: $800
 ProductID: 4 Name: IPhone Description: IPhone4 Price: $800
 ProductID: 5 Name: IPhone Description: IPhone5 Price: $800
 ProductID: 6 Name: Ipad Description: Ipad1 Price: $1500
 ProductID: 7 Name: Ipad Description: Ipad2 Price: $1500
 ProductID: 8 Name: Mac Description: Mac1 Price: $2500
 ProductID: 9 Name: Mac Description: Mac2 Price: $2500
-------------clear inventory-----------------------------
---------------------AddItemToInventory Method--------------------
Item : Ipad   Add successfully
---------------------showInventory() method------------------
 ProductID: 10 Name: Ipad Description: ipad Price: $800
 */

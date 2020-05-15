package model;



public class Advisor extends Person {
	//Atributes
	private double sales_quantity;
       
        
        
	//Methods
	public Advisor(String name, String last_name, String identification, double sales_quantity) {
            
            super(name,last_name,identification);
            this.sales_quantity=sales_quantity;
            
            
	}
	public double getSales_quantity(){
		return sales_quantity;
	}
	public void setSales_quantity(int sales_quantity) {
		this.sales_quantity=sales_quantity;
	}

}
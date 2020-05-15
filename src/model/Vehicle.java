package model;
import java.util.ArrayList;

public abstract class Vehicle{
	//Atributes
        public final static char TYPE_VEHICLE_NEW='N';
        public final static char TYPE_VEHICLE_USER='U';
        
	private double total_price;
	private double base_price;
	private String car_brand;
	private double model;
	private double mileage;
	private double cylinder_capacity;
	private String type;
	private String lisence_plate;
        private boolean new_car;
	//Methods
    /**
     * 
     * @param total_price
     * @param base_price
     * @param car_brand
     * @param model
     * @param mileage
     * @param cylinder_capacity
     * @param type
     * @param lisence_plate
     * @param new_car 
     */
    public Vehicle(double total_price, double base_price, String car_brand, double model, double mileage, double cylinder_capacity, String type, String lisence_plate, boolean new_car) {
        this.total_price = total_price;
        this.base_price = base_price;
        this.car_brand = car_brand;
        this.model = model;
        this.mileage = mileage;
        this.cylinder_capacity = cylinder_capacity;
        this.type = type;
        this.lisence_plate = lisence_plate;
        this.new_car = new_car;
        Documents[] arrayFiguras=new Documents[2];
    }
	
        /**
         * 
         * @param new_car
         * @param base_price
         * @param car_type
         * @param type
         * @return 
         */
        public double val_total(boolean new_car,double base_price, String car_type,String type){
            total_price = 0;
            total_price+=500000;
            if("Car".equals(type)){
                if ("Electrical".equals(car_type)){
                    total_price+=(base_price*0.2);
                }
                if("Hybrids".equals(car_type)){
                    total_price+=(base_price*0.15);
                }
                if(new_car==false){
                    total_price*=(0.90);
                }
            }
            if ("motocycle".equals(type)){
                total_price+=(0.04);
                if(new_car==false){
                    total_price*=(0.98);
                }
            }
            
            
            return total_price;
        }
        
        /**
         * 
         * @return 
         */
	public double getTotal_price(){
		return total_price;
	}
        /**
         * 
         * @param total_price 
         */
	public void setTotal_price(double total_price) {
		this.total_price=total_price;
	}
        /**
         * 
         * @return 
         */
	public double getBase_price(){
		return base_price;
	}
        /**
         * 
         * @param base_price 
         */
	public void setBase_price(double base_price) {
		this.base_price=base_price;
	}
        /**
         * 
         * @return 
         */
	public String getCar_brand(){
		return car_brand;
	}/**
         * 
         * @param car_brand 
         */
	public void setCar_brand(String car_brand){
		this.car_brand=car_brand;
	}
        /**
         * 
         * @return 
         */
	public double getModel() {
		return model;
	}/**
         * 
         * @param model 
         */
	public void setModel(double model){
		this.model=model;
	}
        /**
         * 
         * @return 
         */
	public double getMileage() {
		return mileage;
	}
        /**
         * 
         * @param mileage 
         */
	public void setMileage(double mileage){
		this.mileage=mileage;
	}
        /**
         * 
         * @return 
         */
	public double getCylinder_capacity(){
		return cylinder_capacity;
	}
        /**
         * 
         * @param cylinder_capacity 
         */
	public void setCylinder_capacity(double cylinder_capacity) {
		this.cylinder_capacity=cylinder_capacity;
	}
        /**
         * 
         * @return 
         */
	public String getType() {
		return type;
	}
        /**
         * 
         * @param type 
         */
	public void setType(String type) {
		this.type=type;
	}
        /**
         * 
         * @return 
         */
	public String getLisence_plate() {
		return lisence_plate;
	}
        /**
         * 
         * @param lisence_plate 
         */
	public void setLisence_plate(String lisence_plate) {
		this.lisence_plate=lisence_plate;
	}
        
        

}
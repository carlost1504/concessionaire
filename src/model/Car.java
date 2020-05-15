package model;
public abstract class Car extends Vehicle  {
	//Atributes
	private String car_type;
	private int door_number;
	private boolean polarized;
	//Methods
    /**
     * 
     * @param car_type
     * @param door_number
     * @param polarized
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
    public Car(String car_type, int door_number, boolean polarized, double total_price, double base_price, String car_brand, double model, double mileage, double cylinder_capacity, String type, String lisence_plate, boolean new_car) {
        super(total_price, base_price, car_brand, model, mileage, cylinder_capacity, type, lisence_plate, new_car);
        this.car_type = car_type;
        this.door_number = door_number;
        this.polarized = polarized;
    }
	/**
         * 
         * @return 
         */
	public String getCar_Type(){
		return car_type;
	}
        /**
         * 
         * @param car_type 
         */
	public void setCar_Type(String car_type){
		this.car_type=car_type;
	}
        /**
         * 
         * @return 
         */
	public int getDoor_number(){
		return door_number;
	}
        /**
         * 
         * @param door_number 
         */
	public void setDoor_number(int door_number){
		this.door_number=door_number;
	}
        /**
         * 
         * @return 
         */
	public boolean getPolarized(){
		return polarized;
	}
        /**
         * 
         * @param polarized 
         */
	public void setPolarized(boolean polarized) {
		this.polarized=polarized;
	}

    /**
     * 
     * @return 
     */
        @Override
    public String toString() {
        return "Car{" + "car_type=" + car_type + ", door_number=" + door_number + ", polarized=" + polarized + '}';
    }
        

}
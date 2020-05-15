package model;
public class Motocycle extends Vehicle {
	//Atributes
	private String moto_type;
	private double gasoline_capacity;
	private double gasoline_consumable;
        public static boolean neww;
	//Methodsne

    /**
     * 
     * @param moto_type
     * @param gasoline_capacity
     * @param gasoline_consumable
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
    public Motocycle(String moto_type, double gasoline_capacity, double gasoline_consumable, double total_price, double base_price, String car_brand, double model, double mileage, double cylinder_capacity, String type, String lisence_plate, boolean new_car) {
        super(total_price, base_price, car_brand, model, mileage, cylinder_capacity, type, lisence_plate, new_car);
        this.moto_type = moto_type;
        this.gasoline_capacity = gasoline_capacity;
        this.gasoline_consumable = gasoline_consumable;
    }

    

    /**
     * 
     * @return 
     */
    public String getMoto_type() {
        return moto_type;
    }
    /**
     * 
     * @param moto_type 
     */
    public void setMoto_type(String moto_type) {
        this.moto_type = moto_type;
    }
    /**
     * 
     * @return 
     */
    public double getGasoline_capacity() {
        return gasoline_capacity;
    }
    /**
     * 
     * @param gasoline_capacity 
     */
    public void setGasoline_capacity(double gasoline_capacity) {
        this.gasoline_capacity = gasoline_capacity;
    }

    
    /**
     * 
     * @param cap_gasoline
     * @param type_gasoline
     * @param cylinder_capacity
     * @param gasoline_consumable
     * @return 
     */
    public double gasoline_consumable(double cap_gasoline,char type_gasoline, double cylinder_capacity, double gasoline_consumable ){
        
        gasoline_consumable=cap_gasoline*(cylinder_capacity/90);
        return gasoline_consumable;
    }

    /**
     * 
     * @return 
     */
        @Override
    public String toString() {
        return "Motocycle{" + "moto_type=" + moto_type + ", gasoline_capacity=" + gasoline_capacity + ", gasoline_consumable=" + gasoline_consumable + '}';
    }
    

    
    
    
	
}
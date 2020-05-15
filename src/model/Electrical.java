package model;
public class Electrical extends Car implements BatteryConsumable {
	//Atributes
	private char charger_type;
	private double duration;
        private double consumable_energy;
        private final char carga_R='R';
        private final char carga_N='N';
	//Methods
    /**
     * 
     * @param charger_type
     * @param duration
     * @param consumable_energy
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
    public Electrical(char charger_type, double duration, double consumable_energy, String car_type, int door_number, boolean polarized, double total_price, double base_price, String car_brand, double model, double mileage, double cylinder_capacity, String type, String lisence_plate, boolean new_car) {
        super(car_type, door_number, polarized, total_price, base_price, car_brand, model, mileage, cylinder_capacity, type, lisence_plate, new_car);
        this.charger_type = charger_type;
        this.duration = duration;
        this.consumable_energy = consumable_energy;
        
    }
    /**
     * 
     * @return 
     */
    public char getCharger_type() {
        return charger_type;
    }
    /**
     * 
     * @param charger_type 
     */
    public void setCharger_type(char charger_type) {
        this.charger_type = charger_type;
    }
    /**
     * 
     * @return 
     */
    public double getDuration() {
        return duration;
    }
    /**
     * 
     * @param duration 
     */
    public void setDuration(double duration) {
        this.duration = duration;
    }
    /**
     * 
     * @param duration
     * @param charger_type
     * @param cylinder_capacity
     * @return 
     */
    public double consumable_energy(double duration,String charger_type, double cylinder_capacity ){
        
        if ("Quick".equals(charger_type)){
            consumable_energy=(duration+10)*(cylinder_capacity/100);
        }else if ("normal".equals(charger_type)){
            consumable_energy=(duration+10)*(cylinder_capacity/100);
        }
        return consumable_energy;
    }

    
    
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Electrical{" + "charger_type=" + charger_type + ", duration=" + duration + '}';
    }
    
    
    
	

}
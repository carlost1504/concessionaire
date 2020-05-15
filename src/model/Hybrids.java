package model;
public class Hybrids extends Car implements GasolineConsumable, BatteryConsumable {

    private final static char TYPE_GASOLINE_EXTRA='E';
    private final static char TYPE_GASOLINE_CORRIENTE='C';
    private final static char TYPE_GASOLINE_DIESEL='D';
    private double cap_gasol;
    private String type_gaso;
    private double gaso_consume;
    private String charger_type;
    private double duration;
    private double consumable_energy;

        
    /**
    * 
    * @param car_type
    * @param door_number
    * @param polarized
    * @param cap_gasol
    * @param type_gaso
     * @param consumable_energy
    * @param total_price
    * @param base_price
    * @param car_brand
    * @param model
    * @param mileage
    * @param cylinder_capacity
    * @param type
    * @param lisence_plate
    * @param gaso_consume
    * @param charger_type
    * @param duration
     * @param new_car
    */
    
    public Hybrids(double cap_gasol, String type_gaso, double gaso_consume, String charger_type, double duration, double consumable_energy, String car_type, int door_number, boolean polarized, double total_price, double base_price, String car_brand, double model, double mileage, double cylinder_capacity, String type, String lisence_plate, boolean new_car) {
        super(car_type, door_number, polarized, total_price, base_price, car_brand, model, mileage, cylinder_capacity, type, lisence_plate, new_car);
        this.cap_gasol = cap_gasol;
        this.type_gaso = type_gaso;
        this.gaso_consume = gaso_consume;
        this.charger_type = charger_type;
        this.duration = duration;
        this.consumable_energy = consumable_energy;
    }
    /**
     * 
     * @return 
     */
    public double getCap_gasol() {
        return cap_gasol;
    }
    /**
     * 
     * @param cap_gasol 
     */
    public void setCap_gasol(double cap_gasol) {
        this.cap_gasol = cap_gasol;
    }
    /**
     * 
     * @return 
     */
    public String getType_gaso() {
        return type_gaso;
    }
    /**
     * 
     * @param type_gaso 
     */
    public void setType_gaso(String type_gaso) {
        this.type_gaso = type_gaso;
    }
    /**
     * 
     * @return 
     */
    public double getGaso_consume() {
        return gaso_consume;
    }
    /**
     * 
     * @param gaso_consume 
     */
    public void setGaso_consume(double gaso_consume) {
        this.gaso_consume = gaso_consume;
    }
    /**
     * 
     * @return 
     */
    public String getCharger_type() {
        return charger_type;
    }
    /**
     * 
     * @param charger_type 
     */
    public void setCharger_type(String charger_type) {
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
     * @return 
     */
    public double getConsumable_energy() {
        return consumable_energy;
    }
    /**
     * 
     * @param consumable_energy 
     */
    public void setConsumable_energy(double consumable_energy) {
        this.consumable_energy = consumable_energy;
    }
    
    
    /**
     * 
     * @param cap_gasoline
     * @param type_gasoline
     * @param cylinder_capacity
     * @return 
     */
    public double gasoline_consumable(double cap_gasoline,char type_gasoline, double cylinder_capacity ){
        double gasoline_consumable;
        gasoline_consumable=cap_gasoline*(cylinder_capacity/110);
        return gasoline_consumable;
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
        return  "Hybrids{" + "cap_gasol=" + cap_gasol + ", type_gaso=" + type_gaso + ", gaso_consume=" + gaso_consume + ", charger_type=" + charger_type + ", duration=" + duration + "} \n"+super.toString();
    }
    

	
	

}
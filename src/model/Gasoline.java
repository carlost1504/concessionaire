package model;
public class Gasoline extends Car implements GasolineConsumable {
	//Atributes
        public final static char TYPE_GASOLINE_EXTRA='E';
        public final static char TYPE_GASOLINE_CORRIENTE='C';
        public final static char TYPE_GASOLINE_DIESEL='D';
	private double cap_gasoline;
	private char type_gasoline;
        private double consume_gasolien;
	//Methods
    /**
     * 
     * @param cap_gasoline
     * @param type_gasoline
     * @param consume_gasolien
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
    public Gasoline(double cap_gasoline, char type_gasoline, double consume_gasolien, String car_type, int door_number, boolean polarized, double total_price, double base_price, String car_brand, double model, double mileage, double cylinder_capacity, String type, String lisence_plate, boolean new_car) {
        super(car_type, door_number, polarized, total_price, base_price, car_brand, model, mileage, cylinder_capacity, type, lisence_plate, new_car);
        this.cap_gasoline = cap_gasoline;
        this.type_gasoline = type_gasoline;
        this.consume_gasolien = consume_gasolien;
    }
    /**
     * 
     * @return 
     */
    public double getCap_gasoline() {
        return cap_gasoline;
    }
    /**
     * 
     * @param cap_gasoline 
     */
    public void setCap_gasoline(double cap_gasoline) {
        this.cap_gasoline = cap_gasoline;
    }
    /**
     * 
     * @return 
     */
    public char getType_gasoline() {
        return type_gasoline;
    }
    /**
     * 
     * @param type_gasoline 
     */
    public void setType_gasoline(char type_gasoline) {
        this.type_gasoline = type_gasoline;
    }
    /**
     * 
     * @return 
     */
    public double getConsume_gasolien() {
        return consume_gasolien;
    }
    /**
     * 
     * @param consume_gasolien 
     */
    public void setConsume_gasolien(double consume_gasolien) {
        this.consume_gasolien = consume_gasolien;
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
        gasoline_consumable=cap_gasoline*(cylinder_capacity/100);
        return gasoline_consumable;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Gasoline{" + "cap_gasoline=" + cap_gasoline + ", type_gasoline=" + type_gasoline + ", consume_gasolien=" + consume_gasolien + "} \n"+super.toString();
    }

    

    
	
    

}
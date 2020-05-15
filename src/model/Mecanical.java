package model;
import  java.time.LocalDate;
public class Mecanical extends Documents {

        public int YEAR=LocalDate.now().getYear();
	private double gas_level;
        private String serial_mecanical;
        private boolean validity;
    /**
     * 
     * @param gas_level
     * @param serial_mecanical
     * @param price
     * @param year
     * @param image_code
     * @param matrizImg 
     */
    public Mecanical(double gas_level, String serial_mecanical, double price, String year, int image_code, int[][] matrizImg) {
        super(price, year, image_code, matrizImg);
        this.gas_level = gas_level;
        this.serial_mecanical = serial_mecanical;
    }
    /**
     * 
     * @param matrizImg
     * @param serial_mecanical
     * @return 
     */
    public String num_mecanical( int[][] matrizImg,String serial_mecanical){
        this.matrizImg=matrizImg;
        this.serial_mecanical=serial_mecanical;
        String num_Macanical="";
        String num2_Macanical="";
        String num3_Macanical="";
        
        for (int y=0;y<6;y++){
            num_Macanical="-"+matrizImg[0][y]+"-";
            num3_Macanical="-"+matrizImg[6][y]+"-";
        }
        for (int x=0;x<5;x++){
            for(int y=5;y<0;y--){
                num2_Macanical="-"+matrizImg[x][y]+"-";
            }
        }
        serial_mecanical=num_Macanical+num2_Macanical+num3_Macanical;
        
        return serial_mecanical;
    } 
    /**
     * 
     * @param year
     * @param validity
     * @return 
     */
    public boolean mecanical_espeired(String year,boolean validity){
        String numCadena;
        numCadena = Integer.toString(YEAR);
        validity=false;
        if (numCadena.equals(year)){
            validity=true;
        }
        
        return validity;
    }
    /**
     * 
     * @return 
     */
    public String getSerial_mecanical() {
        return serial_mecanical;
    }
    /**
     * 
     * @param serial_mecanical 
     */
    public void setSerial_mecanical(String serial_mecanical) {
        this.serial_mecanical = serial_mecanical;
    }
    /**
     * 
     * @return 
     */    
    public double getGas_level() {
        return this.gas_level;
    }

    /**
     * 
     * @param gas_level
     */
    public void setGas_level(double gas_level) {
	this.gas_level = gas_level;
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Mecanical{" + "gas_level=" + gas_level + ", serial_mecanical=" + serial_mecanical + ", validity=" + validity + '}';
    }

    
    
    
        

}
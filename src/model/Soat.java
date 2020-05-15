package model;
import  java.time.LocalDate;
public class Soat extends Documents {
        public int YEAR=LocalDate.now().getYear();
	private double coverage_amount;
        private String serial_mecanical;
        private boolean validity;
        
    /**
     * 
     * @param coverage_amount
     * @param price
     * @param year
     * @param image_code
     * @param matrizImg 
     */
    public Soat(double coverage_amount, double price, String year, int image_code, int[][] matrizImg) {
        super(price, year, image_code, matrizImg);
        this.coverage_amount = coverage_amount;
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
        
        for (int y=0;y<6;y++){
            num_Macanical="-"+matrizImg[y][0]+"-";
            num2_Macanical="-"+matrizImg[6][y]+"-";
        }
        
        serial_mecanical=num_Macanical+num2_Macanical;
        
        return serial_mecanical;
    } 
    /**
     * 
     * @param year
     * @param validity
     * @return 
     */
    public boolean SOAT_espeired(String year,boolean validity){
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
    public double getCoverage_amount() {
	return this.coverage_amount;
    }

    /**
     * 
     * @param coverage_amount
     */
    public void setCoverage_amount(double coverage_amount) {
    	this.coverage_amount = coverage_amount;
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Soat{" + "coverage_amount=" + coverage_amount + ", serial_mecanical=" + serial_mecanical + ", validity=" + validity + '}';
    }

    
    

}
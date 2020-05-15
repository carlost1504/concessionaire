package model;
import java.util.Arrays;
import java.util.Random;
public abstract class Documents  {

	private double price;
	private String year;
	private int image_code;
        int[][] matrizImg; 
    /**
     * 
     * @param price
     * @param year
     * @param image_code
     * @param matrizImg 
     */
    public Documents(double price, String year, int image_code, int[][] matrizImg) {
        this.price = price;
        this.year = year;
        this.image_code = image_code;
        this.matrizImg = matrizImg;
        matrizImg=new int[7][7];
    }

    
    
    /**
     * 
     * @param matrizImg
     * @return 
     */
    public int[][] documenc_imag(int[][] matrizImg){
        this.matrizImg=matrizImg;
        Random r=new Random();
        for (int x=0;x<6;x++){
            for(int y=0;y<6;y++){
                matrizImg[x][y]=r.nextInt(99);
            }
        }
        return matrizImg;
    }
    /**
     * 
     * @return 
     */
    public int[][] getMatrizImg() {
        return matrizImg;
    }
    /**
     * 
     * @param matrizImg 
     */
    public void setMatrizImg(int[][] matrizImg) {
        this.matrizImg = matrizImg;
        
    }
    /**
     * 
     * @return 
     */
    public double getPrice() {
        return price;
    }
    /**
     * 
     * @param price 
     */
    public void setPrice(double price) {
        this.price = price;
    }
    /**
     * 
     * @return 
     */
    public String getYear() {
        return year;
    }
    /**
     * 
     * @param year 
     */
    public void setYear(String year) {
        this.year = year;
    }
    /**
     * 
     * @return 
     */
    public int getImage_code() {
        return image_code;
    }
    /**
     * 
     * @param image_code 
     */
    public void setImage_code(int image_code) {
        this.image_code = image_code;
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        
        return "Documents{" + "price=" + price + ", year=" + year + ", matrizImg=" + Arrays.toString(matrizImg) + '}';
    }
    
    
    
        
    
         
        
}